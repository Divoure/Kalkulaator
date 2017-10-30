package com.example.opilane.kalkulaator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import static android.R.attr.onClick;

public class Kalkulaator extends AppCompatActivity {
    private EditText opr1;
    private EditText opr2;
    private Button btn_liida;
    private  Button btn_lahuta;
    private  Button btn_korruta;
    private Button btn_jaga;
    private Button btn_kustuta;
    private TextView txtresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulaator);
        opr1 = (EditText) findViewById(R.id.editOp1);
        opr2 = (EditText) findViewById(R.id.editOp2);
        btn_liida = (Button) findViewById(R.id.btn_liida);
        btn_lahuta = (Button) findViewById(R.id.btn_lahuta);
        btn_korruta = (Button) findViewById(R.id.btn_korruta);
        btn_jaga = (Button) findViewById(R.id.btn_jaga);
        btn_kustuta = (Button) findViewById(R.id.btn_kustuta);
        txtresult= (TextView) findViewById(R.id.result);

        btn_liida.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if ((opr1.getText().length()>0) && (opr2.getText().length()>0))
                {
                    double oper1 = Double.parseDouble(opr1.getText().toString());
                    double oper2 = Double.parseDouble(opr2.getText().toString());
                    double result = oper1 + oper2;
                    txtresult.setText(Double.toString(result));
                }
                else {
                    Toast toast = Toast.makeText(Kalkulaator.this, "Enter the required numbers",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        btn_lahuta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((opr1.getText().length()>0) && (opr2.getText().length()>0))
                {
                    double oper1 = Double.parseDouble(opr1.getText().toString());
                    double oper2 = Double.parseDouble(opr2.getText().toString());
                    double result = oper1 - oper2;
                    txtresult.setText(Double.toString(result));
                }
                else{
                    Toast toast= Toast.makeText(Kalkulaator.this,"Enter The Required Numbers",Toast.LENGTH_LONG);
                    toast.show();
                }

            }
        });
        btn_korruta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((opr1.getText().length()>0) && (opr2.getText().length()>0))
                {
                    double oper1 = Double.parseDouble(opr1.getText().toString());
                    double oper2 = Double.parseDouble(opr2.getText().toString());
                    double result = oper1 * oper2;
                    txtresult.setText(Double.toString(result));
                }
                else{
                    Toast toast= Toast.makeText(Kalkulaator.this,"Enter The Required Numbers",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        btn_jaga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((opr1.getText().length()>0) && (opr2.getText().length()>0))
                {
                    double oper1 = Double.parseDouble(opr1.getText().toString());
                    double oper2 = Double.parseDouble(opr2.getText().toString());
                    double result = oper1 / oper2;
                    txtresult.setText(Double.toString(result));
                }
                else{
                    Toast toast= Toast.makeText(Kalkulaator.this,"Enter The Required Numbers",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        btn_kustuta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opr1.setText("");
                opr2.setText("");
                txtresult.setText("0.00");
                opr1.requestFocus();
            }
        });

    }
}
