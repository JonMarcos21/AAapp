package com.example.aaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.net.Uri;
import android.view.View;

public class ESO extends AppCompatActivity {

    Button primero;
    Button segundo;
    Button tercero;
    Button cuarto;
    Button atras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eso);
        primero=(Button)findViewById(R.id.primero);
        segundo=(Button)findViewById(R.id.segundo);
        tercero=(Button)findViewById(R.id.tercero);
        cuarto=(Button)findViewById(R.id.cuarto);

    }
    public void urlPri (View view){
        Intent intentNavegador = new Intent(Intent.ACTION_VIEW, Uri.parse("http://iesataulfoargenta.es/wp/2020/05/06/curriculo-de-1o-e-s-o/"));
        startActivity(intentNavegador);
    }
    public void urlseg (View view){
        Intent intentNavegador = new Intent(Intent.ACTION_VIEW, Uri.parse("http://iesataulfoargenta.es/wp/2020/05/06/curriculo-de-2o-e-s-o/"));
        startActivity(intentNavegador);
    }
    public void urlter (View view){
        Intent intentNavegador = new Intent(Intent.ACTION_VIEW, Uri.parse("http://iesataulfoargenta.es/wp/category/ensenanzas/eso/3-eso/"));
        startActivity(intentNavegador);
    }
    public void urlcuar (View view){
        Intent intentNavegador = new Intent(Intent.ACTION_VIEW, Uri.parse("http://iesataulfoargenta.es/wp/2020/05/06/curriculo-de-4o-e-s-o/"));
        startActivity(intentNavegador);
    }
    public void atras(View view){

        Intent anterior = new Intent(this, Cursos.class);
        startActivity(anterior);
        finish();

    }

}