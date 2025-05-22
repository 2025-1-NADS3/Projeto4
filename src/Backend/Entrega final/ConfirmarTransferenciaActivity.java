package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ConfirmarTransferenciaActivity extends BaseActivity {

    private TextView txtValor, txtChavePix, btnTransferir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirma_dados);
        BottomBarHelper.setupNavigation(this);

        // Recupera os dados das telas anteriores
        String valor = getIntent().getStringExtra("valor_transferencia");
        String chavePix = getIntent().getStringExtra("chave_pix");

        // Referencia os elementos
        txtValor = findViewById(R.id.txt_valor_transferido);
        txtChavePix = findViewById(R.id.txt_chave_pix); // ESSA LINHA É O QUE ESTAVA FALTANDO
        btnTransferir = findViewById(R.id.btn_transferir);

        // Exibe os valores
        if (valor != null && !valor.isEmpty()) {
            txtValor.setText("R$ " + valor);
        }

        if (chavePix != null && !chavePix.isEmpty()) {
            txtChavePix.setText("Chave Pix: " + chavePix);
        }

        // Botão transferir
        btnTransferir.setOnClickListener(v -> {
            Intent intent = new Intent(ConfirmarTransferenciaActivity.this, TransferenciaConcluidaActivity.class);
            intent.putExtra("valor_enviado", valor);
            startActivity(intent);
        });
    }
}
