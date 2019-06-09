package com.example.applibras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class testes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testes);
    }

    public void testedois(View view) {

    }

    public void testeum(View view) {
        Intent intent = new Intent(this, teste1q1.class);
        startActivity(intent);
    }
}
