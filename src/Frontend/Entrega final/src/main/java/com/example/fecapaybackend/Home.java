package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    LinearLayout botaoPagar, botaoRecarga, botaoQRCode, botaoPromocoes;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        botaoPagar = findViewById(R.id.botao_pagar);
        botaoRecarga = findViewById(R.id.botao_recarga);
        botaoQRCode = findViewById(R.id.botao_qrcode);
        botaoPromocoes = findViewById(R.id.botao_promocoes);


        botaoPagar.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, PagarActivity.class);
            startActivity(intent);
        });

        botaoRecarga.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, RecargaActivity.class);
            startActivity(intent);
        });

        botaoQRCode.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, QrCodeActivity.class);
            startActivity(intent);
        });
        botaoPromocoes.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, PromocoesActivity.class);
            startActivity(intent);
        });
    }
}
