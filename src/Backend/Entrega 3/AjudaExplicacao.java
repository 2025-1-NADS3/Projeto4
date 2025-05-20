package com.example.fecapaybackend;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class AjudaExplicacao extends AppCompatActivity {

    private ImageButton btnNotificacao, btnQrCode, btnHome, btnExtrato, btnPerfil;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajuda_contato); // ou o nome que você usou

        // Topo
        btnNotificacao = findViewById(R.id.btnNotificacao);
        btnNotificacao.setOnClickListener(v -> {
            startActivity(new Intent(this, notificacoes.class));
        });

        btnQrCode = findViewById(R.id.btnQrCode);
        btnHome = findViewById(R.id.btnHome);
        btnExtrato = findViewById(R.id.btnExtrato);
        btnPerfil = findViewById(R.id.btnPerfil);


        btnQrCode.setOnClickListener(v -> {
            startActivity(new Intent(this, QrCodeActivity.class));
        });

        btnHome.setOnClickListener(v -> {
            startActivity(new Intent(this, Home.class));
        });

        btnExtrato.setOnClickListener(v -> {
            startActivity(new Intent(this, Extrato.class));
        });

        btnPerfil.setOnClickListener(v -> {
            startActivity(new Intent(this, Perfil.class));
        });
    }
}
