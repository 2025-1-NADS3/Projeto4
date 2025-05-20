package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class RecargaCartaoActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recarga_cartao); // layout da tela com botão CONTINUAR

        Button btnContinuar = findViewById(R.id.btnContinuar); // botão CONTINUAR

        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Abre a tela com o check verde
                Intent intent = new Intent(RecargaCartaoActivity.this, RecargaConfirmadaActivity.class);
                startActivity(intent);
            }
        });
    }
}
