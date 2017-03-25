package com.example.wefky.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class painmiddle extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_painmiddle);
    }
   public void sho3orsewar(View view){
        Intent inn=new Intent(this,patientfeelingSowar.class);
        startActivity(inn);
    }
    public void sho3orgomal(View view){
        Intent inn=new Intent(this,patientfeelingGomal.class);
        startActivity(inn);
    }
}
