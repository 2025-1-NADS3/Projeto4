package com.example.fecapaybackend;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

// Import CORRETO, aqui em cima
import com.example.fecapaybackend.BottomBarHelper;

public class PerfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        // Ativa os botões do rodapé
        BottomBarHelper.setupNavigation(this);
    }
}
