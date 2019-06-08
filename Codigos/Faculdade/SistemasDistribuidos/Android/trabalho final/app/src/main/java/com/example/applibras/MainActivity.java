package com.example.applibras;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    // nome da declaracao de criacao de uma activity main login

    // Declare variables
    ProgressDialog pDialog;
    VideoView videoview;

    // Insert your Video URL
    String VideoURL = "https://www.androidbegin.com/tutorial/AndroidCommercial.3gp";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //displays a video file
        VideoView videoView = (VideoView) findViewById(R.id.videoView);

        String videoPath = "android.resource://com.example.applibras" + R.raw.videointro;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

    }


    // nome da declaracao de criacao do menu
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    // ao clicar em sobre, irar aparecer uma mensagem alerta do nome do app e versao
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.sobre:
                AlertDialog.Builder alert = new AlertDialog.Builder(this);
                alert.setMessage("App libras v1.0")
                        .setNeutralButton("Ok", null).show();
                return true;


            case R.id.novo:
                Intent intent = new Intent(this, cadastroUsuario.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    //ao clicar no botao login, vai aparecer um toast escrito ola "fulando@tal"
    // em seguida, ao clicar o botao, ele abrira a activity bemvindo
    public void entrarClicado(View view) {
        EditText editText =
                (EditText) findViewById(R.id.editText);
        String login = editText.getText().toString();
        String msg = "Olá " + login + " !!";
        Toast.makeText(this, msg,
                Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, BemVindoActivity.class);
        startActivity(intent);
    }


}
