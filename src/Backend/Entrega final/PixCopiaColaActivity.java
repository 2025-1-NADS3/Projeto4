package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class
PixCopiaColaActivity extends BaseActivity {

    private EditText edtChavePix;
    private TextView btnContinuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pix_copiar_colar); // verifique se este é o nome do layout correto
        BottomBarHelper.setupNavigation(this);
        edtChavePix = findViewById(R.id.edt_chave_pix); // EditText onde cola a chave
        btnContinuar = findViewById(R.id.btnContinuar);


        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String valor = edtChavePix.getText().toString().trim();
                if (!valor.isEmpty()) {
                    Intent intent = new Intent(PixCopiaColaActivity.this, ConfirmarTransferenciaActivity.class);
                    intent.putExtra("valor_transferencia", valor);
                    startActivity(intent);
                } else {
                    edtChavePix.setError("Cole a chave Pix antes de continuar");
                }
            }
        });
    }
}
