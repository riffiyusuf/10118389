package com.example.tugas1_akb_if9_10118398;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistrationActivity extends AppCompatActivity {
    /* Tanggal Pengerjaan : Kamis, 08 April 2021
        NIM : 10118398
        Nama : M Riffi Yusuf Hawarry
        Kelas : IF_9
     *  */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void KembaliKeLogin(View view) {
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
    }
}