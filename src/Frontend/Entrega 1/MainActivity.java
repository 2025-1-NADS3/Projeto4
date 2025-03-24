package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnIrParaLogin;
    private TextView btnIrParaCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIrParaLogin = findViewById(R.id.bt_entrar); // Corrigido
        btnIrParaCadastro = findViewById(R.id.tvCriarConta); // Corrigido

        // Ir para tela de Login
        btnIrParaLogin.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, BemVindoActivity.class);
            startActivity(intent);
        });

        // Ir para tela de Criar Conta
        btnIrParaCadastro.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CriarContaActivity.class);
            startActivity(intent);
        });
    }
}
