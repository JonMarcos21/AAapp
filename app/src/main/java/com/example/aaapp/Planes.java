package com.example.aaapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;



public class Planes extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



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