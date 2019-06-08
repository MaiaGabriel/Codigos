package com.example.applibras;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class cadastroUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario);
    }

    public void onconcluir(View view) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("cadastro realizado com sucesso!!")
                .setNeutralButton("Ok", null).show();
    }
}
