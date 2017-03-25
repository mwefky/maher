package com.example.wefky.myapplication;

import android.app.Dialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Prealative extends AppCompatActivity {
    EditText ename,enumb;
    Button ad;
    Button viw;
    String rn,rnu;
    DBhandler db = new DBhandler(this);
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prealative);
        ename=(EditText)findViewById(R.id.rname);
        enumb=(EditText)findViewById(R.id.rnumber);
        ad=(Button)findViewById(R.id.add);
        viw=(Button)findViewById(R.id.view);
        ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 rn =ename.getText().toString();
                 rnu=enumb.getText().toString();
                ContactList contactList=new ContactList();
                contactList.setName(rn);
                contactList.setPhoNum(rnu);
                db.addContact(contactList);
            }
        });
    }
    public void goo(View view){
        Intent intent=new Intent(this,ViewRelative.class);
        startActivity(intent);
    }
}
