package com.example.applibras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class teste1q3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste1q3);
    }

    public void letraa(View view) {
        //resposta letra a

        Intent intent = new Intent(this, resultado1.class);
        String valor = "3";
        intent.putExtra("resultado", valor);
        startActivity(intent);

    }

    public void letrab(View view) {
        Intent intent = new Intent(this, resultado1.class);
        startActivity(intent);

    }

    public void letrac(View view) {
        Intent intent = new Intent(this, resultado1.class);
        startActivity(intent);
    }

    public void letrad(View view) {
        Intent intent = new Intent(this, resultado1.class);
        startActivity(intent);
    }
}
