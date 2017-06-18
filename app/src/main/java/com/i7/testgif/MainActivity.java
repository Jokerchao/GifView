package com.i7.testgif;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.widget.MediaController;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageButton;
import pl.droidsonroids.gif.GifImageView;

public class MainActivity extends AppCompatActivity {
   GifImageButton gifImageButton;

    int count=0;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gifImageButton= (GifImageButton) findViewById(R.id.gif_01);
        final GifDrawable gifDrawable=(GifDrawable) gifImageButton.getDrawable();
        gifDrawable.stop();
        gifDrawable.setLoopCount(1);
        gifImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //gifDrawable.start();
                if(gifDrawable.isRunning())
                {

                    gifDrawable.seekTo(0);
                    gifDrawable.stop();
                }else{

//                    gifDrawable.setLoopCount(++count);
//                    gifDrawable.start();
                    gifDrawable.reset();
                }
            }
        });



//        final MediaController mc=new MediaController(this);
//        mc.setMediaPlayer(gifDrawable);
//        mc.setAnchorView(gifImageButton);
//
//        gifImageButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //gifDrawable.stop();
//                mc.show();
//            }
//        });
//        GifImageButton gib = new GifImageButton(this);
//        setContentView(gib);
//        gib.setImageResource(R.drawable.construe);
//        final MediaController mc = new MediaController(this);
//        mc.setMediaPlayer((GifDrawable) gifImageButton.getDrawable());
//        mc.setAnchorView(gifImageButton);
//        gifImageButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mc.stop()
//            }
//        });

    }
}
