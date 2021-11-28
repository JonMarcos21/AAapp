package com.example.aaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class FP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fp);
    }
    public void urlsmr (View view){
        Intent intentNavegador = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.iesataulfoargenta.es/ciclosinformatica/sistemas-microinformaticos-y-redes/sistemas-microinformaticos-y-redes/"));
        startActivity(intentNavegador);
    }
    public void urlcoci (View view){
        Intent intentNavegador = new Intent(Intent.ACTION_VIEW, Uri.parse("http://iesataulfoargenta.es/wp/category/ensenanzas/formacion-profesional/cocina-y-restauracion/"));
        startActivity(intentNavegador);
    }
    public void urldam (View view){
        Intent intentNavegador = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.iesataulfoargenta.es/ciclosinformatica/desarrollo-de-aplicaciones-multiplataforma/desarrollo-de-aplicaciones-multiplataforma/"));
        startActivity(intentNavegador);
    }
    public void urldaw (View view){
        Intent intentNavegador = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.iesataulfoargenta.es/ciclosinformatica/desarrollo-de-aplicaciones-multiplataforma/desarrollo-de-aplicaciones-multiplataforma/"));
        startActivity(intentNavegador);
    }
    public void atras(View view){

        Intent anterior = new Intent(this, Cursos.class);
        startActivity(anterior);
        finish();

    }
}