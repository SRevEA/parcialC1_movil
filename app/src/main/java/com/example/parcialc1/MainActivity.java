package com.example.parcialc1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    public void iniciarSesion(View view){

        EditText a = findViewById(R.id.edtUsuario);

        EditText b = findViewById(R.id.edtContrasena);


        if (a.getText().toString().isEmpty() || b.getText().toString().isEmpty()) {

            Toast.makeText(this, "Por favor llenar los campos.", Toast.LENGTH_LONG).show();

        } else if (a.getText().toString().equals("uac123") && b.getText().toString().equals("12345678")) {

            Intent validado = new Intent(this, MainActivity2.class);

            startActivity(validado);

        }else {

            Toast.makeText(this, "Usuario o contrasena incorrectos", Toast.LENGTH_LONG).show();

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }
}