package com.example.fecapaybackend;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GraficosActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grafico);
        BottomBarHelper.setupNavigation(this);


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
