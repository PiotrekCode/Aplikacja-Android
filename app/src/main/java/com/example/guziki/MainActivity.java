package com.example.guziki;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView text = findViewById(R.id.textView);

        Button przycisk1 = findViewById(R.id.przycisk1);
        Button przycisk2 = findViewById(R.id.przycisk2);
        Button przycisk3 = findViewById(R.id.przycisk3);
        Button przycisk4 = findViewById(R.id.przycisk4);
        Button przycisk5 = findViewById(R.id.przycisk5);

        przycisk1.setOnClickListener(view -> text.setTextColor(Color.GREEN));

        przycisk2.setOnClickListener(view -> text.setText("Aplikacja"));

        przycisk3.setOnClickListener(view -> text.setVisibility(TextView.GONE));

        przycisk4.setOnClickListener(view -> {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                });

        przycisk5.setOnClickListener(view -> text.setTextSize(43));


    }
}