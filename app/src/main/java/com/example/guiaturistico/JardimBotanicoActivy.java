package com.example.guiaturistico;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class JardimBotanicoActivy extends AppCompatActivity {

    private Button btnMapa, btnSite, btnLigar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jardim_botanico_activy);

        this.btnMapa = (Button) findViewById(R.id.btnMapa);

        this.btnMapa.setOnClickListener(v -> {
            Uri gmmIntentUri = Uri.parse("geo:0,0?q=Jardim+Botânico+de+Sorocaba+Irmãos+Villas-Bôas");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            startActivity(mapIntent);
        });

        this.btnSite = (Button) findViewById(R.id.btnSite);

        this.btnSite.setOnClickListener(v -> {
            Uri webpage = Uri.parse("https://turismo.sorocaba.sp.gov.br/visite/jardim-botanico-irmaos-vilas-boas/#gsc.tab=0");
            Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
            startActivity(intent);
        });

        this.btnLigar = (Button) findViewById(R.id.btnLigar);

        this.btnLigar.setOnClickListener(v -> {
            Uri uri = Uri.parse("tel:15");

            Intent intent = new Intent(Intent.ACTION_DIAL, uri);

            startActivity(intent);
        });
    }
}