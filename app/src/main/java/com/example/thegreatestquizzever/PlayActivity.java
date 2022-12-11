package com.example.thegreatestquizzever;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import android.content.Intent;

import com.example.thegreatestquizzever.databinding.ActivityPlayBinding;

public class PlayActivity extends AppCompatActivity {

    ActivityPlayBinding binding;
//    private String Cate;
//    private String Diff;
    private ArrayList<Question> questionList;
    private int questionIndex;
    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPlayBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        binding.Cate.setText(Cate);
//        binding.Diff.setText(Diff);
        getQuestionList();
        onClickAnswer();
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
        String Cate = getIntent().getStringExtra("Category");
        String Diff= getIntent().getStringExtra("Diff");
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
            String Cate = getIntent().getStringExtra("Category");
            String Diff= getIntent().getStringExtra("Diff");
            ScoreTableItem item = new ScoreTableItem(correctAnsws, Cate, Diff, date);
            ScoreTable.addScoreItem(item);
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("Score", score);
            intent.putExtra("TotalQuestion", questionList.size());
            startActivity(intent);
            finish();
        }
        binding.questionView.setText(questionList.get(questionIndex).getQuestion());
    }

    private String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String date = sdf.format(new Date());
        return date;
    }
}