package com.example.aaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Cursos extends AppCompatActivity {

    Button eso;
    Button bachiller;
    Button fp;
    Button volver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos);
        //botones de la clase cursos
        eso=(Button) findViewById(R.id.ESO);
        bachiller=(Button) findViewById(R.id.Bachiller);
        fp=(Button) findViewById(R.id.FP);
        volver= (Button) findViewById(R.id.volver);

    }

    //Boton para accceder a la clase ESO
    public void eso(View view){

        Intent eso = new Intent(this, ESO.class);
        startActivity(eso);
        finish();

    }
    //Boton para accceder a la clase Bachiller
    public void bachiller(View view){

        Intent bach = new Intent(this, Bachiller.class);
        startActivity(bach);
        finish();

    }
    //Boton para accceder a la clase Fp
    public void fp(View view){

        Intent fp = new Intent(this, FP.class);
        startActivity(fp);
        finish();

    }
    public void toast(View view){

        Toast.makeText(Cursos.this,"Elija que curso desea ver",Toast.LENGTH_SHORT).show();

    }

    //Boton para volver a la clase menu
    public void atras(View view){

        Intent anterior = new Intent(this, menu.class);
        startActivity(anterior);
        finish();

    }

}