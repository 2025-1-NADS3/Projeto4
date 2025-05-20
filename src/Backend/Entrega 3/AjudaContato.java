package com.example.fecapaybackend; // substitua pelo seu pacote real

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class AjudaContato extends AppCompatActivity {

    private LinearLayout btnAjudaContato, btnContato;
    private ImageView btnQrCode, btnNotificacao, btnExtrato, btnPerfil, btnHome, bntSaiir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajuda_contato);

        btnAjudaContato = findViewById(R.id.btnAjudaContato);
        btnQrCode = findViewById(R.id.btnQrCode);
        btnNotificacao = findViewById(R.id.btnNotificacao);
        btnExtrato = findViewById(R.id.btnextrato);
        btnPerfil = findViewById(R.id.btnperfil);
        btnHome = findViewById(R.id.btnHome);
        bntSaiir = findViewById(R.id.bntSaiir);
        btnContato = findViewById(R.id.btnContato);

        btnNotificacao.setOnClickListener(v -> {
            Intent intent = new Intent(AjudaContato.this, notificacoes.class);
            startActivity(intent);
        });

        btnContato.setOnClickListener(v -> {
            Intent intent = new Intent(AjudaContato.this, Contato.class);
            startActivity(intent);
        });

        bntSaiir.setOnClickListener(v -> {
            Intent intent = new Intent(AjudaContato.this, BemVindoActivity.class);
            startActivity(intent);
            finish();
        });

        btnAjudaContato.setOnClickListener(v -> {
            Intent intent = new Intent(AjudaContato.this, AjudaExplicacao.class);
            startActivity(intent);
        });

        btnQrCode.setOnClickListener(v -> {
            Intent intent = new Intent(AjudaContato.this, QrCodeActivity.class);
            startActivity(intent);
        });

        btnExtrato.setOnClickListener(v -> {
            Intent intent = new Intent(AjudaContato.this, Extrato.class);
            startActivity(intent);
        });

        btnPerfil.setOnClickListener(v -> {
            Intent intent = new Intent(AjudaContato.this, Perfil.class);
            startActivity(intent);
        });

        btnHome.setOnClickListener(v -> {
            Intent intent = new Intent(AjudaContato.this, Home.class);
            startActivity(intent);
        });
    }
}
