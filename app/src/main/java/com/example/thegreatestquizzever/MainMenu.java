package com.example.thegreatestquizzever;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.thegreatestquizzever.databinding.FragmentMainMenuBinding;

public class MainMenu extends Fragment implements View.OnClickListener{

    private FragmentMainMenuBinding binding;

    // function created to navigate from fragment to fragment
    private void replaceFragment (Fragment fragment) {
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainMenuBinding.inflate(inflater, container, false);

        // manage on click event
        binding.play.setOnClickListener(this);
        binding.scores.setOnClickListener(this);
        binding.credit.setOnClickListener(this);

        return binding.getRoot();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.play:
                replaceFragment(new Categories());
                break;
            case R.id.scores:
                replaceFragment(new ScoreTable());
                break;
            case R.id.credit:
                replaceFragment(new Credit());
                break;

        }
    }
}