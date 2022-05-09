package com.example.photoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView imgPic;
    private ImageView btnNext,btnPrivious;
    private int index;
    private int [] image = {R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,R.drawable.img6,R.drawable.img7};
    MediaPlayer iWanna,humdard,hawayein,tomarkotha,himandi,mayabini,zarazara,khiriki;
    TextView sng1,sng2,sng3,sng4,sng5,sng6,sng7,sng8;
    ImageView imgMute;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Displayimage();
        SwitchButton();
        sng1= findViewById(R.id.sng1);
        sng2= findViewById(R.id.sng2);
        sng3= findViewById(R.id.sng3);
        sng4= findViewById(R.id.sng4);
        sng5= findViewById(R.id.sng5);
        sng6= findViewById(R.id.sng6);
        sng7= findViewById(R.id.sng7);
        sng8= findViewById(R.id.sng8);
        //mp= MediaPlayer.create(this,R.raw.lovesanam);
        //Button play= findViewById(R.id.btnSong);
//        play.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mp.start();
//            }
    //   });

        //Adding song
        iWanna = MediaPlayer.create(this,R.raw.happybirthday);
        humdard = MediaPlayer.create(this,R.raw.babybuli);
        hawayein= MediaPlayer.create(this,R.raw.tomarmoromemuk);
        tomarkotha= MediaPlayer.create(this,R.raw.tomarkotha);
        himandi= MediaPlayer.create(this,R.raw.murminoti);
        mayabini= MediaPlayer.create(this,R.raw.mayabini);
        zarazara= MediaPlayer.create(this,R.raw.sila);
        khiriki= MediaPlayer.create(this,R.raw.khirikimelute);

        //Funtion for Playlist
        Playlist();

        //To mute
        imgMute= findViewById(R.id.imgMute);

        SongMute();


    }
    public void Displayimage(){

        imgPic= (ImageView)findViewById(R.id.imgPic);
    }

    void SwitchButton(){
        btnNext = (ImageView) findViewById(R.id.btnNext);
        btnPrivious = (ImageView) findViewById(R.id.btnPrevious);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index++;
                index = index% image.length;
                imgPic.setImageResource(image[index]);


            }
        });
        btnPrivious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index--;
                if (index<0){
                    index= image.length - 1;
                }
                imgPic.setImageResource(image[index]);

            }
        });
    }

    void Playlist(){
        sng1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(iWanna.isPlaying())
                {
                    iWanna.pause();

                }
                else
                {
                    iWanna.start();

                }
            }
        });

        sng2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(humdard.isPlaying())
                {
                    humdard.pause();

                }
                else
                {
                    humdard.start();

                }
            }
        });

        sng3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(hawayein.isPlaying())
                {
                    hawayein.pause();

                }
                else
                {
                    hawayein.start();

                }
            }
        });

        sng4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tomarkotha.isPlaying())
                {
                    tomarkotha.pause();

                }
                else
                {
                    tomarkotha.start();

                }
            }
        });

        sng5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(himandi.isPlaying())
                {
                    himandi.pause();

                }
                else
                {
                    himandi.start();

                }
            }
        });

        sng6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mayabini.isPlaying())
                {
                    mayabini.pause();

                }
                else
                {
                    mayabini.start();

                }
            }
        });

        sng7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(zarazara.isPlaying())
                {
                    zarazara.pause();

                }
                else
                {
                    zarazara.start();

                }
            }
        });

        sng8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(khiriki.isPlaying())
                {
                    khiriki.pause();

                }
                else
                {
                    khiriki.start();

                }
            }
        });
    }

    void SongMute(){
        imgMute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iWanna.stop();
                humdard.stop();
                hawayein.stop();
                tomarkotha.stop();
                himandi.stop();
                mayabini.stop();
                zarazara.stop();
                khiriki.stop();
                Toast.makeText(getApplicationContext(),"To play song again, Please restart the app",Toast.LENGTH_LONG).show();
            }
        });




    }
}