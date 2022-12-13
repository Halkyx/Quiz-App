package com.example.thegreatestquizzever;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.example.thegreatestquizzever.databinding.ActivityPlayBinding;
import com.example.thegreatestquizzever.databinding.ActivityResultBinding;


// mostly the same as main activity
public class ResultActivity extends AppCompatActivity{

    ActivityResultBinding binding;

    private void replaceFragment (Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.top_nav_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Credit:
                replaceFragment(new Credit());
                break;
            case R.id.Feedback:
                String email = "vutuankiet1609@gmail.com, tcmanh2002@gmail.com";
                String[] addresses = email.split(",");
                String version = getAndroidVersion();

                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, addresses);
                intent.putExtra(Intent.EXTRA_SUBJECT, "Your feed back: " + version);
                startActivity(intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public String getAndroidVersion() {
        String release = Build.VERSION.RELEASE;
        int sdkVersion = Build.VERSION.SDK_INT;
        return "Android SDK: " + sdkVersion + " (" + release +")";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new ResultFragment());
        binding.bottomMenu.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.Home:
                    replaceFragment(new MainMenu());
                    break;

                case R.id.Score:
                    replaceFragment(new ScoreTable());
                    break;
            }
            return true;
        });
    }
}