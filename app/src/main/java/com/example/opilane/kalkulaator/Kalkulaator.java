package com.example.opilane.kalkulaator;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.R.attr.onClick;

public class Kalkulaator extends AppCompatActivity {
    private EditText opr1;
    private EditText opr2;
    private Button btn_liida;
    private Button btn_lahuta;
    private Button btn_jaga;
    private Button btn_korruta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulaator);
    }
    protected double Väärtusta(){
        double Vastus = 0;
        if (btn_lahuta.callOnClick())
        {
            Vastus = Arv1-Arv2;
        }
        else if (btn_liida.callOnClick())
        {
            Vastus = Arv1+Arv2;
        }
        return Vastus;
    }
}
