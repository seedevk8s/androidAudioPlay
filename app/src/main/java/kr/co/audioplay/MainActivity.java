package kr.co.audioplay;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);
    }

    public void startResAudio(View v) {
        mp = MediaPlayer.create(this, R.raw.dbd);
        mp.start();
    }

    public void stopResAudio(View v) {
        if (mp != null) {
            mp.stop();
            mp.release();
        }
        mp = null;
    }
}