package com.example.applibras;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import static com.example.applibras.R.raw.intro;

public class testevideo extends AppCompatActivity {


    Button clk;
    VideoView videov;
    MediaController mediaC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testevideo);

        clk = (Button) findViewById(R.id.button23);
        videov = (VideoView) findViewById(R.id.videoView2);
        mediaC = new MediaController(this);

    }

    public void videoplay(View v)
    {
        Uri uri2 = Uri.parse("rtsp://r3---sn-q4fl6ney.googlevideo.com/Cj0LENy73wIaNAlOJijVt3j5FhMYDSANFC3HwfxcMOCoAUIASARgv4q-y7DHpZVcigELUkM0SVNqenBWMGcM/C7FB8E80ACC022FE47E956465181B9B0C25E6476.8D35117BD4DD2BA39D40FA0B3C1372095D1761C2/yt8/1/video.3gp");
        //String videoPath = "android.resource://com.example.applibras/" + R.raw.intro;
        //Uri uri = Uri.parse(videoPath);
        videov.setVideoURI(uri2);
        videov.setMediaController(mediaC);
        mediaC.setAnchorView(videov);
        videov.requestFocus();
        videov.start();
    }
}
