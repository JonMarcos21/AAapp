package com.example.aaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;

public class Contacto extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

    }
    public void urlP (View view){
        Intent intentNavegador = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.pinterest.es/iesataulfo/"));
        startActivity(intentNavegador);
    }
    public void urlf (View view){
        Intent intentNavegador = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/iesataulfo.argenta"));
        startActivity(intentNavegador);
    }
    public void urlt (View view){
        Intent intentNavegador = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/IESAtaulfoArgen"));
        startActivity(intentNavegador);
    }
    public void maps(View view){

        Intent map = new Intent(this, Maps.class);
        startActivity(map);
        finish();

    }
    public void telefono(View view){

        Context context = getApplicationContext();
        CharSequence text = "Accediendo a marcador";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel: 942860637"));
        startActivity(callIntent);


    }

}