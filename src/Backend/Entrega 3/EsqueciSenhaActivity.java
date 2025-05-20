package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EsqueciSenhaActivity extends AppCompatActivity {

    private EditText etEmail, etNovaSenha, etConfirmarSenha;
    private Button btnRedefinirSenha, buttonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esqueceu_asenha);

        etEmail = findViewById(R.id.etEmail);
        etNovaSenha = findViewById(R.id.etNovaSenha);
        etConfirmarSenha = findViewById(R.id.etConfirmarSenha);
        btnRedefinirSenha = findViewById(R.id.btnRedefinirSenha);
        buttonVoltar = findViewById(R.id.buttonVoltar);

        // Clique para redefinir a senha (UPDATE no banco)
        btnRedefinirSenha.setOnClickListener(v -> {
            String email = etEmail.getText().toString();
            String novaSenha = etNovaSenha.getText().toString();
            String confirmar = etConfirmarSenha.getText().toString();

            if (email.isEmpty() || novaSenha.isEmpty() || confirmar.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show();
                return;
            }

            if (!novaSenha.equals(confirmar)) {
                Toast.makeText(this, "As senhas não coincidem!", Toast.LENGTH_SHORT).show();
                return;
            }

            // Atualizar no banco
            UsuarioDAO dao = new UsuarioDAO(this);
            boolean sucesso = dao.atualizarSenha(email, novaSenha);

            if (sucesso) {
                Toast.makeText(this, "Senha redefinida com sucesso!", Toast.LENGTH_SHORT).show();
                finish(); // fecha a tela
            } else {
                Toast.makeText(this, "E-mail não encontrado no sistema!", Toast.LENGTH_SHORT).show();
            }
        });

        // Clique para voltar à tela anterior
        buttonVoltar.setOnClickListener(v -> {
            Intent intent = new Intent(EsqueciSenhaActivity.this, BemVindoActivity.class);
            startActivity(intent);
            finish();
        });
    }
}