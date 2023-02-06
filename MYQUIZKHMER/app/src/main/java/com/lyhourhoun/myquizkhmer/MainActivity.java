package com.lyhourhoun.myquizkhmer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private String selectedTopicName = "";


    private Button startQuizBtn;

    private MediaPlayer mediaPlayer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar()!=null){
            getSupportActionBar().hide();
        }


        mediaPlayer = MediaPlayer.create(this,R.raw.sound);


        startQuizBtn= findViewById(R.id.startQuizBtn);
        mediaPlayer.start();



        final LinearLayout ប្រវត្តិវិទ្យា = findViewById(R.id.ប្រវត្តិវិទ្យា);
        final LinearLayout ភូមិវិទ្យា = findViewById(R.id.ភូមិវិទ្យា);
        final LinearLayout ផែនដីវិទ្យា = findViewById(R.id.ផែនដីវិទ្យា);
        final LinearLayout ចំណេះដឹងទូទៅ = findViewById(R.id.ចំណេះដឹងទូទៅ);

        final Button startBtn = findViewById(R.id.startQuizBtn);

        ប្រវត្តិវិទ្យា.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               selectedTopicName = "ប្រវត្តិវិទ្យា";

                ប្រវត្តិវិទ្យា.setBackgroundResource(R.drawable.round_back_white_stroke10);

                ភូមិវិទ្យា.setBackgroundResource(R.drawable.bluecolor12);
                ផែនដីវិទ្យា.setBackgroundResource(R.drawable.bluecolor13);
                ចំណេះដឹងទូទៅ.setBackgroundResource(R.drawable.yellowcolor11);
            }
        });

        ភូមិវិទ្យា.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName = "ភូមិវិទ្យា";

                ភូមិវិទ្យា.setBackgroundResource(R.drawable.round_back_white_stroke10);

                ប្រវត្តិវិទ្យា.setBackgroundResource(R.drawable.round_back_red10);
                ផែនដីវិទ្យា.setBackgroundResource(R.drawable.bluecolor13);
                ចំណេះដឹងទូទៅ.setBackgroundResource(R.drawable.yellowcolor11);
            }
        });

        ផែនដីវិទ្យា.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName = "ផែនដីវិទ្យា";

                ផែនដីវិទ្យា.setBackgroundResource(R.drawable.round_back_white_stroke10);

                ភូមិវិទ្យា.setBackgroundResource(R.drawable.bluecolor12);
                ប្រវត្តិវិទ្យា.setBackgroundResource(R.drawable.round_back_red10);
                ចំណេះដឹងទូទៅ.setBackgroundResource(R.drawable.yellowcolor11);
            }
        });

        ចំណេះដឹងទូទៅ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "ចំណេះដឹងទូទៅ";

                ចំណេះដឹងទូទៅ.setBackgroundResource(R.drawable.round_back_white_stroke10);

                ភូមិវិទ្យា.setBackgroundResource(R.drawable.bluecolor12);
                ផែនដីវិទ្យា.setBackgroundResource(R.drawable.bluecolor13);
                ប្រវត្តិវិទ្យា.setBackgroundResource(R.drawable.round_back_red10);
            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedTopicName.isEmpty()){
                    Toast.makeText(MainActivity.this,
                            "សូមជ្រើសរើសលើមុខវិជ្ជា",Toast.LENGTH_SHORT).show();
                }

                else{

                    Intent intent = new
                            Intent(MainActivity.this, QuizActivity.class);
                    intent.putExtra("selectedTopic",selectedTopicName);
                    startActivity(intent);
                }
            }
        });
    }
}