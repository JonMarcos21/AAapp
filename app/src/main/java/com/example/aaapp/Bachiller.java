package com.example.aaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Bachiller extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bachiller);
    }
    public void urlbac (View view){
        Intent intentNavegador = new Intent(Intent.ACTION_VIEW, Uri.parse("http://iesataulfoargenta.es/wp/2020/05/06/curriculo-de-1o-bachillerato/"));
        startActivity(intentNavegador);
    }
    public void urlbach2 (View view){
        Intent intentNavegador = new Intent(Intent.ACTION_VIEW, Uri.parse("http://iesataulfoargenta.es/wp/category/ensenanzas/bachillerato/2-bachillerato/"));
        startActivity(intentNavegador);
    }
    public void atras(View view){

        Intent anterior = new Intent(this, Cursos.class);
        startActivity(anterior);
        finish();

    }

}