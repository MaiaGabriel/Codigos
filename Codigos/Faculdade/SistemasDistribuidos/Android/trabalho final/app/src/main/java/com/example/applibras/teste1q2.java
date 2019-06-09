package com.example.applibras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class teste1q2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste1q2);
    }

    public void letraa(View view) {
        Intent intent = new Intent(this, teste1q3.class);
        startActivity(intent);
    }

    public void letrab(View view) {
        //resposta letra b
        Intent intent = new Intent(this, teste1q3.class);
        String valor = "2";
        intent.putExtra("resultado", valor);
        startActivity(intent);
    }

    public void letrac(View view) {
        Intent intent = new Intent(this, teste1q3.class);
        startActivity(intent);
    }

    public void letrad(View view) {
        Intent intent = new Intent(this, teste1q3.class);
        startActivity(intent);
    }
}
