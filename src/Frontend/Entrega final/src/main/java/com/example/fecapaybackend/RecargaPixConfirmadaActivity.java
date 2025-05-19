package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class RecargaPixConfirmadaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ler_qrcode); // <-- nome do layout da TELA ATUAL (QR Code)

        // Espera 5 segundos, depois abre a tela de sucesso
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(RecargaPixConfirmadaActivity.this, RecargaSucessoActivity.class);
            startActivity(intent);
            finish();
        }, 5000);
    }
}
