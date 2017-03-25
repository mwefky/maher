package com.example.wefky.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PatienttNeeds extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patientt_needs);
    }
    public void sewar(View view){
        Intent inn=new Intent(this,ImageTOspeech.class);
        startActivity(inn);
    }
    public void gomal(View view){
        Intent inn=new Intent(this,textTospeech.class);
        startActivity(inn);
    }
}
