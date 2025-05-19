package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class RecargaPixConfirmadaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Essa é a tela do QR Code (que aparece primeiro)
        setContentView(R.layout.activity_ler_qrcode);

        // Depois de 5 segundos, abre a tela de confirmação de recarga
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(RecargaPixConfirmadaActivity.this, RecargaConfirmadaActivity.class);
            startActivity(intent);
            finish();
        }, 5000);// 5000 ms = 5 segundos
    }
}
