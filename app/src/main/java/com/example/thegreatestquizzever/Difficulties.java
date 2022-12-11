package com.example.thegreatestquizzever;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavDirections;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.thegreatestquizzever.databinding.FragmentCategoriesBinding;
import com.example.thegreatestquizzever.databinding.FragmentDifficultiesBinding;

public class Difficulties extends Fragment implements View.OnClickListener{

    private FragmentDifficultiesBinding binding;
    private int chosenCate;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDifficultiesBinding.inflate(inflater, container, false);
        getParentFragmentManager().setFragmentResultListener("Category", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                chosenCate = result.getInt("Category");
            }
        });
        binding.easyBtn.setOnClickListener(this);
        binding.normalBtn.setOnClickListener(this);
        binding.hardBtn.setOnClickListener(this);
        return binding.getRoot();
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.easy_btn:
                sendDiffData(1);
                break;

            case R.id.normal_btn:
                sendDiffData(2);
                break;

            case R.id.hard_btn:
                sendDiffData(3);
                break;
        }

    }
    private void sendDiffData(int difficulty) {
        Intent intent = new Intent(getActivity().getBaseContext(), PlayActivity.class);
        intent.putExtra("Category", chosenCate);
        intent.putExtra("Diff", difficulty);
        getActivity().startActivity(intent);
    }
}