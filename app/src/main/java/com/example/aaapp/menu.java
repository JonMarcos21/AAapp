package com.example.aaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class menu extends AppCompatActivity {

    Button enseñanza;
    Button contacto;
    Button planes;
    Button atras;
    Button toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        enseñanza = (Button) findViewById(R.id.enseñanza);
        contacto = (Button) findViewById(R.id.Contacto);
        planes = (Button) findViewById(R.id.planes);
        atras= (Button) findViewById(R.id.atras);

    }

    //boton para acceder a la activity de enseñanza

    public void cursos(View view){

        Intent curso = new Intent(this, Cursos.class);
        startActivity(curso);
        finish();

    }

    //Boton para acceder a la activity de covid

    public void contacto(View view){

        Intent con = new Intent(this, Contacto.class);
        startActivity(con);
        finish();

    }
    public void toast(View view){

        Toast.makeText(menu.this,"Elija una opcion",Toast.LENGTH_SHORT).show();

    }


    //Boton para acceder a la activity de planes

    public void planes(View view){

        Intent plan = new Intent(this, Planes.class);
        startActivity(plan);
        finish();

    }

    //Boton para ir para atras

    public void atras(View view){

        Intent anterior = new Intent(this, Acceso.class);
        startActivity(anterior);
        finish();

    }



}