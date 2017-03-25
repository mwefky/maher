package com.example.wefky.myapplication;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Locale;

public class degregomal extends AppCompatActivity {
    TextToSpeech ttsObj;
    int cheeck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_degregomal);
        ttsObj = new TextToSpeech(degregomal.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    cheeck = ttsObj.setLanguage(Locale.UK);
                } else {
                    Toast.makeText(getApplicationContext(), "feature not supported on your device", Toast.LENGTH_SHORT).show();
                }
            }
        }
        );
    }
    public void ac(View view) {
        switch (view.getId()) {
            case R.id.pain_hardpain:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "feature not supported on your device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("horrible pain", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id.pain_nopain:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "feature not supported on your device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("no pain", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id.pain_somepain:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "feature not supported on your device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("some pain", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id.pain_simplepain:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "feature not supported on your device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("simple pain", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id.pain_strongpain:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "feature not supported on your device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("hard pain", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
        }
    }
}
