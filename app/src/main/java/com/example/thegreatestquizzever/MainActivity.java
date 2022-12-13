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

import com.example.thegreatestquizzever.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    // function created to navigate from fragment to fragment
    private void replaceFragment (Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // put the first fragment in
        replaceFragment(new MainMenu());

        //// manage on click event in the bottom menu
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

    // create option menu on top right of the screen
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.top_nav_menu, menu);
        return true;
    }

    // manage on click event for items in top menu
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
}