package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ConfirmarTransferenciaActivity extends AppCompatActivity {

    private TextView txtValor, btnTransferir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirma_dados); // Certifique-se de que o nome do XML está correto

        // Captura o valor vindo da tela anterior
        String valor = getIntent().getStringExtra("valor_transferencia");

        // Referencia os elementos do layout
        txtValor = findViewById(R.id.txt_valor);
        btnTransferir = findViewById(R.id.btn_transferir);

        // Exibe o valor recebido
        if (valor != null && !valor.isEmpty()) {
            txtValor.setText("R$ " + valor);
        }

        // Clique no botão TRANSFERIR
        btnTransferir.setOnClickListener(v -> {
            // Enviar o valor para a próxima tela, se quiser mostrar lá também
            Intent intent = new Intent(ConfirmarTransferenciaActivity.this, TransferenciaConcluidaActivity.class);
            intent.putExtra("valor_enviado", valor); // Se for usar na próxima tela
            startActivity(intent);
        });
    }
}
