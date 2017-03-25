package com.example.wefky.myapplication;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Locale;

public class textTospeech extends AppCompatActivity {
    TextToSpeech ttsObj;
    int cheeck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_tospeech);
        ttsObj = new TextToSpeech(textTospeech.this, new TextToSpeech.OnInitListener() {
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

    public void speak(View view) {
        switch (view.getId()) {

            case R.id.needgomall_text_freinds:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "Feature Not Supported on your Device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("I want to see my friends", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;

            case R.id.needgomall_text_shower:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "Feature Not Supported on your Device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("I need to take a shower ", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id.needgomall_text_peeDown:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "Feature Not Supported on your Device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("I need to shit ", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id.needgomall_nnn:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "Feature Not Supported on your Device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("I need to setdown ", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id.needgomall_button10:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "Feature Not Supported on your Device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("get the light up ", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id.needgomall_button12:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "Feature Not Supported on your Device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("i want to change my clothes ", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id.needgomall_button13:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "Feature Not Supported on your Device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("get my bed down ", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id.needgomall_button14:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "Feature Not Supported on your Device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("please, move me to right ", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id.needgomall_button15:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "Feature Not Supported on your Device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("please, move me to left ", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id.needgomall_button16:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "Feature Not Supported on your Device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("I need to see my family ", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id.needgomall_button17:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "Feature Not Supported on your Device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("please,tell me the time now ", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id.needgomall_button18:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "Feature Not Supported on your Device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("please, tell me the day ", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id.needgomall_button4:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "Feature Not Supported on your Device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("i want to sleep", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id.needgomall_button6:
                if (cheeck == TextToSpeech.LANG_NOT_SUPPORTED || cheeck == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(getApplicationContext(), "Feature Not Supported on your Device", Toast.LENGTH_SHORT).show();
                } else {
                    ttsObj.speak("please, get the light down ", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;


        }

    }
}
