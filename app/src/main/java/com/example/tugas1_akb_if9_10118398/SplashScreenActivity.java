package com.example.tugas1_akb_if9_10118398;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class SplashScreenActivity extends AppCompatActivity {
    /* Tanggal Pengerjaan : Kamis, 08 April 2021
        NIM : 10118398
        Nama : M Riffi Yusuf Hawarry
        Kelas : IF_9
     *  */
        private int waktu_loading=4000;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);


            setContentView(R.layout.activity_splash_screen);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    //setelah loading maka akan langsung berpindah ke home activity
                    Intent i=new Intent(SplashScreenActivity.this, LoginActivity.class);
                    startActivity(i);
                    finish();

                }
            },waktu_loading);
        }
    }
