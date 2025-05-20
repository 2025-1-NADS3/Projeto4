package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BemVindoActivity extends AppCompatActivity {

    EditText editEmail, editPassword;
    CheckBox checkboxRemember;
    Button buttonLogin, buttonEsqueciSenha, buttonExcluirConta, buttonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bem_vindo);

        // Conectando componentes com IDs do XML
        editEmail = findViewById(R.id.edit_email);
        editPassword = findViewById(R.id.edit_password);
        checkboxRemember = findViewById(R.id.checkbox_remember);
        buttonLogin = findViewById(R.id.button_login);
        buttonEsqueciSenha = findViewById(R.id.bt_esqueci_a_senha);
        buttonExcluirConta = findViewById(R.id.bt_delete_account);
        buttonVoltar = findViewById(R.id.bt_Voltar);

        // ====== LOGIN (READ no banco)
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = editEmail.getText().toString();
                String senha = editPassword.getText().toString();

                if (email.isEmpty() || senha.isEmpty()) {
                    Toast.makeText(BemVindoActivity.this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show();
                    return;
                }

                UsuarioDAO dao = new UsuarioDAO(BemVindoActivity.this);
                boolean loginOK = dao.verificarLogin(email, senha);

                if (loginOK) {
                    Toast.makeText(BemVindoActivity.this, "Login realizado com sucesso!", Toast.LENGTH_SHORT).show();

                    // Redirecionar para a tela principal
                    Intent intent = new Intent(BemVindoActivity.this, Home.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(BemVindoActivity.this, "E-mail ou senha incorretos.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // ====== Redefinir senha
        buttonEsqueciSenha.setOnClickListener(v -> {
            Intent intent = new Intent(BemVindoActivity.this, EsqueciSenhaActivity.class);
            startActivity(intent);
        });

        // ====== Excluir conta
        buttonExcluirConta.setOnClickListener(v -> {
            Intent intent = new Intent(BemVindoActivity.this, ExcluirContaActivity.class);
            startActivity(intent);
        });

        // ====== Voltar para tela anterior
        buttonVoltar.setOnClickListener(v -> {
            Intent intent = new Intent(BemVindoActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}