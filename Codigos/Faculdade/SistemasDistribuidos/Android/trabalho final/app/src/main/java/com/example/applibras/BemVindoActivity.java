package com.example.applibras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BemVindoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bem_vindo);
    }

    public void novoscursos(View view) {

    }

    public void meuscursos(View view) {
        Intent intent = new Intent(this, meus_cursos.class);
        startActivity(intent);
    }

    public void testes(View view) {
        Intent intent = new Intent(this, testes.class);
        startActivity(intent);
    }

    public void duvidas(View view) {

    }

    public void planos(View view) {
        Intent intent = new Intent(this, testevideo.class);
        startActivity(intent);
    }
}
