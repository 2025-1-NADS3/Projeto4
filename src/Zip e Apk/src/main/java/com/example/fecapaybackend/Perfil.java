package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Perfil extends BaseActivity {

    private ImageView btnAjudaContato, btnNotificacao;
    private ImageView btnQrCode, btnExtrato, btnHome, bntSaiir, btnPerfil;
    private TextView tvNome, tvRa, tvEmail, tvCelular, tvCpf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
        BottomBarHelper.setupNavigation(this);
        btnAjudaContato = findViewById(R.id.btnMenu);
        btnNotificacao = findViewById(R.id.btnSino);

        btnQrCode = findViewById(R.id.btnQrCode);
        btnExtrato = findViewById(R.id.btnHistorico);
        btnHome = findViewById(R.id.btnHome);
        bntSaiir = findViewById(R.id.btnSair);
        btnPerfil = findViewById(R.id.btnPerfil);

        tvNome = findViewById(R.id.tv_nome);
        tvRa = findViewById(R.id.tv_ra);
        tvEmail = findViewById(R.id.tv_email);
        tvCelular = findViewById(R.id.tv_celular);
        tvCpf = findViewById(R.id.tv_cpf);

        btnAjudaContato.setOnClickListener(v ->
                startActivity(new Intent(this, AjudaContatoActivity.class)));

        btnNotificacao.setOnClickListener(v ->
                startActivity(new Intent(this, NotificacoesActivity.class)));

        btnQrCode.setOnClickListener(v ->
                startActivity(new Intent(this, QrCodeActivity.class)));

        btnExtrato.setOnClickListener(v ->
                startActivity(new Intent(this, ExtratoActivity.class)));

        btnHome.setOnClickListener(v ->
                startActivity(new Intent(this, Home.class)));

        bntSaiir.setOnClickListener(v -> {
            startActivity(new Intent(this, BemVindoActivity.class));
            finish();
        });

        btnPerfil.setOnClickListener(v -> {
            // já está na tela de perfil
        });
    }
}