package com.example.wefky.myapplication;
import android.speech.tts.TextToSpeech;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import java.util.Locale;

public class patientfeelingGomal extends AppCompatActivity {
    int cheeck;
    TextToSpeech ttsObj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patientfeeling_gomal);
        ttsObj=new TextToSpeech(patientfeelingGomal.this,new TextToSpeech.OnInitListener(){
            @Override
            public void onInit(int status) {
                if (status==TextToSpeech.SUCCESS){
                    cheeck=  ttsObj.setLanguage(Locale.UK);
                }
                else {
                    Toast.makeText(getApplicationContext(),"feature not supported on your device",Toast.LENGTH_SHORT).show();}

            }
        }

        );
    }
    public void gomaltalk(View view){
        switch (view.getId()){
            case R.id.feelgomal_bad:
                if(cheeck==TextToSpeech.LANG_NOT_SUPPORTED||cheeck==TextToSpeech.LANG_MISSING_DATA)
                {
                    Toast.makeText(getApplicationContext(),"feature not supported on your device",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ttsObj.speak("I feel bad",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            case R.id.feelgomal_concentration:
                if(cheeck==TextToSpeech.LANG_NOT_SUPPORTED||cheeck==TextToSpeech.LANG_MISSING_DATA)
                {
                    Toast.makeText(getApplicationContext(),"feature not supported on your device",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ttsObj.speak("i am not concentrated ",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            case R.id.feelgomal_depression:
                if(cheeck==TextToSpeech.LANG_NOT_SUPPORTED||cheeck==TextToSpeech.LANG_MISSING_DATA)
                {
                    Toast.makeText(getApplicationContext(),"feature not supported on your device",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ttsObj.speak("I feel depression ",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            case R.id.feelgomal_good:
                if(cheeck==TextToSpeech.LANG_NOT_SUPPORTED||cheeck==TextToSpeech.LANG_MISSING_DATA)
                {
                    Toast.makeText(getApplicationContext(),"feature not supported on your device",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ttsObj.speak("I feel good ",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            case R.id.feelgomal_hightemperature:
                if(cheeck==TextToSpeech.LANG_NOT_SUPPORTED||cheeck==TextToSpeech.LANG_MISSING_DATA)
                {
                    Toast.makeText(getApplicationContext(),"feature not supported on your device",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ttsObj.speak("I feel Fever ",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            case R.id.feelgomal_hungry:
                if(cheeck==TextToSpeech.LANG_NOT_SUPPORTED||cheeck==TextToSpeech.LANG_MISSING_DATA)
                {
                    Toast.makeText(getApplicationContext(),"feature not supported on your device",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ttsObj.speak("i am hungry ",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            case R.id.feelgomal_rotation:
                if(cheeck==TextToSpeech.LANG_NOT_SUPPORTED||cheeck==TextToSpeech.LANG_MISSING_DATA)
                {
                    Toast.makeText(getApplicationContext(),"feature not supported on your device",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ttsObj.speak("I so dizzy",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            case R.id.feelgomal_sad:
                if(cheeck==TextToSpeech.LANG_NOT_SUPPORTED||cheeck==TextToSpeech.LANG_MISSING_DATA)
                {
                    Toast.makeText(getApplicationContext(),"feature not supported on your device",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ttsObj.speak("I feel so bad",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            case R.id.feelgomal_suffocated:
                if(cheeck==TextToSpeech.LANG_NOT_SUPPORTED||cheeck==TextToSpeech.LANG_MISSING_DATA)
                {
                    Toast.makeText(getApplicationContext(),"feature not supported on your device",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ttsObj.speak("I am suffocated",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            case R.id.feelgomal_thirsty:
                if(cheeck==TextToSpeech.LANG_NOT_SUPPORTED||cheeck==TextToSpeech.LANG_MISSING_DATA)
                {
                    Toast.makeText(getApplicationContext(),"feature not supported on your device",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ttsObj.speak("I am thirsty",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;

        }
    }
}
