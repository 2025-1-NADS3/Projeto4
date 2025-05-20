package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class PagarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagar);

        // Botões de ação
        LinearLayout btnTransferir = findViewById(R.id.btnTransferir);
        LinearLayout botao_qrcode = findViewById(R.id.botao_qrcode);
        LinearLayout btnPixCopiaCola = findViewById(R.id.btnPixCopiaCola);
        LinearLayout contatoRoberta = findViewById(R.id.contatoRoberta);

        // TOPO
        ImageButton btnMenu = findViewById(R.id.btnMenu);
        ImageButton btnNotificacao = findViewById(R.id.btnNotificacao);

        // RODAPÉ
        ImageButton btnSair = findViewById(R.id.btnSair);
        ImageButton btnQrCode = findViewById(R.id.btnQrCode);
        ImageButton btnHome = findViewById(R.id.btnHome);
        ImageButton btnExtrato = findViewById(R.id.btnExtrato);
        ImageButton btnPerfil = findViewById(R.id.btnPerfil);

        // --- AÇÕES DOS BOTÕES ---

        // TOPO
        btnMenu.setOnClickListener(v -> {
            // exemplo: abrir menu ou drawer
        });

        btnNotificacao.setOnClickListener(v -> {
            startActivity(new Intent(PagarActivity.this, notificacoes.class));
        });

        // RODAPÉ
        btnSair.setOnClickListener(v -> {
            startActivity(new Intent(PagarActivity.this, BemVindoActivity.class));
            finish();
        });

        btnQrCode.setOnClickListener(v -> {
            startActivity(new Intent(PagarActivity.this, QrCodeActivity.class));
        });

        btnHome.setOnClickListener(v -> {
            startActivity(new Intent(PagarActivity.this, Home.class));
        });

        btnExtrato.setOnClickListener(v -> {
            startActivity(new Intent(PagarActivity.this, Extrato.class));
        });

        btnPerfil.setOnClickListener(v -> {
            startActivity(new Intent(PagarActivity.this, Perfil.class));
        });

        // Botões de ação principais
        btnTransferir.setOnClickListener(v -> {
            Intent intent = new Intent(PagarActivity.this, TransferenciaActivity.class);
            startActivity(intent);
        });

        botao_qrcode.setOnClickListener(v -> {
            Intent intent = new Intent(PagarActivity.this, QrCodeActivity.class);
            startActivity(intent);
        });

        btnPixCopiaCola.setOnClickListener(v -> {
            Intent intent = new Intent(PagarActivity.this, PixCopiaColaActivity.class);
            startActivity(intent);
        });

        contatoRoberta.setOnClickListener(v -> {
            Intent intent = new Intent(PagarActivity.this, TransferenciaActivity.class);
            intent.putExtra("nome_contato", "ROBERTA MESSI");
            startActivity(intent);
        });
    }
}
