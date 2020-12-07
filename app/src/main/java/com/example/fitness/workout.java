package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

public class workout extends AppCompatActivity {

    TextView titlepage,subtitlepage,intropage,subintropage,btnexercise,
             fitonetitle,fitonedesc,fittwotitle,fittwodesc,fittreetitle,fittreedesc,
            fitfourtitle,fitfourdesc;
    Animation bttone,btttwo,bttfour;

    View divpage,bgprogress;

    LinearLayout fitone,fittwo,fitthree,fitfour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        //Animation
        bttone= AnimationUtils.loadAnimation(this,R.anim.bttone);
        btttwo= AnimationUtils.loadAnimation(this,R.anim.btttwo);
        bttfour= AnimationUtils.loadAnimation(this,R.anim.bttfour);


        titlepage=(TextView)findViewById(R.id.titlepage);
        subtitlepage=(TextView)findViewById(R.id.subtitlepage);
        intropage=(TextView)findViewById(R.id.intropage);
        subintropage=(TextView)findViewById(R.id.subintropage);
        btnexercise=(TextView)findViewById(R.id.btnexercise);
        divpage=(View)findViewById(R.id.divpage);
        bgprogress=(View)findViewById(R.id.bgprogress);


        btnexercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a= new Intent(workout.this,Startworkout.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

        //hareketler
        fitonetitle=(TextView)findViewById(R.id.fitonetitle);
        fitonedesc=(TextView)findViewById(R.id.fitonedesc);
        fittwotitle=(TextView)findViewById(R.id.fittwotitle);
        fittwodesc=(TextView)findViewById(R.id.fittwodesc);
        fittreetitle=(TextView)findViewById(R.id.fittreetitle);
        fittreedesc=(TextView)findViewById(R.id.fittreedesc);
        fitfourtitle=(TextView)findViewById(R.id.fitfourtitle);
        fitfourdesc=(TextView)findViewById(R.id.fitfourdesc);

        //linear L
        fitone=(LinearLayout)findViewById(R.id.fitone);
        fittwo=(LinearLayout)findViewById(R.id.fittwo);
        fitthree=(LinearLayout)findViewById(R.id.fitthree);
        fitfour=(LinearLayout)findViewById(R.id.fitfour);

        //assing the animation
        titlepage.startAnimation(btttwo);
        subtitlepage.startAnimation(btttwo);
        divpage.startAnimation(btttwo);
        intropage.startAnimation(btttwo);
        subintropage.startAnimation(btttwo);

        fitone.startAnimation(btttwo);
        fittwo.startAnimation(btttwo);
        fitthree.startAnimation(btttwo);
        fitfour.startAnimation(btttwo);

        btnexercise.startAnimation(btttwo);
        bgprogress.startAnimation(btttwo);



    }
}