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
    private String chosenCate;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDifficultiesBinding.inflate(inflater, container, false);
        getParentFragmentManager().setFragmentResultListener("Category", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                chosenCate = result.getString("Category");
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
                sendDiffData("Easy");
                break;

            case R.id.normal_btn:
                sendDiffData("Normal");
                break;

            case R.id.hard_btn:
                sendDiffData("Hard");
                break;
        }

    }
    private void sendDiffData(String difficulty) {
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.replace(R.id.frame_layout, new PlayFragment()).commit();
        Bundle result = new Bundle();
        result.putString("Diff", difficulty);
        result.putString("Category", chosenCate);
        getParentFragmentManager().setFragmentResult("Diff", result);
    }
}