package com.example.pankaj.slidingmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;

/**
 * Created by Pankaj on 9/9/2015.
 */
public class MoreAnimation extends Activity {
    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_more);
//        animation = AnimationUtils.loadAnimation(MoreAnimation.this,R.anim.allanimation);
//        RelativeLayout layout = (RelativeLayout)findViewById(R.id.layout);
//        TextView txtanimate = (TextView)findViewById(R.id.txtanimation);
//        //txtanimate.startAnimation(animation);
//        layout.startAnimation(animation);
        TestString.StringTest();
        setContentView(new MyGraphicsTest(this));

    }
}
