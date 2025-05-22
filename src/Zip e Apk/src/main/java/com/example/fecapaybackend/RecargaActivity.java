package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RecargaActivity extends BaseActivity {

    private TextView textSaldo;
    private ImageView btnMostrarOcultar;
    private boolean saldoVisivel = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_saldo);
        BottomBarHelper.setupNavigation(this);

        textSaldo = findViewById(R.id.textSaldo);
        btnMostrarOcultar = findViewById(R.id.btnMostrarOcultar);
        Button btnAdicionar = findViewById(R.id.btnAdicionar);
        Button btnContinuar = findViewById(R.id.btnContinuar);

        // Mostrar ou ocultar saldo
        btnMostrarOcultar.setOnClickListener(v -> {
            saldoVisivel = !saldoVisivel;
            textSaldo.setText(saldoVisivel ? "R$ 1.000.000.000,00" : "R$ ---------");
        });

        // Botão "ADICIONAR SALDO CARTÃO"
        btnAdicionar.setOnClickListener(v -> {
            Intent intent = new Intent(RecargaActivity.this, RecargaCartaoActivity.class);
            startActivity(intent);
        });

        // Botão "CONTINUAR" -> vai direto para próxima tela
        btnContinuar.setOnClickListener(v -> {
            Intent intent = new Intent(RecargaActivity.this, RecargaPixConfirmadaActivity.class);
            startActivity(intent);
        });
    }
}
