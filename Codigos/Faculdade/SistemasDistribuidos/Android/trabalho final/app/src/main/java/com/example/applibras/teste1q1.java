package com.example.applibras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class teste1q1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste1q1);
    }

    public void respb(View view) {
        Intent intent = new Intent(this, teste1q2.class);
        startActivity(intent);
    }

    public void respc(View view) {
        //resposta letra c
        Intent intent = new Intent(this, teste1q2.class);
        String valor = "1";
        intent.putExtra("resultado", valor);
        startActivity(intent);


    }

    public void respd(View view) {
        Intent intent = new Intent(this, teste1q2.class);
        startActivity(intent);
    }

    public void respa(View view) {
        Intent intent = new Intent(this, teste1q2.class);
        startActivity(intent);
    }
}
