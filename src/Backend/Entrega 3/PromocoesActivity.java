package com.example.fecapaybackend;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PromocoesActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promocoes);

        // Botões dos cards
        @SuppressLint("WrongViewCast") TextView btnCupom1 = findViewById(R.id.btnCupom1);
        @SuppressLint("WrongViewCast") TextView btnCupom2 = findViewById(R.id.btnCupom2);
        @SuppressLint("WrongViewCast") TextView btnCupom3 = findViewById(R.id.btnCupom3);
        @SuppressLint("WrongViewCast") TextView btnCupom4 = findViewById(R.id.btnCupom4);

        // Botão "MEUS CUPONS"
        TextView btnMeusCupons = findViewById(R.id.btnMeusCupons);

        // Clique para abrir tela do cupom individual
        View.OnClickListener abrirCupom = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PromocoesActivity.this, SeuCupomActivity.class);
                startActivity(intent);
            }
        };

        // Clique para abrir tela com todos os cupons
        btnMeusCupons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PromocoesActivity.this, MeusCuponsActivity.class);
                startActivity(intent);
            }
        });

        btnCupom1.setOnClickListener(abrirCupom);
        btnCupom2.setOnClickListener(abrirCupom);
        btnCupom3.setOnClickListener(abrirCupom);
        btnCupom4.setOnClickListener(abrirCupom);
    }
}