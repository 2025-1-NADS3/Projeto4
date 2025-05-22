package com.example.fecapaybackend; // ajuste conforme o nome real do seu projeto

import android.app.Activity;
import android.content.Intent;
import android.widget.ImageView;

public class BottomBarHelper {

    public static void setupNavigation(final Activity activity) {
        ImageView btnHome = activity.findViewById(R.id.btnHome);
        ImageView btnQrCode = activity.findViewById(R.id.btnQrCode);
        ImageView btnSair = activity.findViewById(R.id.btnSair);
        ImageView btnHistorico = activity.findViewById(R.id.btnHistorico);
        ImageView btnPerfil = activity.findViewById(R.id.btnPerfil);

        if (btnHome != null) {
            btnHome.setOnClickListener(v -> {
                Intent intent = new Intent(activity, Home.class);
                activity.startActivity(intent);
            });
        }

        if (btnQrCode != null) {
            btnQrCode.setOnClickListener(v -> {
                Intent intent = new Intent(activity, QrCodeActivity.class);
                activity.startActivity(intent);
            });
        }

        if (btnSair != null) {
            btnSair.setOnClickListener(v -> {
                activity.finish(); // ou redireciona para LoginActivity
            });
        }

        if (btnHistorico != null) {
            btnHistorico.setOnClickListener(v -> {
                Intent intent = new Intent(activity, ExtratoActivity.class);
                activity.startActivity(intent);
            });
        }

        if (btnPerfil != null) {
            btnPerfil.setOnClickListener(v -> {
                Intent intent = new Intent(activity, PerfilActivity.class);
                activity.startActivity(intent);
            });
        }
    }
}