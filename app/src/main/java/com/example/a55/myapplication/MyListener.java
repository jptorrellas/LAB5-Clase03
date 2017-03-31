package com.example.a55.myapplication;

import android.view.View;

/**
 * Created by A55 on 31/03/2017.
 */

public class MyListener implements View.OnClickListener {

    private ICambiarTexto iCambiarTexto;

    public MyListener(ICambiarTexto iCambiarTexto) {
        this.iCambiarTexto = iCambiarTexto;
    }

    @Override
    public void onClick(View v) {
        iCambiarTexto.cambiarTexto(v);
    }
}
