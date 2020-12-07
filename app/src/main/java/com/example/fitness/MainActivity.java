package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView titlepage,btnexercise,subtitlepage;
    ImageView imgpage;
    Animation animimgpage,bttone,btttwo,btttree,ltr;
    View bgprogress,bgprogresstop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          //load animate
        animimgpage= AnimationUtils.loadAnimation(this,R.anim.animimgpage);
        bttone= AnimationUtils.loadAnimation(this,R.anim.bttone);
        btttwo= AnimationUtils.loadAnimation(this,R.anim.btttwo);
        btttree= AnimationUtils.loadAnimation(this,R.anim.btttree);
        ltr= AnimationUtils.loadAnimation(this,R.anim.ltr);


        //Typeface mmligth =Typeface.createFromAsset(getAssets(),"font/mmligth.ttf");
        //Typeface vidaloka =Typeface.createFromAsset(getAssets(),"font/vidaloka.ttf");
        //Typeface mmedium =Typeface.createFromAsset(getAssets(),"font/mmedium.ttf");

        titlepage=(TextView)findViewById(R.id.titlepage);
        subtitlepage=(TextView)findViewById(R.id.subtitlepage);
        btnexercise=(TextView)findViewById(R.id.btnexercise);
        imgpage=(ImageView)findViewById(R.id.imagepage);
        bgprogress=(View)findViewById(R.id.bgprogress);
        bgprogresstop=(View)findViewById(R.id.bgprogresstop);



        //export animate
        imgpage.startAnimation(animimgpage);
        titlepage.startAnimation(bttone);
        subtitlepage.startAnimation(bttone);
        btnexercise.startAnimation(btttree);
        bgprogress.startAnimation(btttwo);
        bgprogresstop.startAnimation(ltr);

        btnexercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a= new Intent(MainActivity.this,workout.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });




    }
}