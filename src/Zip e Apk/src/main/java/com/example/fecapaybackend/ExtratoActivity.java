package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ExtratoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extrato);

        // Ativa os botões do rodapé
        BottomBarHelper.setupNavigation(this);

        // Botão "VER GRÁFICOS"
        TextView btnVerGraficos = findViewById(R.id.textGrafico);
        btnVerGraficos.setOnClickListener(v -> {
            Intent intent = new Intent(ExtratoActivity.this, GraficosActivity.class);
            startActivity(intent);
        });
        // Mostrar/Ocultar saldo
        TextView textSaldo = findViewById(R.id.textSaldo);
        ImageView btnMostrarOcultar = findViewById(R.id.btnMostrarOcultar);

        final boolean[] mostrandoSaldo = {false};

        btnMostrarOcultar.setOnClickListener(v -> {
            if (mostrandoSaldo[0]) {
                textSaldo.setText("R$ ---------");
                btnMostrarOcultar.setImageResource(R.drawable.olho); // olho fechado
            } else {
                textSaldo.setText("R$ 1000,00"); // valor fictício ou dinâmico
                btnMostrarOcultar.setImageResource(R.drawable.olho); // se tiver um olho aberto
            }
            mostrandoSaldo[0] = !mostrandoSaldo[0];
        });
    }
}
