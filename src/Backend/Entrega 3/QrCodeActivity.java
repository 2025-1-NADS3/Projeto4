package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.fecapaybackend.BottomBarHelper;

public class QrCodeActivity extends AppCompatActivity {

    private TextView btnColarPix;
    private TextView btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode);

        btnColarPix = findViewById(R.id.btnColarPix);
        btnVoltar = findViewById(R.id.btnVoltar);

        // Clique no botão COLAR PIX
        btnColarPix.setOnClickListener(v -> {
            Intent intent = new Intent(QrCodeActivity.this, PixCopiaColaActivity.class);
            startActivity(intent);
        });

        // Clique no botão VOLTAR
        btnVoltar.setOnClickListener(v -> {
            finish(); // Volta para a tela anterior
        });

        // Rodapé funcionando
        BottomBarHelper.setupNavigation(this);
    }
}
