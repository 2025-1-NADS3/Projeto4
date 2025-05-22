package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();

        // IMPORTANTE: Executa esse código apenas após o layout estar carregado
        runOnUiThread(() -> {
            ImageView menu = findViewById(R.id.btnMenu);
            ImageView notificacao = findViewById(R.id.btnSino);

            // Verifica se os botões existem na tela atual
            if (menu != null) {
                menu.setOnClickListener(v -> {
                    Intent intent = new Intent(BaseActivity.this, AjudaContatoActivity.class);
                    startActivity(intent);
                });
            }

            if (notificacao != null) {
                notificacao.setOnClickListener(v -> {
                    Intent intent = new Intent(BaseActivity.this, NotificacoesActivity.class);
                    startActivity(intent);
                });
            }
        });
    }
}