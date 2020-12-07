package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Startworkout extends AppCompatActivity {

    TextView intropage,subintropage,btnexercise,fitonetitle,fitonedesc,timervalue;

    private static final long START_TIME_IN_MILLIS=900000;
    private CountDownTimer coutdowntimer;
    private boolean mTimerRunning;
    private long  mTimeLeftInMillis =START_TIME_IN_MILLIS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startworkout);

        intropage=(TextView)findViewById(R.id.intropage);
        subintropage=(TextView)findViewById(R.id.subintropage);
        btnexercise=(TextView)findViewById(R.id.btnexercise);
        fitonetitle=(TextView)findViewById(R.id.fitonetitle);
        fitonedesc=(TextView)findViewById(R.id.fitonedesc);
        timervalue=(TextView)findViewById(R.id.timerValue);

        startTimer();
    }
    private void startTimer (){
        coutdowntimer= new CountDownTimer(mTimeLeftInMillis,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis =millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                Toast.makeText(getApplicationContext(),"Congratulations!",Toast.LENGTH_SHORT).show();
            }
        }.start();
        mTimerRunning = true;


    }
    private void updateCountDownText(){
        int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
        int seconds = (int) (mTimeLeftInMillis / 1000) % 60;

        String timeLeft =String.format(Locale.getDefault(),"%02d:%02d",minutes,seconds);
        timervalue.setText(timeLeft);


    }

}