package com.example.fecapaybackend;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class Contato extends AppCompatActivity {

    private ImageButton btnMenu, btnNotificacao;
    private ImageButton btnSair, btnQrCode, btnHome, btnExtrato, btnPerfil;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato);
        BottomBarHelper.setupNavigation(this);
        // TOPO
        btnMenu = findViewById(R.id.btnMenu);
        btnNotificacao = findViewById(R.id.btnSino);

        btnMenu.setOnClickListener(v -> {
            // Ação do menu
        });

        btnNotificacao.setOnClickListener(v -> {
            startActivity(new Intent(this, NotificacoesActivity.class));
        });

        // RODAPÉ
        btnSair = findViewById(R.id.btnSair);
        btnQrCode = findViewById(R.id.btnQrCode);
        btnHome = findViewById(R.id.btnHome);
        btnExtrato = findViewById(R.id.btnHistorico);
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
            startActivity(new Intent(this, ExtratoActivity.class));
        });

        btnPerfil.setOnClickListener(v -> {
            startActivity(new Intent(this, Perfil.class));
        });
    }
}