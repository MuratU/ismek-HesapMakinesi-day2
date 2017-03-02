package com.mturlular.hesapmakinesi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            final EditText et1 = (EditText) findViewById(R.id.et1);
            final EditText et2 = (EditText) findViewById(R.id.et2);
            Button btnTopla = (Button) findViewById(R.id.btn1);
            Button btnCikarma = (Button) findViewById(R.id.btn2);
            Button btnMod = (Button) findViewById(R.id.btn3);
            Button btnBolme = (Button) findViewById(R.id.btn4);
            Button btnCarpma = (Button) findViewById(R.id.btn5);

            final TextView tvSonuc = (TextView) findViewById(R.id.tvSonuc);

        btnTopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int sayi1 = Integer.parseInt(et1.getText().toString());
                int sayi2 = Integer.parseInt(et2.getText().toString());
                tvSonuc.setText(String.valueOf(sayi1+sayi2));

            }
        });

        btnCikarma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sayi1 = Integer.parseInt(et1.getText().toString());
                int sayi2 = Integer.parseInt(et2.getText().toString());
                tvSonuc.setText(String.valueOf(sayi1-sayi2));
            }
        });

        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sayi1 = Integer.parseInt(et1.getText().toString());
                int sayi2 = Integer.parseInt(et2.getText().toString());
                tvSonuc.setText(String.valueOf(sayi1%sayi2));
            }
        });

        btnBolme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sayi1 = Integer.parseInt(et1.getText().toString());
                int sayi2 = Integer.parseInt(et2.getText().toString());
                tvSonuc.setText(String.valueOf(sayi1/sayi2));
            }
        });

        btnCarpma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sayi1 = Integer.parseInt(et1.getText().toString());
                int sayi2 = Integer.parseInt(et2.getText().toString());
                tvSonuc.setText(String.valueOf(sayi1*sayi2));
            }
        });

    }


}
