package com.example.thegreatestquizzever;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.thegreatestquizzever.databinding.FragmentPlayBinding;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class PlayFragment extends Fragment {

    String Cate;
    String Diff;
    FragmentPlayBinding binding;
    private ArrayList<Question> questionList;
    private int questionIndex;
    private int score;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding =FragmentPlayBinding.inflate(inflater, container, false);

        getParentFragmentManager().setFragmentResultListener("Diff", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                Diff = result.getString("Diff");
                Cate = result.getString("Category");
            }
        });
        binding.Cate.setText(Cate);
        binding.Diff.setText(Diff);
        getQuestionList();
        onClickAnswer();
        return binding.getRoot();
    }

    private void onClickAnswer() {
        binding.trueBtn.setOnClickListener(view -> {
            checkAnswer(true);
        });
        binding.falseBtn.setOnClickListener(view -> {
            checkAnswer(false);
        });
    }

    private void getQuestionList() {
        questionList = new ArrayList<>();
        questionList = QuestionBank.getQuestionList(Cate, Diff);
        setQuestionList();
    }
    private void setQuestionList() {
        binding.questionView.setText(questionList.get(questionIndex).getQuestion());
        binding.progressBar.setProgress(0);
        binding.progressBar.setMax(questionList.size());
        score = 0;
    }
    private void checkAnswer(Boolean userAnswer) {
        if (questionList.get(questionIndex).getQuestionAnswer() == userAnswer) {
            score++;
        }
        updateQuestionText();
    }
    private void updateQuestionText() {
        if(questionIndex < questionList.size() - 1) {
            questionIndex++;
            binding.progressBar.setProgress(questionIndex);
        }
        else {
            String correctAnsws = String.valueOf(score) + "/" + String.valueOf(questionList.size());
            String date = getDate();
            ScoreTableItem item = new ScoreTableItem(correctAnsws, Cate, Diff, date);
            ScoreTable.addScoreItem(item);
            Intent intent = new Intent(getActivity().getBaseContext(), ResultActivity.class);
            intent.putExtra("Score", score);
            intent.putExtra("TotalQuestion", questionList.size());
            startActivity(intent);
        }
        binding.questionView.setText(questionList.get(questionIndex).getQuestion());
    }

    private String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String date = sdf.format(new Date());
        return date;
    }
}