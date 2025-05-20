package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class TransferenciaConcluidaActivity extends AppCompatActivity {

    private LinearLayout btnAbrirComprovante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transferencia_concluida);

        // Confirme que esse ID existe no layout
        btnAbrirComprovante = findViewById(R.id.btnAbrirComprovante);

        btnAbrirComprovante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TransferenciaConcluidaActivity.this, ComprovanteActivity.class);
                startActivity(intent);
            }
        });
    }
}