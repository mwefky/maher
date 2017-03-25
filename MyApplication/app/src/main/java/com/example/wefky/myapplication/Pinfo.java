package com.example.wefky.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Pinfo extends AppCompatActivity {
    private EditText hr,bp,cv,in,ot,ab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pinfo);
        hr=(EditText)findViewById(R.id.hrate);
        bp=(EditText)findViewById(R.id.bres);
        cv=(EditText)findViewById(R.id.cvp);
        in=(EditText)findViewById(R.id.in);
        ot=(EditText)findViewById(R.id.out);
        ab=(EditText)findViewById(R.id.ab);

    }
    public void addDay(View view){
        String h,b,c,i,o,a;
        int d;
        switch (view.getId()){
            case R.id.d1:
                d=1;
                h=hr.getText().toString();
                b=bp.getText().toString();
                c=cv.getText().toString();
                i=in.getText().toString();
                o=ot.getText().toString();
                a=ab.getText().toString();
                Info info=new Info(d,h,b,c,i,o,a);
                break;
            case R.id.d2:
                d=2;
                h=hr.getText().toString();
                b=bp.getText().toString();
                c=cv.getText().toString();
                i=in.getText().toString();
                o=ot.getText().toString();
                a=ab.getText().toString();
                Info info1=new Info(d,h,b,c,i,o,a);
                break;
            case R.id.d3:
                d=3;
                h=hr.getText().toString();
                b=bp.getText().toString();
                c=cv.getText().toString();
                i=in.getText().toString();
                o=ot.getText().toString();
                a=ab.getText().toString();
                Info info2=new Info(d,h,b,c,i,o,a);
                break;
            case R.id.d4:
                d=4;
                h=hr.getText().toString();
                b=bp.getText().toString();
                c=cv.getText().toString();
                i=in.getText().toString();
                o=ot.getText().toString();
                a=ab.getText().toString();
                Info info3=new Info(d,h,b,c,i,o,a);
                break;
            case R.id.d5:
                d=5;
                h=hr.getText().toString();
                b=bp.getText().toString();
                c=cv.getText().toString();
                i=in.getText().toString();
                o=ot.getText().toString();
                a=ab.getText().toString();
                Info info4=new Info(d,h,b,c,i,o,a);
                break;
            case R.id.d6:
                d=6;
                h=hr.getText().toString();
                b=bp.getText().toString();
                c=cv.getText().toString();
                i=in.getText().toString();
                o=ot.getText().toString();
                a=ab.getText().toString();
                Info info5=new Info(d,h,b,c,i,o,a);
                break;
            case R.id.d7:
                d=7;
                h=hr.getText().toString();
                b=bp.getText().toString();
                c=cv.getText().toString();
                i=in.getText().toString();
                o=ot.getText().toString();
                a=ab.getText().toString();
                Info info6=new Info(d,h,b,c,i,o,a);
                break;
            case R.id.showinfos:
                Intent intent=new Intent(this,ShowInfo.class);
                startActivity(intent);
        }
    }
}
