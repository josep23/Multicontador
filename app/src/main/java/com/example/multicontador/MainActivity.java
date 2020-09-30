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

        binding.augmentarElContador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador=contador1+contador2+contador3+contador4;
                binding.contadorDeClicscentral.setText("Hay " + contador + " Clics");

                contador1++;
                binding.contadorDeClics1izq.setText("Hay "+ contador1 + " Clics");

                contador2++;
                binding.contadorDeClics2izq.setText("Hay "+ contador2 + " Clics");

                contador3++;
                binding.contadorDeClics4izq.setText("Hay "+ contador3 + " Clics");

                contador4++;
                binding.contadorDeClics4izq.setText("Hay "+ contador4 + " Clics");
            }
        });
    }
}