package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TransferenciaActivity extends BaseActivity {

    private EditText etValor;
    private TextView btnContinuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valor_transferencia); // Certifique-se que esse é o XML certo
        BottomBarHelper.setupNavigation(this); // Ativa o rodapé

        etValor = findViewById(R.id.et_valor); // Certifique-se que o ID do campo está correto
        btnContinuar = findViewById(R.id.btn_continuar); // Confirme esse ID também

        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor = etValor.getText().toString().trim();

                if (!valor.isEmpty()) {
                    Intent intent = new Intent(TransferenciaActivity.this, PixChaveActivity.class); // Mude aqui se quiser ir para Confirmar direto
                    intent.putExtra("valor_transferencia", valor);
                    startActivity(intent);
                } else {
                    etValor.setError("Digite um valor");
                }
            }
        });
    }
}
