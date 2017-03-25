package com.example.wefky.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Toast;

import java.util.Locale;

public class ImageTOspeech extends AppCompatActivity {
    int cheeck;
    TextToSpeech ttsObj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_tospeech);
        ttsObj=new TextToSpeech(ImageTOspeech.this,new TextToSpeech.OnInitListener(){
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

   public void talk(View view){
        switch (view.getId()){
            case R.id.needsImage_doctor:
                if(cheeck==TextToSpeech.LANG_NOT_SUPPORTED||cheeck==TextToSpeech.LANG_MISSING_DATA)
                {
                    Toast.makeText(getApplicationContext(),"feature not supported on your device",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ttsObj.speak("I need  my doctor",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            case R.id.needsImage_bedDown:
                if(cheeck==TextToSpeech.LANG_NOT_SUPPORTED||cheeck==TextToSpeech.LANG_MISSING_DATA)
                {
                    Toast.makeText(getApplicationContext(),"feature not supported on your device",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ttsObj.speak("please,get my bed down ",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            case R.id.needsImage_changeClothes:
                if(cheeck==TextToSpeech.LANG_NOT_SUPPORTED||cheeck==TextToSpeech.LANG_MISSING_DATA)
                {
                    Toast.makeText(getApplicationContext(),"feature not supported on your device",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ttsObj.speak("I Want to change my clothes",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            case R.id.needsImage_lightDown:
                if(cheeck==TextToSpeech.LANG_NOT_SUPPORTED||cheeck==TextToSpeech.LANG_MISSING_DATA)
                {
                    Toast.makeText(getApplicationContext(),"feature not supported on your device",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ttsObj.speak("please, switch off the light",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            case R.id.needsImage_nurse:
                if(cheeck==TextToSpeech.LANG_NOT_SUPPORTED||cheeck==TextToSpeech.LANG_MISSING_DATA)
                {
                    Toast.makeText(getApplicationContext(),"feature not supported on your device",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ttsObj.speak("I need  nurse now",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            case R.id.needsImage_peeDown:
                if(cheeck==TextToSpeech.LANG_NOT_SUPPORTED||cheeck==TextToSpeech.LANG_MISSING_DATA)
                {
                    Toast.makeText(getApplicationContext(),"feature not supported on your device",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ttsObj.speak("I Want to shit ",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            case R.id.needsImage_peeUp:
                if(cheeck==TextToSpeech.LANG_NOT_SUPPORTED||cheeck==TextToSpeech.LANG_MISSING_DATA)
                {
                    Toast.makeText(getApplicationContext(),"feature not supported on your device",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ttsObj.speak("I Want to pee",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            case R.id.showr:
                if(cheeck==TextToSpeech.LANG_NOT_SUPPORTED||cheeck==TextToSpeech.LANG_MISSING_DATA)
                {
                    Toast.makeText(getApplicationContext(),"feature not supported on your device",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ttsObj.speak("I Want to take a shawar ",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            case R.id.needsImage_sleep:
                if(cheeck==TextToSpeech.LANG_NOT_SUPPORTED||cheeck==TextToSpeech.LANG_MISSING_DATA)
                {
                    Toast.makeText(getApplicationContext(),"feature not supported on your device",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ttsObj.speak("I Want sleep pleease",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            case R.id.needsImage_chair:
                if(cheeck==TextToSpeech.LANG_NOT_SUPPORTED||cheeck==TextToSpeech.LANG_MISSING_DATA)
                {
                    Toast.makeText(getApplicationContext(),"feature not supported on your device",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ttsObj.speak("I need a chair",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            case R.id.needsImage_daay:
                if(cheeck==TextToSpeech.LANG_NOT_SUPPORTED||cheeck==TextToSpeech.LANG_MISSING_DATA)
                {
                    Toast.makeText(getApplicationContext(),"feature not supported on your device",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ttsObj.speak("tell me the day,please",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            case R.id.needsImage_moveMeInBed:
                if(cheeck==TextToSpeech.LANG_NOT_SUPPORTED||cheeck==TextToSpeech.LANG_MISSING_DATA)
                {
                    Toast.makeText(getApplicationContext(),"feature not supported on your device",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ttsObj.speak("please, move me lettle",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            case R.id.needsImage_teethWash:
                if(cheeck==TextToSpeech.LANG_NOT_SUPPORTED||cheeck==TextToSpeech.LANG_MISSING_DATA)
                {
                    Toast.makeText(getApplicationContext(),"feature not supported on your device",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ttsObj.speak("please, i want to wash my teeth",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            case R.id.needsImage_seeFreinds:
                if(cheeck==TextToSpeech.LANG_NOT_SUPPORTED||cheeck==TextToSpeech.LANG_MISSING_DATA)
                {
                    Toast.makeText(getApplicationContext(),"feature not supported on your device",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ttsObj.speak(" i want to see my freinds ",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            case R.id.needsImage_seeFamily:
                if(cheeck==TextToSpeech.LANG_NOT_SUPPORTED||cheeck==TextToSpeech.LANG_MISSING_DATA)
                {
                    Toast.makeText(getApplicationContext(),"feature not supported on your device",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ttsObj.speak(" i want to see my family ",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;

            case R.id.needsImage_lightUp:
                if(cheeck==TextToSpeech.LANG_NOT_SUPPORTED||cheeck==TextToSpeech.LANG_MISSING_DATA)
                {
                    Toast.makeText(getApplicationContext(),"feature not supported on your device",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ttsObj.speak(" please, switch on the light ",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            case R.id.needsImage_timeee:
                if(cheeck==TextToSpeech.LANG_NOT_SUPPORTED||cheeck==TextToSpeech.LANG_MISSING_DATA)
                {
                    Toast.makeText(getApplicationContext(),"feature not supported on your device",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ttsObj.speak(" please, tell me the time now ",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            case R.id.needsImage_raiseBed:
                if(cheeck==TextToSpeech.LANG_NOT_SUPPORTED||cheeck==TextToSpeech.LANG_MISSING_DATA)
                {
                    Toast.makeText(getApplicationContext(),"feature not supported on your device",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ttsObj.speak(" please, raise my bed up ",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;



        }
    }
}
