package com.example.guiaturistico;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private ImageButton btnJardimBotanico, btnKasatoMaru, btnMacs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btnJardimBotanico = (ImageButton) findViewById(R.id.btnJardimBotanico);
        this.setIntent(this.btnJardimBotanico, JardimBotanicoActivy.class);

        this.btnKasatoMaru = (ImageButton) findViewById(R.id.btnKasatoMaru);

        this.btnMacs = (ImageButton) findViewById(R.id.btnMacs);
    }

    private void setIntent(ImageButton imageButton, Class viewClass)
    {
        imageButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, viewClass);
            startActivity(intent);
        });
    }
}