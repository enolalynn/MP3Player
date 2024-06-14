package com.enola.mp3player;

import static com.enola.mp3player.HomeActivity.mySongs;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.OptIn;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.RawResourceDataSource;
import androidx.media3.exoplayer.ExoPlayer;

public class MainActivity extends AppCompatActivity {
    private TextView tvArtist;
    private ImageView ivArtist;
    private Button btPrev, btPause, btNext;
    private int artistIndex;
    private Data data;
    private static ExoPlayer exoPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDataFromIntent();
        initUi();
        initPlayer();
        initListeners();
    }

    private void initDataFromIntent() {
        if(getIntent() != null){
            artistIndex = getIntent().getIntExtra("artist_index",0);
            data = (Data) getIntent().getSerializableExtra("artist");
        }
    }

    private void initPlayer() {
        if(exoPlayer == null)
            exoPlayer = new ExoPlayer.Builder(this).build();
        updatePlayer();
    }

    private void initListeners() {
        btNext.setOnClickListener(v -> {
            if(artistIndex == mySongs.size() - 1){
                artistIndex = 0;
            }else {
                artistIndex ++;
            }
            data = mySongs.get(artistIndex);
            updatePlayer();
        });

        btPrev.setOnClickListener(v-> {
            if(artistIndex == 0){
                artistIndex = mySongs.size() -1;
            }else {
                artistIndex --;
            }
            data = mySongs.get(artistIndex);
            updatePlayer();
        });

        btPause.setOnClickListener(v->{
            if(exoPlayer.isPlaying()){
                exoPlayer.pause();
                btPause.setText(getResources().getString(R.string.play));
            }else {
                exoPlayer.play();
                btPause.setText(getResources().getString(R.string.pause));
            }
        });

    }


    @OptIn(markerClass = UnstableApi.class)
    private void updatePlayer() {
        tvArtist.setText(data.artistName());
        ivArtist.setImageResource(data.artistPhoto());
        Uri song = RawResourceDataSource.buildRawResourceUri(data.artistSong());

        exoPlayer.setMediaItem(MediaItem.fromUri(song));
        exoPlayer.prepare();
        exoPlayer.play();

    }

    private void initUi() {
        tvArtist = findViewById(R.id.tv_Artist);
        ivArtist = findViewById(R.id.iv_Artist);
        btNext = findViewById(R.id.bt_next);
        btPause = findViewById(R.id.bt_pause);
        btPrev = findViewById(R.id.bt_previous);
    }
}