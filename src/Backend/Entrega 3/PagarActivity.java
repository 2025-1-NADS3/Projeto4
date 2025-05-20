package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class PagarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagar);

        LinearLayout btnTransferir = findViewById(R.id.btnTransferir);
        LinearLayout botao_qrcode = findViewById(R.id.botao_qrcode);
        LinearLayout btnPixCopiaCola = findViewById(R.id.btnPixCopiaCola);
        LinearLayout contatoRoberta = findViewById(R.id.contatoRoberta); // ID do LinearLayout da Roberta Messi

        // Botão Transferir
        btnTransferir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PagarActivity.this, TransferenciaActivity.class);
                startActivity(intent);
            }
        });

        // Botão QR Code
        botao_qrcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PagarActivity.this, QrCodeActivity.class);
                startActivity(intent);
            }
        });

        // Botão Pix Copia e Cola
        btnPixCopiaCola.setOnClickListener(v -> {
            Intent intent = new Intent(PagarActivity.this, PixCopiaColaActivity.class);
            startActivity(intent);
        });

        // Clique no contato Roberta Messi
        contatoRoberta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PagarActivity.this, TransferenciaActivity.class);
                intent.putExtra("nome_contato", "ROBERTA MESSI"); // se quiser usar esse nome na próxima tela
                startActivity(intent);
            }
        });
    }
}