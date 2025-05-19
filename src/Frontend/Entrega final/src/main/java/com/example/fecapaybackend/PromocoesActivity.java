package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PromocoesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promocoes);

        TextView btnCupom1 = findViewById(R.id.btnCupom1);
        TextView btnCupom2 = findViewById(R.id.btnCupom2);
        TextView btnCupom3 = findViewById(R.id.btnCupom3);
        TextView btnCupom4 = findViewById(R.id.btnCupom4);

        View.OnClickListener abrirCupom = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PromocoesActivity.this, SeuCupomActivity.class); // Abre a tela do cupom
                startActivity(intent);
            }
        };

        btnCupom1.setOnClickListener(abrirCupom);
        btnCupom2.setOnClickListener(abrirCupom);
        btnCupom3.setOnClickListener(abrirCupom);
        btnCupom4.setOnClickListener(abrirCupom);
    }
}
