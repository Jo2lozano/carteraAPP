package com.cdp.carteraapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.cdp.carteraapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    Button btnOtra; // Corregido: 'button' debe ser 'Button'
    private Button btnRegistrar;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOtra = findViewById(R.id.btnCambiar); // Corregido: 'bntCambiar' a 'btnCambiar'
        btnOtra.setOnClickListener(new View.OnClickListener() { // Corregido: 'setOnclickListener' a 'setOnClickListener'
            @Override
            public void onClick(View view) { // Corregido: 'Onclick' a 'onClick'
                Intent intent = new Intent(MainActivity.this, OtraActivity.class); // Corregido: 'intent' a 'Intent'
                startActivity(intent); // Añadido 'startActivity(intent);'
            }
        });
        btnRegistrar = findViewById(R.id.btnregistrar);
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

    }

    }


