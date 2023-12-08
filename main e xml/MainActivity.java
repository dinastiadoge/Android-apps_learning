package com.example.imccalc.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import imcalc.R;


public class MainActivity extends AppCompatActivity {

    TextView lblResultado;
    EditText txtPeso, txtAltura;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //aqui é onde ele acha o xml
    }

    public void btnCalcularOnClick(View v) {

        lblResultado = (TextView) findViewById(R.id.lblResultado);
        txtPeso = (EditText) findViewById(R.id.txtPeso);
        txtAltura = (EditText) findViewById(R.id.txtAltura);

        int peso = Integer.parseInt(txtPeso.getText().toString());
        float altura = Float.parseFloat(txtAltura.getText().toString());

        float resultado = peso / (altura * altura);
        if (resultado < 19) {
            //abaixo
            lblResultado.setText("Abaixo do peso!");
        } else if (resultado > 32) {
            //obeso
            lblResultado.setText("Acima do peso!");
        } else {
            //ok
            lblResultado.setText("Peso ok!");
        }
    }

    public void btnReset(View v){
        txtPeso.setText("");
        txtAltura.setText("");
        lblResultado.setText("");
        txtPeso.requestFocus();
    }

}