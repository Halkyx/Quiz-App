package com.example.thegreatestquizzever;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.thegreatestquizzever.databinding.FragmentScoreTableBinding;

import java.util.ArrayList;

public class ScoreTable extends Fragment {

    FragmentScoreTableBinding binding;
    static ArrayList<ScoreTableItem> scoreTally = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentScoreTableBinding.inflate(inflater, container, false);
        binding.scoreFragment.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.scoreFragment.setAdapter(new ScoreAdapter(getScore()));
        return binding.getRoot();
    }

    private ArrayList<ScoreTableItem> getScore(){
        return scoreTally;
    }

    public static void addScoreItem(ScoreTableItem item){
        scoreTally.add(item);
    }
}