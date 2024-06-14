package com.enola.mp3player;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class HomeActivity extends AppCompatActivity {
    static  final List<Data> mySongs = List.of(
          new Data ("HRVY",R.drawable.be_ok ,R.raw.be_ok),
            new Data ("Slander",R.drawable.better_than_heaven,R.raw.betterthanheaven),
            new Data ("Stray Kids",R.drawable.hellevator ,R.raw.hellevator),
            new Data ("Sasha Sloan",R.drawable.download ,R.raw.hero),
            new Data ("Twenty One Pilots",R.drawable.holding_onto_you ,R.raw.holdingontoyou),
            new Data ("One Ok Rock",R.drawable.i_was_king,R.raw.i_was_king),
            new Data ("Stray Kids",R.drawable.lalalala ,R.raw.lalalala),
            new Data ("One Ok Rock",R.drawable.listen ,R.raw.llisten),
            new Data ("Stray Kids",R.drawable.maniac,R.raw.maniac),
            new Data ("Stray Kids",R.drawable.megaverse ,R.raw.megaverse),
            new Data ("Stray Kids",R.drawable.thunderous ,R.raw.thunderous),
            new Data ("Rihanna",R.drawable.stay ,R.raw.stay),
            new Data ("Sebastian ft. Isabela Montor",R.drawable.my_only_one ,R.raw.my_only_one),
            new Data ("NEFFEX",R.drawable.neffex ,R.raw.neffex),
            new Data ("One Piece",R.drawable.drum_of_libration ,R.raw.one_piece),
            new Data ("Lady Ga Ga",R.drawable.poker_face ,R.raw.poker_face),
            new Data ("River Flow In You",R.drawable.river_flows_in_you ,R.raw.riverflowinyou),
            new Data ("Katy Perry",R.drawable.roar ,R.raw.roar),
            new Data ("Post Malone ft Swae Lee",R.drawable.sunflower ,R.raw.sunflower),
            new Data ("Blackway & Black Clavier",R.drawable.what_s_up_danger ,R.raw.whats_up_danger),
            new Data ("Illinium",R.drawable.reverie ,R.raw.reverie),
            new Data ("One Ok Rock",R.drawable.renegades ,R.raw.renegades),
            new Data ("One Ok Rock",R.drawable.the_beginning ,R.raw.the_beginning),
            new Data ("French Montana ft. Swae Lee",R.drawable.unforgetable ,R.raw.unforgettable),
            new Data ("Alan Walker",R.drawable.unity ,R.raw.unity),
            new Data ("One Ok Rock",R.drawable.stand_out_fit_in ,R.raw.stand_out_fit_in),
            new Data ("One Ok Rock",R.drawable.we_are ,R.raw.we_are)
            );
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main),(v,insets) ->{
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left,systemBars.top,systemBars.right,systemBars.bottom);
            return  insets;
        });
    }
    public void onSelectSong(View view){
        Intent intent = new Intent((this), MainActivity.class);
        if(view.getId() == R.id.cv_hrvy){
            intent.putExtra("artist_index",0);
            intent.putExtra("artist",mySongs.get(0));
        }else if(view.getId() == R.id.cv_slander){
            intent.putExtra("artist_index",1);
            intent.putExtra("artist",mySongs.get(1));
        }else if(view.getId() == R.id.cv_hellevator){
            intent.putExtra("artist_index",2);
            intent.putExtra("artist",mySongs.get(2));
        }else if(view.getId() == R.id.cv_hero){
            intent.putExtra("artist_index",3);
            intent.putExtra("artist",mySongs.get(3));
        }else if(view.getId() == R.id.cv_twentyonepilots){
            intent.putExtra("artist_index",4);
            intent.putExtra("artist",mySongs.get(4));
        }else if(view.getId() == R.id.cv_iwasking){
            intent.putExtra("artist_index",5);
            intent.putExtra("artist",mySongs.get(5));
        }else if(view.getId() == R.id.cv_lalalala){
            intent.putExtra("artist_index",6);
            intent.putExtra("artist",mySongs.get(6));
        }else if(view.getId() == R.id.cv_listen){
            intent.putExtra("artist_index",7);
            intent.putExtra("artist",mySongs.get(7));
        }else if(view.getId() == R.id.cv_maniac){
            intent.putExtra("artist_index",8);
            intent.putExtra("artist",mySongs.get(8));
        }else if(view.getId() == R.id.cv_megaverse){
            intent.putExtra("artist_index",9);
            intent.putExtra("artist",mySongs.get(9));
        }else if(view.getId() == R.id.cv_thunderous){
            intent.putExtra("artist_index",10);
            intent.putExtra("artist",mySongs.get(10));
        }else if(view.getId() == R.id.cv_stay){
            intent.putExtra("artist_index",11);
            intent.putExtra("artist",mySongs.get(11));
        }else if(view.getId() == R.id.cv_myonlyone){
            intent.putExtra("artist_index",12);
            intent.putExtra("artist",mySongs.get(12));
        }else if(view.getId() == R.id.cv_neffex){
            intent.putExtra("artist_index",13);
            intent.putExtra("artist",mySongs.get(13));
        }else if(view.getId() == R.id.cv_op){
            intent.putExtra("artist_index",14);
            intent.putExtra("artist",mySongs.get(14));
        }else if(view.getId() == R.id.cv_pokerface){
            intent.putExtra("artist_index",15);
            intent.putExtra("artist",mySongs.get(15));
        }else if(view.getId() == R.id.cv_riverflowsinyou){
            intent.putExtra("artist_index",16);
            intent.putExtra("artist",mySongs.get(16));
        }else if(view.getId() == R.id.cv_roar){
            intent.putExtra("artist_index",17);
            intent.putExtra("artist",mySongs.get(17));
        }else if(view.getId() == R.id.cv_sunflower){
            intent.putExtra("artist_index",18);
            intent.putExtra("artist",mySongs.get(18));
        }else if(view.getId() == R.id.cv_whatsupdanger){
            intent.putExtra("artist_index",19);
            intent.putExtra("artist",mySongs.get(19));
        }else if(view.getId() == R.id.cv_reverie){
            intent.putExtra("artist_index",20);
            intent.putExtra("artist",mySongs.get(20));
        }else if(view.getId() == R.id.cv_renegades){
            intent.putExtra("artist_index",21);
            intent.putExtra("artist",mySongs.get(21));
        }else if(view.getId() == R.id.cv_thebeginning){
            intent.putExtra("artist_index",22);
            intent.putExtra("artist",mySongs.get(22));
        }else if(view.getId() == R.id.cv_unforgettable){
            intent.putExtra("artist_index",23);
            intent.putExtra("artist",mySongs.get(23));
        }else if(view.getId() == R.id.cv_unity){
            intent.putExtra("artist_index",24);
            intent.putExtra("artist",mySongs.get(24));
        }else if(view.getId() == R.id.cv_standoutfitin){
            intent.putExtra("artist_index",25);
            intent.putExtra("artist",mySongs.get(25));
        }else if(view.getId() == R.id.cv_weare){
            intent.putExtra("artist_index",26);
            intent.putExtra("artist",mySongs.get(26));
        }
        startActivity(intent);

    }


}