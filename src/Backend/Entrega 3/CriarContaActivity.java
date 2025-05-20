package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CriarContaActivity extends AppCompatActivity {

    private EditText nome, sobrenome, ra, celular, cpf, email, senha, confirmarSenha;
    private CheckBox checkBox;
    private Button btnCriarConta, buttonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_conta);

        // Conectar os elementos do layout com os IDs corretos do XML
        nome = findViewById(R.id.etNome);
        sobrenome = findViewById(R.id.etSobrenome);
        ra = findViewById(R.id.etRa);
        celular = findViewById(R.id.etCelular);
        cpf = findViewById(R.id.etCpf);
        email = findViewById(R.id.etEmail);
        senha = findViewById(R.id.etSenha);
        confirmarSenha = findViewById(R.id.etConfirmarSenha);
        checkBox = findViewById(R.id.cbTermos);
        btnCriarConta = findViewById(R.id.btnCriarConta);
        buttonVoltar = findViewById(R.id.buttonVoltar);

        // Ação do botão Criar Conta
        btnCriarConta.setOnClickListener(v -> {

            if (!checkBox.isChecked()) {
                Toast.makeText(this, "Você precisa aceitar os termos de uso!", Toast.LENGTH_SHORT).show();
                return;
            }

            String nomeStr = nome.getText().toString();
            String sobrenomeStr = sobrenome.getText().toString();
            String raStr = ra.getText().toString();
            String celularStr = celular.getText().toString();
            String cpfStr = cpf.getText().toString();
            String emailStr = email.getText().toString();
            String senhaStr = senha.getText().toString();
            String confirmarSenhaStr = confirmarSenha.getText().toString();

            if (nomeStr.isEmpty() || emailStr.isEmpty() || senhaStr.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos obrigatórios!", Toast.LENGTH_SHORT).show();
                return;
            }

            if (!senhaStr.equals(confirmarSenhaStr)) {
                Toast.makeText(this, "As senhas não coincidem!", Toast.LENGTH_SHORT).show();
                return;
            }

            // Chamar o DAO para salvar no banco
            UsuarioDAO dao = new UsuarioDAO(this);
            boolean sucesso = dao.cadastrarUsuario(nomeStr, sobrenomeStr, raStr, celularStr, cpfStr, emailStr, senhaStr);

            if (sucesso) {
                Toast.makeText(this, "Conta criada com sucesso!", Toast.LENGTH_SHORT).show();
                finish(); // ou redirecionar para outra tela
            } else {
                Toast.makeText(this, "Erro ao criar conta. E-mail já está em uso?", Toast.LENGTH_SHORT).show();
            }
        });

        // Ação do botão Voltar
        buttonVoltar.setOnClickListener(v -> {
            startActivity(new Intent(CriarContaActivity.this, MainActivity.class));
            finish();
        });
    }
}