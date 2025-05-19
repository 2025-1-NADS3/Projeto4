package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RecargaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_saldo); // O layout que contém o botão

        Button btnAdicionar = findViewById(R.id.btnAdicionar); // Esse ID vem do botão no seu XML

        btnAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Verifique se essa Activity está no manifest
                Intent intent = new Intent(RecargaActivity.this, RecargaCartaoActivity.class);
                startActivity(intent);
            }
        });
    }
}
