package com.example.a55.myapplication;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by A55 on 31/03/2017.
 */

public class Vista {

    public Activity activityOrigen;
    public Modelo modelo;

    public TextView tv;
    public Button btn1;
    public Button btn2;

    public Vista(Activity activityOrigen, Modelo modelo) {

        this.activityOrigen = activityOrigen;
        this.modelo = modelo;

        this.tv = (TextView) activityOrigen.findViewById(R.id.txtSaludo);

        this.btn1 = (Button) activityOrigen.findViewById(R.id.btn1);
        this.btn1.setText(this.modelo.getTexto());

        this.btn2 = (Button) activityOrigen.findViewById(R.id.btn2);
        this.cambiarTextoBtn("Click 2", btn2);



    }



    public void cambiarTextoBtn(String s, Button btn)
    {
        btn.setText(s);
    }
}
