package com.example.avaliacao2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bt_one, bt_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_one = findViewById(R.id.bt_one);
        bt_two = findViewById(R.id.bt_two);

        bt_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String texto = "Este é o Botão 1";

                Toast.makeText(MainActivity.this, texto, Toast.LENGTH_LONG).show();
            }
        });

        bt_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Botao2.class);
                startActivity(intent);
            }
        });
    }
}