package com.example.thegreatestquizzever;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thegreatestquizzever.databinding.ScoreTallyBinding;

import java.util.ArrayList;

public class ScoreAdapter extends RecyclerView.Adapter<ScoreAdapter.ScoreViewHolder> {
    private ArrayList<ScoreTableItem> scoreTally;

    public ScoreAdapter(ArrayList<ScoreTableItem> scoreTally){
        this.scoreTally = scoreTally;
    }

    @NonNull
    @Override
    public ScoreViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ScoreTallyBinding binding = ScoreTallyBinding.inflate(inflater, parent, false);
        return new ScoreViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ScoreViewHolder holder, int position) {
        ScoreTableItem score = scoreTally.get(position);
        if (score == null)
            return;

        // update text
        holder.binding.cateTextView.setText(score.topicName);
        holder.binding.scoreTextView.setText(score.score);
        holder.binding.diffTextView.setText(score.level);
        holder.binding.dateTextView.setText(score.date);
    }

    @Override
    public int getItemCount() {
        return scoreTally.size();
    }

    public class ScoreViewHolder extends RecyclerView.ViewHolder {
        ScoreTallyBinding binding;

        public ScoreViewHolder(ScoreTallyBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
