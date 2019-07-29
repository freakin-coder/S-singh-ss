package com.example.saurav.sauravmagnum;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {



    TextToSpeech tts;
    int result;
    String text;
    Button main;
    int c=0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tts=new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                result=tts.setLanguage(Locale.US);

            }
        });




    }


    public void TTS(View view)
    {
        text="Hi Magnum solutions ";
        tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);

        TextView t1 =(TextView)findViewById(R.id.t1);
        TextView t2 =(TextView)findViewById(R.id.t2);
        String x = "t"+c;
        TextView t3 =(TextView)findViewById(R.id.t3);

        TextView t4 =(TextView)findViewById(R.id.t4);
        TextView t5=(TextView)findViewById(R.id.t5);

        TextView t6 =(TextView)findViewById(R.id.t6);
        TextView t7 =(TextView)findViewById(R.id.t7);

        TextView t8 =(TextView)findViewById(R.id.t8);
        TextView t9 =(TextView)findViewById(R.id.t9);

        TextView t10 =(TextView)findViewById(R.id.t10);
        TextView t11 =(TextView)findViewById(R.id.t11);

        TextView t12 =(TextView)findViewById(R.id.t12);
        TextView t13 =(TextView)findViewById(R.id.t13);

        TextView t14 =(TextView)findViewById(R.id.t14);










        boolean connected = false;
        ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
            //we are connected to a network
            connected = true;
        }
        else
            connected = false;

        if (connected==true){

            c++;


            if (c == 1) {

                t1.setVisibility(View.VISIBLE);
            }

            if (c == 2) {

                t2.setVisibility(View.VISIBLE);
            }

            if (c == 3) {

                t3.setVisibility(View.VISIBLE);
            }


            if (c == 4) {
                t4.setVisibility(View.VISIBLE);


            }

            if (c == 5) {

                t5.setVisibility(View.VISIBLE);
            }

            if (c == 6) {

                t6.setVisibility(View.VISIBLE);
            }


            if (c == 7) {

                t7.setVisibility(View.VISIBLE);
            }

            if (c == 8) {

                t8.setVisibility(View.VISIBLE);
            }

            if (c == 9) {

                t9.setVisibility(View.VISIBLE);
            }


            if (c == 10) {

                t10.setVisibility(View.VISIBLE);
            }

            if (c == 11) {

                t11.setVisibility(View.VISIBLE);
            }


            if (c == 12) {

                t12.setVisibility(View.VISIBLE);
            }

            if (c == 13) {

                t13.setVisibility(View.VISIBLE);
            }

            if (c == 14) {

                t14.setVisibility(View.VISIBLE);
            }




            Toast.makeText(MainActivity.this, "Internet Connection "+c, Toast.LENGTH_SHORT).show();

        }
        else {
            Toast.makeText(MainActivity.this, "No internet connection", Toast.LENGTH_SHORT).show();


        }

    }
    @Override
    public void onDestroy(){
        tts.stop();
        super.onDestroy();
    }

}
