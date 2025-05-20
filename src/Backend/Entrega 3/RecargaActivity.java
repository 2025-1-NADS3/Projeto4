package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RecargaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_saldo); // Certifique-se que é o nome correto do XML

        Button btnContinuar = findViewById(R.id.btnContinuar);

        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abre a tela com o QR Code de recarga
                Intent intent = new Intent(RecargaActivity.this, RecargaPixConfirmadaActivity.class);
                startActivity(intent);
            }
        });
    }
}