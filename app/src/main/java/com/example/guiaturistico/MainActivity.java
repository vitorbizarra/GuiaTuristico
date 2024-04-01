package com.example.guiaturistico;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {
    private ImageButton btnJardimBotanico, btnKasatoMaru, btnMacs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int permissionCheck = ContextCompat.checkSelfPermission(this, android.Manifest.permission.CALL_PHONE);

        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CALL_PHONE},1);
        }

        this.btnJardimBotanico = (ImageButton) findViewById(R.id.btnJardimBotanico);
        this.setIntent(this.btnJardimBotanico, JardimBotanicoActivity.class);

        this.btnKasatoMaru = (ImageButton) findViewById(R.id.btnKasatoMaru);
        this.setIntent(this.btnKasatoMaru, KasatoMaruActivity.class);

        this.btnMacs = (ImageButton) findViewById(R.id.btnMacs);
        this.setIntent(this.btnMacs, MacsActivity.class);
    }

    private void setIntent(ImageButton imageButton, Class viewClass)
    {
        imageButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, viewClass);
            startActivity(intent);
        });
    }
}