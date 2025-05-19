package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class QrCodeActivity extends AppCompatActivity {

    private TextView btnColarPix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode); // Confirme se esse é o nome do layout

        btnColarPix = findViewById(R.id.btnColarPix);

        btnColarPix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QrCodeActivity.this, PixCopiaColaActivity.class);
                startActivity(intent);
            }
        });
    }
}
