package com.example.a55.myapplication;

import android.view.View;

/**
 * Created by A55 on 31/03/2017.
 */

public class Controlador implements ICambiarTexto {

    public MyListener listener;
    public Vista vista;
    public Modelo modelo;

    public Controlador(Vista vista, Modelo modelo) {

        this.listener = new MyListener(this);
        this.vista = vista;
        this.modelo = modelo;

        this.vista.btn1.setOnClickListener(listener);
        this.vista.btn2.setOnClickListener(listener);
    }

    @Override
    public void cambiarTexto(View v)
    {
        switch (v.getId()) {

            case R.id.btn1:
                this.vista.tv.setText("Se hizo click en el btn 1");
                break;

            case R.id.btn2:
                this.vista.tv.setText("Se hizo click en el btn 2");
                break;
        }
    }


}
