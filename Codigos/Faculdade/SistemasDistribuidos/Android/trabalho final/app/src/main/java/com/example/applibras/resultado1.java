package com.example.applibras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class resultado1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado1);

        Intent intent = getIntent();
        String resultado = intent.getStringExtra("resultado");
        TextView textBemVindo =
                (TextView) findViewById(R.id.textBemVindo);
        textBemVindo.setText(Html.fromHtml(
                "Amigo, você acertou <b>" + resultado +
                        "</b> questões!"));
    }

    public void voltarmenu(View view) {
        Intent intent = new Intent(this, BemVindoActivity.class);
        startActivity(intent);
    }
}
