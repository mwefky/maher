package com.example.wefky.myapplication;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Locale;

public class patientfeelingSowar extends AppCompatActivity {
    TextToSpeech ttsObj;
    int cheeck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patientfeeling_sowar);
        ttsObj = new TextToSpeech(patientfeelingSowar.this, new TextToSpeech.OnInitListener() {
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

    public void sowartalk(View view) {
        switch (view.getId()) {
            case R.id.image_thresty:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "feature not supported on your device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("I am thresty", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id.image_hungry:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "feature not supported on your device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("i am hungry", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id.image_feelgood:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "feature not supported on your device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("I good ", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id.image_feeldezy:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "feature not supported on your device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("I am dizzy ", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id.image_feelsad:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "feature not supported on your device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("I am sad ", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id.image_feelbad:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "feature not supported on your device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("i feel bad ", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id.image_feelfear:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "feature not supported on your device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("I feel fear", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id.image_feele5tna2:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "feature not supported on your device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("I so throttled", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id.image_feeldesp:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "feature not supported on your device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("I am Depressed", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id.image_feelcold:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "feature not supported on your device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("I feel cold", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id. image_feelconfused:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "feature not supported on your device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("I am confused", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id. image_feelhigh_temp:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "feature not supported on your device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("I feel fever", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;

        }
    }
}
