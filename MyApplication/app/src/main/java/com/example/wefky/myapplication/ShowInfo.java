package com.example.wefky.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ShowInfo extends AppCompatActivity {
    private TextView hr, bp, cv, in, ot, ab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_info);
        hr = (TextView) findViewById(R.id.hr);
        bp = (TextView) findViewById(R.id.bp);
        cv = (TextView) findViewById(R.id.cv);
        in = (TextView) findViewById(R.id.in);
        ot = (TextView) findViewById(R.id.ot);
        ab = (TextView) findViewById(R.id.ab);
    }

    public void pshow(View view) {
        switch (view.getId()) {
            case R.id.dy1:
                showme(1);
                break;
            case R.id.dy2:
                showme(2);
                break;
            case R.id.dy3:
                showme(3);
                break;
            case R.id.dy4:
                showme(4);
                break;
            case R.id.dy5:
                showme(5);
                break;
            case R.id.dy6:
                showme(6);
                break;
            case R.id.dy7:
                showme(7);
                break;

        }
    }

    public void showme(int id) {
        dbinfo Dbinfo = new dbinfo(this);
        Info info = Dbinfo.getinfo(id);
        hr.setText(info.getHeartrate());
        bp.setText(info.getBloodpressure());
        cv.setText(info.getCvp());
        in.setText(info.getInput());
        ot.setText(info.getOutput());
        ab.setText(info.getAbnormal());
    }
}
