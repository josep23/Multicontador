package com.example.multicontador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.TextValueSanitizer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.multicontador.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    int contador;
    int contador1;
    int contador2;
    int contador3;
    int contador4;


    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.contadorDeClics1dere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador1++;
                contador=contador1+contador2+contador3+contador4;
                binding.contadorDeClics1izq.setText("Hay "+ contador1 + " Clics");
                binding.contadorDeClicscentral.setText("Hay "+ contador + " Clics");

            }
        });
        binding.contadorDeClics2dere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador2++;
                contador=contador1+contador2+contador3+contador4;
                binding.contadorDeClics2izq.setText("Hay "+ contador2 + "Clics");
                binding.contadorDeClicscentral.setText("Hay "+ contador + " Clics");


            }
        });
        binding.contadorDeClics3dere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador3++;
                contador=contador1+contador2+contador3+contador4;
                binding.contadorDeClics3izq.setText("Hay "+ contador3 + "Clics");
                binding.contadorDeClicscentral.setText("Hay "+ contador + " Clics");


            }
        });
        binding.contadorDeClics4dere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador4++;
                contador=contador1+contador2+contador3+contador4;
                binding.contadorDeClics4izq.setText("Hay "+ contador4 + "Clics");
                binding.contadorDeClicscentral.setText("Hay "+ contador + " Clics");


            }
        });
        binding.ResetAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               contador=0;
               contador1=0;
               contador2=0;
               contador3=0;
               contador4=0;
                contador=contador1+contador2+contador3+contador4;
                binding.contadorDeClicscentral.setText("Hay "+ contador + " Clics");
                binding.contadorDeClics1izq.setText("Hay "+ contador1 + " Clics");
                binding.contadorDeClics2izq.setText("Hay "+ contador2 + "Clics");
                binding.contadorDeClics3izq.setText("Hay "+ contador3 + "Clics");
                binding.contadorDeClics4izq.setText("Hay "+ contador4 + "Clics");
            }
        });
        binding.Reset1dere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador1=0;
                contador=contador1+contador2+contador3+contador4;
                binding.contadorDeClicscentral.setText("Hay "+ contador + " Clics");
                binding.contadorDeClics1izq.setText("Hay "+ contador1 + " Clics");
            }
        });
        binding.Reset2dere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador2=0;
                contador=contador1+contador2+contador3+contador4;
                binding.contadorDeClicscentral.setText("Hay "+ contador + " Clics");
                binding.contadorDeClics2izq.setText("Hay "+ contador2 + "Clics");
            }
        });
        binding.Reset3dere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador3=0;
                contador=contador1+contador2+contador3+contador4;
                binding.contadorDeClicscentral.setText("Hay "+ contador + " Clics");
                binding.contadorDeClics3izq.setText("Hay "+ contador3 + "Clics");
            }
        });
        binding.Reset4dere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador4=0;
                contador=contador1+contador2+contador3+contador4;
                binding.contadorDeClicscentral.setText("Hay "+ contador + " Clics");
                binding.contadorDeClics4izq.setText("Hay "+ contador4 + "Clics");
            }
        });
    }
}