package com.example.fecapaybackend;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class AjudaActivity extends BaseActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajuda_explicacoes);
        BottomBarHelper.setupNavigation(this);
    }
}
