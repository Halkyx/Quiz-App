package com.example.thegreatestquizzever;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.thegreatestquizzever.databinding.ActivityResultBinding;
import com.example.thegreatestquizzever.databinding.FragmentDifficultiesBinding;
import com.example.thegreatestquizzever.databinding.FragmentResultBinding;

public class ResultFragment extends Fragment implements View.OnClickListener{

    FragmentResultBinding binding;
    static int score = 0;
    static int totalQuestion = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentResultBinding.inflate(inflater, container, false);

        // get play data sent from play activity
        score = getActivity().getIntent().getIntExtra("Score", 0);
        totalQuestion = getActivity().getIntent().getIntExtra("TotalQuestion", 0);

        // update the text of total score
        binding.point.setText(String.valueOf(score) + "/" + String.valueOf(totalQuestion));

        // manage on click event
        binding.retryBtn.setOnClickListener(this);
        binding.menuBtn.setOnClickListener(this);
        binding.shareBtn.setOnClickListener(this);
        return binding.getRoot();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.retry_btn:
                // take player back to category fragment
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.replace(R.id.frame_layout, new Categories()).commit();
            break;
            case R.id.menu_btn:
                Intent intent = new Intent(getActivity().getBaseContext(), MainActivity.class);
                getActivity().startActivity(intent);
            break;
            case R.id.share_btn:
                Intent sendIntent = new Intent();
                String cate = getActivity().getIntent().getStringExtra("Category");
                String diff = getActivity().getIntent().getStringExtra("Diff");
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "Let's see if you can beat me!!!\n" + "I scored "+ String.valueOf(score) + "/" + String.valueOf(totalQuestion) + " on " + cate + " with " + diff + " difficulty");
                sendIntent.setType("text/plain");
                Intent shareIntent = Intent.createChooser(sendIntent, null);
                startActivity(shareIntent);
            break;
        }
    }
}