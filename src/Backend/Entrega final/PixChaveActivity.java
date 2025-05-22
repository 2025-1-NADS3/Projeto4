package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PixChaveActivity extends BaseActivity {

    private EditText edtChavePix;
    private TextView btnContinuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pix_chave);
        BottomBarHelper.setupNavigation(this);

        edtChavePix = findViewById(R.id.edt_chave_pix);
        btnContinuar = findViewById(R.id.btnContinuar);

        btnContinuar.setOnClickListener(v -> {
            String chave = edtChavePix.getText().toString().trim();
            String valor = getIntent().getStringExtra("valor_transferencia");

            if (!chave.isEmpty()) {
                Intent intent = new Intent(PixChaveActivity.this, ConfirmarTransferenciaActivity.class);
                intent.putExtra("valor_transferencia", valor);
                intent.putExtra("chave_pix", chave);
                startActivity(intent);
            } else {
                edtChavePix.setError("Digite uma chave Pix válida");
            }
        });
    }
}
