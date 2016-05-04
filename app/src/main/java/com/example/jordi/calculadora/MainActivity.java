package com.example.jordi.calculadora;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Double numero1,numero2,resultado;
    String operador;

    public void onClickbtnM1(View miView){
        TextView tv = (TextView) findViewById(R.id.txtNumero);
        SharedPreferences prefs = getSharedPreferences("Mem", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("Numero1", tv.getText().toString());
        editor.commit();

    }

    public void onClickbtnR1(View miView){
        TextView tv = (TextView) findViewById(R.id.txtNumero);
        SharedPreferences prefs = getSharedPreferences("Memoria",Context.MODE_PRIVATE);

        String numero1 = prefs.getString("Numero1", "calculadora");
        tv.setText(numero1);

    }
    public void onClickbtnM2(View miView){
        TextView tv = (TextView) findViewById(R.id.txtNumero);
        SharedPreferences prefs = getSharedPreferences("Memoria2", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("Numero2", tv.getText().toString());
        editor.commit();




    }
    public void onClickbtnR2(View miView){
        TextView tv = (TextView) findViewById(R.id.txtNumero);
        SharedPreferences prefs = getSharedPreferences("Memoria2",Context.MODE_PRIVATE);

        String numero2 = prefs.getString("Numero2", "calculadora");
        tv.setText(numero2);

    }


    public void onClickbtnigual(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.txtNumero) ;
        numero2 = Double.parseDouble(tv.getText().toString());

        if(operador.equals("+"))
        {
            resultado= numero1+numero2;
        }
        else if(operador.equals("-"))
        {
            resultado= numero1-numero2;
        }
        else if(operador.equals("*"))
        {
            resultado= numero1*numero2;
        }
        else if(operador.equals("/"))
        {
            resultado= numero1/numero2;
        }
        tv.setText(resultado.toString());
    }

    public void onClickbtnmas(View miView)
    {
        operador="+";
        onClicktxtView(miView);
    }
    public void onClickbtnmenos(View miView)
    {
        operador="-";
        onClicktxtView(miView);
    }
    public void onClickbtnmulti(View miView)
    {
        operador="*";
        onClicktxtView(miView);
    }

    public void onClickbtndiv(View miView)
    {
        operador="/";
        onClicktxtView(miView);
    }

    public void onClicktxtView(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.txtNumero) ;
        numero1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }

    public void onClickbtnborrar(View miView)
    {
        numero1=0.0;
        numero2=0.0;
        TextView tv = (TextView) findViewById(R.id.txtNumero) ;
        tv.setText("");
    }

    public void onClickbtn1(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.txtNumero) ;
        tv.setText(tv.getText() + "1");
    }
    public void onClickbtn2(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.txtNumero) ;
        tv.setText(tv.getText() + "2");
    }
    public void onClickbtn3(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.txtNumero) ;
        tv.setText(tv.getText() + "3");
    }
    public void onClickbtn4(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.txtNumero) ;
        tv.setText(tv.getText() + "4");
    }
    public void onClickbtn5(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.txtNumero) ;
        tv.setText(tv.getText() + "5");
    }
    public void onClickbtn6(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.txtNumero) ;
        tv.setText(tv.getText() + "6");
    }
    public void onClickbtn7(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.txtNumero) ;
        tv.setText(tv.getText() + "7");
    }
    public void onClickbtn8(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.txtNumero) ;
        tv.setText(tv.getText() + "8");
    }
    public void onClickbtn9(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.txtNumero) ;
        tv.setText(tv.getText() + "9");
    }
    public void onClickbtn0(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.txtNumero) ;
        tv.setText(tv.getText() + "0");
    }
    public void onClickbtnpunto(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.txtNumero) ;
        tv.setText(tv.getText() + ".");
    }

}







