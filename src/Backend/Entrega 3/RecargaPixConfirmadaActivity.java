package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RecargaPixConfirmadaActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ler_qrcode); // tela do QR Code

        // Recebe o valor da recarga da tela anterior
        var ref = new Object() {
            String valor = getIntent().getStringExtra("valorSelecionado");
        };

        // Mostra o valor na tela do QR Code (ajuste o ID conforme seu layout)
        TextView txtValor = findViewById(R.id.txtValor); // certifique-se que esse ID existe no XML
        ref.valor = getIntent().getStringExtra("valorSelecionado");

        if (ref.valor != null && !ref.valor.isEmpty()) {
            txtValor.setText(ref.valor);
        }

        // Aguarda 5 segundos e abre a tela de confirmação com o valor
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(RecargaPixConfirmadaActivity.this, RecargaConfirmadaActivity.class);
            intent.putExtra("valorSelecionado", ref.valor); // envia o valor para o comprovante
            startActivity(intent);
            finish();
        }, 5000); // 5000ms = 5 segundos
    }
}