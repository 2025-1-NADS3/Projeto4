package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends BaseActivity {

    LinearLayout botaoPagar, botaoRecarga, botaoQRCode, botaoPromocoes;
    TextView textSaldo;
    ImageView btnMostrarOcultar;
    boolean saldoVisivel = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Botões de navegação
        ImageView btnMenu = findViewById(R.id.btnMenu);
        ImageView btnSino = findViewById(R.id.btnSino);
        botaoPagar = findViewById(R.id.botao_pagar);
        botaoRecarga = findViewById(R.id.botao_recarga);
        botaoQRCode = findViewById(R.id.botao_qrcode);
        botaoPromocoes = findViewById(R.id.botao_promocoes);

        botaoPagar.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, PagarActivity.class);
            startActivity(intent);
        });

        botaoRecarga.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, RecargaActivity.class);
            startActivity(intent);
        });

        botaoQRCode.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, QrCodeActivity.class);
            startActivity(intent);
        });

        botaoPromocoes.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, PromocoesActivity.class);
            startActivity(intent);
        });
        // Clique no sino (notificações)
        btnSino.setOnClickListener(v -> {
            // Por exemplo, abrir uma tela de notificações
            Intent intent = new Intent(Home.this, NotificacoesActivity.class);
            startActivity(intent);
        });

        btnMenu.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, AjudaContatoActivity.class);
            startActivity(intent);
        });


        // Controle de visibilidade do saldo
        textSaldo = findViewById(R.id.textSaldo);
        btnMostrarOcultar = findViewById(R.id.btnMostrarOcultar);

        btnMostrarOcultar.setOnClickListener(v -> {
            if (saldoVisivel) {
                textSaldo.setText("R$ ---------");
                // btnMostrarOcultar.setImageResource(R.drawable.olho_fechado); // se tiver
            } else {
                textSaldo.setText("R$ 1.000.000.000,00"); // valor real aqui
                // btnMostrarOcultar.setImageResource(R.drawable.olho); // se quiser mudar
            }
            saldoVisivel = !saldoVisivel;
        });
    }
}
