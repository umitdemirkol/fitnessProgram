package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class change extends AppCompatActivity {

    Button mekik,sınav,plank,koşu;
    FragmentManager fragmentManager =getSupportFragmentManager();
    FragmentTransaction transaction=fragmentManager.beginTransaction();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change);

        mekik=(Button)findViewById(R.id.Mekik);
        sınav=(Button)findViewById(R.id.sınav);
        plank=(Button)findViewById(R.id.plank);
        koşu=(Button)findViewById(R.id.koşu);

        final fragmen1 fragmen1=new fragmen1();
        final  fragment2 fragment2=new fragment2();

        //transaction= transaction.add(R.id.layoutfragment);
        //transaction=transaction.add(R.id.fragment2);

        mekik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a= new Intent(change.this,fragmen1.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });
        sınav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a= new Intent(change.this,fragment2.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });



    }
}