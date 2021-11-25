package com.example.aaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class Contacto extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
    }
    public void urlF (View view){
        Intent intentNavegador = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/iesataulfo.argenta"));
        startActivity(intentNavegador);
    }
}