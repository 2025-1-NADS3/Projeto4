package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

public class AjudaContatoActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajuda_contato); // layout com os botões Ajuda e Contato

        LinearLayout btnAjuda = findViewById(R.id.btnAjuda);
        LinearLayout btnContato = findViewById(R.id.btnContato);

        if (btnAjuda != null) {
            btnAjuda.setOnClickListener(v -> {
                Intent intent = new Intent(AjudaContatoActivity.this, AjudaActivity.class);
                startActivity(intent);
            });
        }

        if (btnContato != null) {
            btnContato.setOnClickListener(v -> {
                Intent intent = new Intent(AjudaContatoActivity.this, ContatoActivity.class);
                startActivity(intent);
            });
        }
    }
}
