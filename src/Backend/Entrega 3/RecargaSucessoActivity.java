// RecargaSucessoActivity.java
package com.example.fecapaybackend;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class RecargaSucessoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recarga); // esse deve ser o layout da tela que você quer mostrar DEPOIS dos 5s
    }
}