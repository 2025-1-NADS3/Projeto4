package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class RecargaConfirmadaActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recarga); // tela com o check verde ✅
        BottomBarHelper.setupNavigation(this);
        // Referência ao botão
        LinearLayout btnAbrirComprovante = findViewById(R.id.btnAbrirComprovante);

        // Ação de clique
        btnAbrirComprovante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Abre a tela de comprovante
                Intent intent = new Intent(RecargaConfirmadaActivity.this, ComprovanteActivity.class);
                startActivity(intent);
            }
        });
    }
}
