package com.example.fecapaybackend; // substitua com o nome real do seu pacote

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Perfil extends AppCompatActivity {

    private ImageView btnAjudaContato, btnNotificacao;
    private ImageView btnQrCode, btnExtrato, btnHome, bntSaiir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        // Topo
        btnAjudaContato = findViewById(R.id.btnAjudaContato);
        btnNotificacao = findViewById(R.id.btnNotificacao);


        btnQrCode = findViewById(R.id.btnQrCode);
        btnExtrato = findViewById(R.id.btnextrato);

        btnHome = findViewById(R.id.btnHome);
        bntSaiir = findViewById(R.id.bntSaiir);


        btnAjudaContato.setOnClickListener(v -> {
            Intent intent = new Intent(Perfil.this, AjudaContato.class);
            startActivity(intent);
        });

        btnNotificacao.setOnClickListener(v -> {
            Intent intent = new Intent(Perfil.this, notificacoes.class);
            startActivity(intent);
        });

        btnQrCode.setOnClickListener(v -> {
            Intent intent = new Intent(Perfil.this, QrCodeActivity.class);
            startActivity(intent);
        });

        btnExtrato.setOnClickListener(v -> {
            Intent intent = new Intent(Perfil.this, Extrato.class);
            startActivity(intent);
        });

        btnHome.setOnClickListener(v -> {
            Intent intent = new Intent(Perfil.this, Home.class);
            startActivity(intent);
        });

        bntSaiir.setOnClickListener(v -> {
            Intent intent = new Intent(Perfil.this, Home.class);
            startActivity(intent);
            finish();
        });
    }
}
