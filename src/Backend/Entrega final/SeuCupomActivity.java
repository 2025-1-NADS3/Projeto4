package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SeuCupomActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seu_cupom); // Layout da tela de cupom

        BottomBarHelper.setupNavigation(this);

        Button btnVoltar = findViewById(R.id.btnVoltarCupom);
        btnVoltar.setOnClickListener(v -> {
            Intent intent = new Intent(SeuCupomActivity.this, PromocoesActivity.class);
            startActivity(intent);
            finish(); // Finaliza a tela atual
        });
    }
}
