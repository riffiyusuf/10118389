package com.example.tugas1_akb_if9_10118398;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {
 /* Tanggal Pengerjaan : Kamis, 08 April 2021
    NIM : 10118398
    Nama : M Riffi Yusuf Hawarry
    Kelas : IF_9
 *  */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void loginMethod(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);


    }

    public void registerMethod(View view) {
        Intent i = new Intent(this, RegistrationActivity.class);
        startActivity(i);
    }
}