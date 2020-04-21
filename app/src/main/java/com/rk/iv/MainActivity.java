package com.rk.iv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView IV_1_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IV_1_IDJAVA = findViewById(R.id.IV_1_IDXML);
        IV_1_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Gambar Pertama di Klik", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
