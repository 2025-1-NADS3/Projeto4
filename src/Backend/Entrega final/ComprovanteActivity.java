package com.example.fecapaybackend;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ComprovanteActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comprovante); // nome do seu XML
        BottomBarHelper.setupNavigation(this);
        String valor = getIntent().getStringExtra("valorSelecionado");

        // Encontra o TextView no layout e define o valor
        TextView txtValor = findViewById(R.id.txt_valor_comprovante);
        if (valor != null && !valor.isEmpty()) {
            txtValor.setText(valor);
        }
    }
}
