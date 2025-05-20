package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class QrCodeActivity extends AppCompatActivity {

    private TextView btnColarPix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode);

        btnColarPix = findViewById(R.id.btnColarPix);

        btnColarPix.setOnClickListener(v -> {
            Intent intent = new Intent(QrCodeActivity.this, PixCopiaColaActivity.class);
            startActivity(intent);
        });

        // Redireciona automaticamente após 5 segundos para tela com o check verde
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(QrCodeActivity.this, RecargaConfirmadaActivity.class);
            startActivity(intent);
            finish(); // fecha a tela do QRCode para não voltar com o botão de voltar
        }, 5000); // 5000 ms = 5 segundos
    }
}
