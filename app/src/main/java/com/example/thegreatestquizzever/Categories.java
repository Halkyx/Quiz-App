package com.example.thegreatestquizzever;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.thegreatestquizzever.databinding.FragmentCategoriesBinding;
import com.example.thegreatestquizzever.databinding.FragmentMainMenuBinding;

public class Categories extends Fragment implements View.OnClickListener {

    private FragmentCategoriesBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCategoriesBinding.inflate(inflater, container, false);
        binding.history.setOnClickListener(this);
        binding.music.setOnClickListener(this);
        binding.sci.setOnClickListener(this);
        binding.game.setOnClickListener(this);
        binding.maths.setOnClickListener(this);
        binding.sports.setOnClickListener(this);
        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.history:
                sendCategoryData("History");
                break;
            case R.id.music:
                sendCategoryData("Music");
                break;
            case R.id.sci:
                sendCategoryData("Science");
                break;
            case R.id.game:
                sendCategoryData("Game");
                break;
            case R.id.maths:
                sendCategoryData("Maths");
                break;
            case R.id.sports:
                sendCategoryData("Sport");
                break;
        }
    }
    private void sendCategoryData(String data) {
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.replace(R.id.frame_layout, new Difficulties()).commit();
        Bundle result = new Bundle();
        result.putString("Category", data);
        getParentFragmentManager().setFragmentResult("Category", result);
    }
}