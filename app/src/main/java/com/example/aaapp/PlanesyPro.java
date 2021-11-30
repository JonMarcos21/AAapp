package com.example.aaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class PlanesyPro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planesy_pro);
    }
    public void atras(View view){

        Intent anterior = new Intent(this, menu.class);
        startActivity(anterior);
        finish();

    }

    public void urlerasmus (View view){
        Intent intentNavegador = new Intent(Intent.ACTION_VIEW, Uri.parse("http://iesataulfoargenta.es/wp/2015/06/04/erasmus/"));
        startActivity(intentNavegador);
    }
    public void urlbilingue (View view){
        Intent intentNavegador = new Intent(Intent.ACTION_VIEW, Uri.parse("http://iesataulfoargenta.es/wp/category/autonomia-de-centros/planes-y-proyectos/bilingue/"));
        startActivity(intentNavegador);
    }
}