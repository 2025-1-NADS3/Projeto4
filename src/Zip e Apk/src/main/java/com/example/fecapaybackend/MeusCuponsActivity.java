package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MeusCuponsActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meus_cupons); // XML certo

        BottomBarHelper.setupNavigation(this);

        // Ativando o botão VOLTAR
        Button btnVoltar = findViewById(R.id.btnVoltar); // Confirme se esse é o ID no XML
        btnVoltar.setOnClickListener(v -> {
            Intent intent = new Intent(MeusCuponsActivity.this, PromocoesActivity.class);
            startActivity(intent);
            finish(); // Fecha a tela atual
        });
    }
}
