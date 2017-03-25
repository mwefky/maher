package com.example.wefky.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class paindegree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paindegree);
    }
    public void degreeswr(View  view){
        Intent intent=new Intent(this,degreswr.class);
        startActivity(intent);
    }
    public void degreegomal(View  view){
        Intent intent=new Intent(this,degregomal.class);
        startActivity(intent);
    }
}
