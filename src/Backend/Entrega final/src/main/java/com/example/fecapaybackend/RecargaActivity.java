package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RecargaActivity extends BaseActivity {

    private RadioGroup valorGroup;
    private EditText valorOutro;
    private RadioButton rbOutro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_saldo);

        // Botão "ADICIONAR SALDO CARTÃO"
        Button btnAdicionar = findViewById(R.id.btnAdicionar);
        btnAdicionar.setOnClickListener(v -> {
            Intent intent = new Intent(RecargaActivity.this, RecargaCartaoActivity.class);
            startActivity(intent);
        });

        // Inicializa os campos
        valorGroup = findViewById(R.id.valorGroup);
        valorOutro = findViewById(R.id.valorOutro);
        rbOutro = findViewById(R.id.rbOutro);

        // Botão "CONTINUAR"
        Button btnContinuar = findViewById(R.id.btnContinuar);
        btnContinuar.setOnClickListener(v -> {
            int idSelecionado = valorGroup.getCheckedRadioButtonId();
            String valor = "";

            // Nenhum botão marcado
            if (idSelecionado == -1) {
                Toast.makeText(this, "Selecione ou insira um valor.", Toast.LENGTH_SHORT).show();
                return;
            }

            // Se "Outro" foi selecionado
            if (rbOutro.isChecked()) {
                valor = valorOutro.getText().toString().trim();

                if (valor.isEmpty()) {
                    Toast.makeText(this, "Digite um valor válido.", Toast.LENGTH_SHORT).show();
                    return;
                }

                valor = "R$ " + valor; // Formata
            } else {
                // Pega texto do RadioButton selecionado
                RadioButton radioSelecionado = findViewById(idSelecionado);
                valor = radioSelecionado.getText().toString();
            }

            // Envia para a tela seguinte
            Intent intent = new Intent(RecargaActivity.this, RecargaPixConfirmadaActivity.class);
            intent.putExtra("valorSelecionado", valor);
            startActivity(intent);
        });

    }
}
