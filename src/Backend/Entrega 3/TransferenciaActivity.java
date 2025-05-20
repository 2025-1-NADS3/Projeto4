package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class TransferenciaActivity extends AppCompatActivity {

    private EditText etValor;
    private TextView btnContinuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valor_transferencia); // XML da tela que você mostrou

        etValor = findViewById(R.id.et_valor);
        btnContinuar = findViewById(R.id.btn_continuar);

        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor = etValor.getText().toString().trim();

                if (!valor.isEmpty()) {
                    Intent intent = new Intent(TransferenciaActivity.this, ConfirmarTransferenciaActivity.class);
                    intent.putExtra("valor_transferencia", valor);
                    startActivity(intent);
                } else {
                    etValor.setError("Digite um valor");
                }
            }
        });
    }
}