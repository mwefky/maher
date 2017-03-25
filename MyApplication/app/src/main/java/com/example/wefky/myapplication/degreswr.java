package com.example.wefky.myapplication;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Locale;

public class degreswr extends AppCompatActivity {
    TextToSpeech ttsObj;
    int cheeck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_degreswr);
        ttsObj = new TextToSpeech(degreswr.this, new TextToSpeech.OnInitListener() {
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
    public void act(View view) {
        switch (view.getId()) {
            case R.id.terablepain_image:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "feature not supported on your device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("horible paine", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id.nopain_image:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "feature not supported on your device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("no pain", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id.somepain_image:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "feature not supported on your device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("some pain", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id.hardpain_image:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "feature not supported on your device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("hard pain", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id.strong_image:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "feature not supported on your device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("strong pain", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
        }
    }
}
