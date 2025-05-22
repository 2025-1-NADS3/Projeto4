package com.example.fecapaybackend;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class QrCodeActivity extends AppCompatActivity {

    private TextView btnColarPix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode);
        BottomBarHelper.setupNavigation(this);
        btnColarPix = findViewById(R.id.btnColarPix);

        btnColarPix.setOnClickListener(v -> {
            Intent intent = new Intent(QrCodeActivity.this, PixCopiaColaActivity.class);
            startActivity(intent);
        });


    }
}
