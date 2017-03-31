package com.example.a55.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Modelo modelo = new Modelo("botoncito1");
        Vista vista = new Vista(this, modelo);
        //Controlador controlador = new Controlador(new MyListener(vista));
        Controlador controlador = new Controlador(vista, modelo);

        //View.OnClickListener listener = new MyListener((ICambiarTexto)this);
    }
}
