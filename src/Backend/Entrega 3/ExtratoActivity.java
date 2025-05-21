package com.example.fecapaybackend;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

// Import correto fora da classe
import com.example.fecapaybackend.BottomBarHelper;

public class ExtratoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extrato); // nome do layout

        // Ativa os botões do rodapé
        BottomBarHelper.setupNavigation(this);
    }
}
