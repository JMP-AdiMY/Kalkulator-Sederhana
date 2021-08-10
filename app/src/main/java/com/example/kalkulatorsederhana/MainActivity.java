package com.example.kalkulatorsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   EditText angkaPertama, angkaKedua;
   Button btnKurang, btnKali, btnBagi, btnReset, btnTambah;
   TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angkaPertama = (EditText) findViewById(R.id.angkaPertama);
        angkaKedua = (EditText) findViewById(R.id.angkaKedua);
        btnKurang = (Button) findViewById(R.id.btnKurang);
        btnTambah = (Button) findViewById(R.id.btnTambah);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnBagi = (Button) findViewById(R.id.btnBagi);
        btnReset = (Button) findViewById(R.id.btnReset);
        txtHasil = (TextView) findViewById(R.id.txtHasil);


    btnTambah.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if ((angkaPertama.getText().length() > 0) && (angkaKedua.getText().length() > 0)) {
                double angka1 = Double.parseDouble(angkaPertama.getText().toString());
                double angka2 = Double.parseDouble(angkaKedua.getText().toString());
                double result = angka1 + angka2;
                txtHasil.setText(Double.toString(result));
            } else {
                Toast toast = Toast.makeText(MainActivity.this, "mohon masukan kedua angka", Toast.LENGTH_LONG);
                toast.show();
            }
        }
    });

    btnKurang.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if((angkaPertama.getText().length()>0) && (angkaKedua.getText().length()>0))
            {
                double angka1 = Double.parseDouble(angkaPertama.getText().toString());
                double angka2 = Double.parseDouble(angkaKedua.getText().toString());
                double result = angka1 - angka2;
                txtHasil.setText(Double.toString(result));
            }
            else {
                Toast toast = Toast.makeText(MainActivity.this, "mohon masukan kedua angka", Toast.LENGTH_LONG);
                toast.show();
            }
        }
    });

    btnKali.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if((angkaPertama.getText().length()>0) && (angkaKedua.getText().length()>0))
            {
                double angka1 = Double.parseDouble(angkaPertama.getText().toString());
                double angka2 = Double.parseDouble(angkaKedua.getText().toString());
                double result = angka1 * angka2;
                txtHasil.setText(Double.toString(result));
            }
            else {
                Toast toast = Toast.makeText(MainActivity.this, "mohon masukan kedua angka", Toast.LENGTH_LONG);
                toast.show();
            }
        }
    });

    btnBagi.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if((angkaPertama.getText().length()>0) && (angkaKedua.getText().length()>0))
            {
                double angka1 = Double.parseDouble(angkaPertama.getText().toString());
                double angka2 = Double.parseDouble(angkaKedua.getText().toString());
                double result = angka1 / angka2;
                txtHasil.setText(Double.toString(result));
            }
            else {
                Toast toast = Toast.makeText(MainActivity.this, "mohon masukan kedua angka", Toast.LENGTH_LONG);
                toast.show();
            }
        }
    });

    btnReset.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            angkaPertama.setText("");
            angkaKedua.setText("");
            txtHasil.setText("");
            angkaPertama.requestFocus();
        }
    });

    }

}