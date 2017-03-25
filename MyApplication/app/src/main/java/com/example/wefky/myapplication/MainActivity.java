package com.example.wefky.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void Needs(View view){
        Intent in=new Intent(this,PatienttNeeds.class);
        startActivity(in);
    }
    public void sho3oor(View view){
        Intent inn=new Intent(this,painmiddle.class);
        startActivity(inn);
    }
    public void prletive(View view){
        Intent intent=new Intent(this,Prealative.class);
        startActivity(intent);
    }
    public void painfull(View view){
        Intent intent=new Intent(this,paindegree.class);
        startActivity(intent);
    }
    public void in(View view){
        Intent intent=new Intent(this,Pinfo.class);
        startActivity(intent);
    }
}
