package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ExcluirContaActivity extends AppCompatActivity {

    private EditText etEmail, etSenha;
    private Button btnExcluir, buttonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_excluir); // Nome do XML correto

        etEmail = findViewById(R.id.etEmail);
        etSenha = findViewById(R.id.etSenha);
        btnExcluir = findViewById(R.id.btnExcluirConta);
        buttonVoltar = findViewById(R.id.buttonVoltar);

        // Lógica para excluir a conta (DELETE no banco)
        btnExcluir.setOnClickListener(v -> {
            String email = etEmail.getText().toString().trim();
            String senha = etSenha.getText().toString().trim();

            if (email.isEmpty() || senha.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show();
                return;
            }

            UsuarioDAO dao = new UsuarioDAO(this);
            boolean deletado = dao.excluirUsuario(email, senha);

            if (deletado) {
                Toast.makeText(this, "Conta excluída com sucesso!", Toast.LENGTH_SHORT).show();
                finish(); // Fecha a tela
            } else {
                Toast.makeText(this, "E-mail ou senha incorretos!", Toast.LENGTH_SHORT).show();
            }
        });

        // Botão de voltar para tela anterior
        buttonVoltar.setOnClickListener(v -> {
            Intent intent = new Intent(ExcluirContaActivity.this, BemVindoActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
