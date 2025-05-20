package com.example.fecapaybackend;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AdicionarSaldo extends AppCompatActivity {

    private ImageButton btnNotificacao, btnSair, btnQrCode, btnHome, btnExtrato, btnPerfil;
    private TextView saldoTexto;
    private Button btnAdicionar, btnContinua;
    private EditText valorOutro;
    private RadioGroup valorGroup, metodoPagamentoGroup;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recarga); // nome do seu XML

        // Botões do topo
        btnNotificacao = findViewById(R.id.btnNotificacao);
        btnNotificacao.setOnClickListener(v -> {
            startActivity(new Intent(this, notificacoes.class));
        });

        // Rodapé
        btnSair = findViewById(R.id.btnSair);
        btnQrCode = findViewById(R.id.btnQrCode);
        btnHome = findViewById(R.id.btnHome);
        btnExtrato = findViewById(R.id.btnExtrato);
        btnPerfil = findViewById(R.id.btnPerfil);

        btnSair.setOnClickListener(v -> {
            startActivity(new Intent(this, BemVindoActivity.class));
            finish();
        });

        btnQrCode.setOnClickListener(v -> {
            startActivity(new Intent(this, QrCodeActivity.class));
        });

        btnHome.setOnClickListener(v -> {
            startActivity(new Intent(this, Home.class));
        });

        btnExtrato.setOnClickListener(v -> {
            startActivity(new Intent(this, Extrato.class));
        });

        btnPerfil.setOnClickListener(v -> {
            startActivity(new Intent(this, Perfil.class));
        });

        // Campos de recarga
        saldoTexto = findViewById(R.id.saldoTexto);
        btnAdicionar = findViewById(R.id.btnAdicionar);
        btnContinua = findViewById(R.id.btnContinua);
        valorOutro = findViewById(R.id.valorOutro);
        valorGroup = findViewById(R.id.valorGroup);
        metodoPagamentoGroup = findViewById(R.id.metodoPagamentoGroup);

        // Clique no botão ADICIONAR SALDO
        btnAdicionar.setOnClickListener(v -> {
            Toast.makeText(this, "Funcionalidade de recarga ainda não implementada", Toast.LENGTH_SHORT).show();
        });

        // Clique em CONTINUAR
        btnContinua.setOnClickListener(v -> {
            String valorSelecionado = getValorSelecionado();
            String metodoSelecionado = getMetodoPagamentoSelecionado();

            if (valorSelecionado.isEmpty() || metodoSelecionado.isEmpty()) {
                Toast.makeText(this, "Selecione um valor e método de pagamento", Toast.LENGTH_SHORT).show();
                return;
            }

            Toast.makeText(this, "Valor: " + valorSelecionado + "\nMétodo: " + metodoSelecionado, Toast.LENGTH_LONG).show();

            // Aqui você poderia redirecionar para tela de confirmação, ex:
            // Intent intent = new Intent(this, ConfirmarRecargaActivity.class);
            // intent.putExtra("valor", valorSelecionado);
            // intent.putExtra("metodo", metodoSelecionado);
            // startActivity(intent);
        });
    }

    private String getValorSelecionado() {
        int id = valorGroup.getCheckedRadioButtonId();

        if (id == R.id.rbOutro) {
            String outro = valorOutro.getText().toString().trim();
            return outro.isEmpty() ? "" : "R$ " + outro;
        } else if (id != -1) {
            RadioButton selected = findViewById(id);
            return selected.getText().toString();
        }

        return "";
    }

    private String getMetodoPagamentoSelecionado() {
        int id = metodoPagamentoGroup.getCheckedRadioButtonId();
        if (id != -1) {
            RadioButton selected = findViewById(id);
            return selected.getText().toString();
        }
        return "";
    }
}
