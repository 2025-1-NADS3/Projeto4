package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class notificacoes extends AppCompatActivity {

    private ImageButton btnMenu, btnNotificacao;
    private ImageButton btnSair, btnQrCode, btnHome, btnExtrato, btnPerfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificacoes); // nome do XML

        // TOPO
        btnMenu = findViewById(R.id.btnMenu);
        btnNotificacao = findViewById(R.id.btnNotificacao);

        btnMenu.setOnClickListener(v -> {
            // Exemplo: abrir drawer, ou outra ação
        });

        btnNotificacao.setOnClickListener(v -> {
            // já está nesta tela
        });

        // RODAPÉ
        btnSair = findViewById(R.id.btnSair);
        btnQrCode = findViewById(R.id.btnQrCode);
        btnHome = findViewById(R.id.btnHome);
        btnExtrato = findViewById(R.id.btnExtrato);
        btnPerfil = findViewById(R.id.btnPerfil);

        btnSair.setOnClickListener(v -> {
            startActivity(new Intent(this, BemVindoActivity.class));
            finish();
        });

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
