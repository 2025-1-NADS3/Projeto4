package com.example.fecapaybackend;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    LinearLayout botaoPagar, botaoRecarga, botaoQRCode, botaoPromocoes;
    ImageView btnAjudaContato, btnHome, btnNotificacao, btnQrCode;
    ImageView btnExtrato, btnPerfil, bntSaiir; // Rodapé

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        botaoPagar = findViewById(R.id.botao_pagar);
        botaoRecarga = findViewById(R.id.botao_recarga);
        botaoQRCode = findViewById(R.id.botao_qrcode);
        botaoPromocoes = findViewById(R.id.botao_promocoes);
        btnAjudaContato = findViewById(R.id.btnAjudaContato);
        btnQrCode = findViewById(R.id.btnQrCode);
        btnNotificacao = findViewById(R.id.btnNotificacao);
        btnExtrato = findViewById(R.id.btnextrato);
        btnPerfil = findViewById(R.id.btnperfil);
        btnHome = findViewById(R.id.btnHome);
        bntSaiir = findViewById(R.id.bntSaiir);

        btnNotificacao.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, notificacoes.class);
            startActivity(intent);
        });

        bntSaiir.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, BemVindoActivity.class);
            startActivity(intent);
        });

        btnAjudaContato.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, AjudaContato.class);
            startActivity(intent);
        });

        btnQrCode.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, QrCodeActivity.class);
            startActivity(intent);
        });

        botaoPagar.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, PagarActivity.class);
            startActivity(intent);
        });

        botaoRecarga.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, RecargaActivity.class);
            startActivity(intent);
        });

        botaoQRCode.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, QrCodeActivity.class);
            startActivity(intent);
        });

        botaoPromocoes.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, PromocoesActivity.class);
            startActivity(intent);
        });

        btnExtrato.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, Extrato.class);
            startActivity(intent);
        });

        btnPerfil.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, Perfil.class);
            startActivity(intent);
        });

        btnHome.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, Home.class);
            startActivity(intent);
        });
    }
}
