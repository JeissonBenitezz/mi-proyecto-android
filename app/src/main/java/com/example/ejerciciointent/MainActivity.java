package com.example.ejerciciointent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

    }
    public void acercade(View view) {
        Intent i = new Intent(this, AcercaDe.class );
        startActivity(i);



        // Dentro de la clase MainActivity
        TextView textViewBienvenido = findViewById(R.id.textViewBienvenido);

// Puedes obtener el texto con los diferentes idiomas y asignarlo
        String mensaje = getString(R.string.bienvenido);
        textViewBienvenido.setText(mensaje);

    }
}