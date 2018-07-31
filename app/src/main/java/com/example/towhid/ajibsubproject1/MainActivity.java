package com.example.towhid.ajibsubproject1;

import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RelativeLayout a1,a2,b1,b2,c1,c2,d1,d2;
    ImageView a1_img,a2_img,b1_img,b2_img,c1_img,c2_img,d1_img,d2_img;
    TextView a1_text,a2_text,b1_text,b2_text,c1_text,c2_text,d1_text,d2_text;
    TextView a1_count,a2_count,b1_count,b2_count,c1_count,c2_count,d1_count,d2_count;
    Animation fab1Open;
    ScrollView react;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog);
        declaration();
        react.startAnimation(fab1Open);
    }


    private void declaration() {
        Typeface font1=Typeface.createFromAsset(getAssets(),"font/shojumaru_regular.ttf");
        Typeface font2=Typeface.createFromAsset(getAssets(),"font/eater_regular.ttf");
        a1=(RelativeLayout)findViewById(R.id.a1);
        a2=(RelativeLayout)findViewById(R.id.a2);
        b1=(RelativeLayout)findViewById(R.id.b1);
        b2=(RelativeLayout)findViewById(R.id.b2);
        c1=(RelativeLayout)findViewById(R.id.c1);
        c2=(RelativeLayout)findViewById(R.id.c2);
        d1=(RelativeLayout)findViewById(R.id.d1);
        d2=(RelativeLayout)findViewById(R.id.d2);
        react=(ScrollView)findViewById(R.id.scrollViewReact);

        a1_img=(ImageView)findViewById(R.id.a1_img);
        a2_img=(ImageView)findViewById(R.id.a2_img);
        b1_img=(ImageView)findViewById(R.id.b1_img);
        b2_img=(ImageView)findViewById(R.id.b2_img);
        c1_img=(ImageView)findViewById(R.id.c1_img);
        c2_img=(ImageView)findViewById(R.id.c2_img);
        d1_img=(ImageView)findViewById(R.id.d1_img);
        d2_img=(ImageView)findViewById(R.id.d2_img);

        a1_text=(TextView)findViewById(R.id.a1_text);
        a2_text=(TextView)findViewById(R.id.a2_text);
        b1_text=(TextView)findViewById(R.id.b1_text);
        b2_text=(TextView)findViewById(R.id.b2_text);
        c1_text=(TextView)findViewById(R.id.c1_text);
        c2_text=(TextView)findViewById(R.id.c2_text);
        d1_text=(TextView)findViewById(R.id.d1_text);
        d2_text=(TextView)findViewById(R.id.d2_text);

        a1_count=(TextView)findViewById(R.id.a1_count);
        a2_count=(TextView)findViewById(R.id.a2_count);
        b1_count=(TextView)findViewById(R.id.b1_count);
        b2_count=(TextView)findViewById(R.id.b2_count);
        c1_count=(TextView)findViewById(R.id.c1_count);
        c2_count=(TextView)findViewById(R.id.c2_count);
        d1_count=(TextView)findViewById(R.id.d1_count);
        d2_count=(TextView)findViewById(R.id.d2_count);

        a1_text.setTypeface(font1);
        a2_text.setTypeface(font1);
        b1_text.setTypeface(font1);
        b2_text.setTypeface(font1);
        c1_text.setTypeface(font1);
        c2_text.setTypeface(font1);
        d1_text.setTypeface(font1);
        d2_text.setTypeface(font1);
        fab1Open= AnimationUtils.loadAnimation(this,R.anim.fab1_open);
    }

    public void imgClicked(View view) {
        Typeface font1=Typeface.createFromAsset(getAssets(),"font/shojumaru_regular.ttf");
        Typeface font2=Typeface.createFromAsset(getAssets(),"font/eater_regular.ttf");
        a1_text.setTypeface(font1);
        a2_text.setTypeface(font1);
        b1_text.setTypeface(font1);
        b2_text.setTypeface(font1);
        c1_text.setTypeface(font1);
        c2_text.setTypeface(font1);
        d1_text.setTypeface(font1);
        d2_text.setTypeface(font1);

        a1.setBackgroundColor(getResources().getColor(R.color.transparent));
        a2.setBackgroundColor(getResources().getColor(R.color.transparent));
        b1.setBackgroundColor(getResources().getColor(R.color.transparent));
        b2.setBackgroundColor(getResources().getColor(R.color.transparent));
        c1.setBackgroundColor(getResources().getColor(R.color.transparent));
        c2.setBackgroundColor(getResources().getColor(R.color.transparent));
        d1.setBackgroundColor(getResources().getColor(R.color.transparent));
        d2.setBackgroundColor(getResources().getColor(R.color.transparent));

        a1_text.setTextColor(getResources().getColor(R.color.colorNotSelect));
        a2_text.setTextColor(getResources().getColor(R.color.colorNotSelect));
        b1_text.setTextColor(getResources().getColor(R.color.colorNotSelect));
        b2_text.setTextColor(getResources().getColor(R.color.colorNotSelect));
        c1_text.setTextColor(getResources().getColor(R.color.colorNotSelect));
        c2_text.setTextColor(getResources().getColor(R.color.colorNotSelect));
        d1_text.setTextColor(getResources().getColor(R.color.colorNotSelect));
        d2_text.setTextColor(getResources().getColor(R.color.colorNotSelect));


        a1_count.setTextColor(getResources().getColor(R.color.colorNotSelect));
        a2_count.setTextColor(getResources().getColor(R.color.colorNotSelect));
        b1_count.setTextColor(getResources().getColor(R.color.colorNotSelect));
        b2_count.setTextColor(getResources().getColor(R.color.colorNotSelect));
        c1_count.setTextColor(getResources().getColor(R.color.colorNotSelect));
        c2_count.setTextColor(getResources().getColor(R.color.colorNotSelect));
        d1_count.setTextColor(getResources().getColor(R.color.colorNotSelect));
        d2_count.setTextColor(getResources().getColor(R.color.colorNotSelect));


        if (view.getId()== R.id.a1 || view.getId()==  R.id.a1_img || view.getId()==  R.id.a1_text || view.getId()==R.id.a1_count )
        {
            a1.setBackgroundColor(getResources().getColor(R.color.colorSelect));
            a1_text.setTextColor(getResources().getColor(R.color.colorSelect));
            a1_count.setTextColor(getResources().getColor(R.color.colorSelect));
            a1_text.setTypeface(font2);
        }
        else if (view.getId()== R.id.a2 || view.getId()==  R.id.a2_img || view.getId()==  R.id.a2_text || view.getId()==R.id.a2_count )
        {
            a2.setBackgroundColor(getResources().getColor(R.color.colorSelect));
            a2_text.setTextColor(getResources().getColor(R.color.colorSelect));
            a2_count.setTextColor(getResources().getColor(R.color.colorSelect));
            a2_text.setTypeface(font2);
        }
        else if (view.getId()== R.id.b1 || view.getId()==  R.id.b1_img || view.getId()==  R.id.b1_text || view.getId()==R.id.b1_count )
        {
            b1.setBackgroundColor(getResources().getColor(R.color.colorSelect));
            b1_text.setTextColor(getResources().getColor(R.color.colorSelect));
            b1_count.setTextColor(getResources().getColor(R.color.colorSelect));
            b1_text.setTypeface(font2);
        }
        else if (view.getId()== R.id.b2 || view.getId()==  R.id.b2_img || view.getId()==  R.id.b2_text || view.getId()==R.id.b2_count )
        {
            b2.setBackgroundColor(getResources().getColor(R.color.colorSelect));
            b2_text.setTextColor(getResources().getColor(R.color.colorSelect));
            b2_count.setTextColor(getResources().getColor(R.color.colorSelect));
            b2_text.setTypeface(font2);
        }
        else if (view.getId()== R.id.c1 || view.getId()==  R.id.c1_img || view.getId()==  R.id.c1_text || view.getId()==R.id.c1_count )
        {
            c1.setBackgroundColor(getResources().getColor(R.color.colorSelect));
            c1_text.setTextColor(getResources().getColor(R.color.colorSelect));
            c1_text.setTextColor(getResources().getColor(R.color.colorSelect));
            c1_text.setTypeface(font2);
        }
        else if (view.getId()== R.id.c2 || view.getId()==  R.id.c2_img || view.getId()==  R.id.c2_text || view.getId()==R.id.c2_count )
        {
            c2.setBackgroundColor(getResources().getColor(R.color.colorSelect));
            c2_text.setTextColor(getResources().getColor(R.color.colorSelect));
            c2_count.setTextColor(getResources().getColor(R.color.colorSelect));
            c2_text.setTypeface(font2);
        }
        else if (view.getId()== R.id.d1 || view.getId()==  R.id.d1_img || view.getId()==  R.id.d1_text || view.getId()==R.id.d1_count )
        {
            d1.setBackgroundColor(getResources().getColor(R.color.colorSelect));
            d1_text.setTextColor(getResources().getColor(R.color.colorSelect));
            d1_count.setTextColor(getResources().getColor(R.color.colorSelect));
            d1_text.setTypeface(font2);
        }
        else if (view.getId()== R.id.d2 || view.getId()==  R.id.d2_img || view.getId()==  R.id.d2_text || view.getId()==R.id.d2_count )
        {
            d2.setBackgroundColor(getResources().getColor(R.color.colorSelect));
            d2_text.setTextColor(getResources().getColor(R.color.colorSelect));
            d2_count.setTextColor(getResources().getColor(R.color.colorSelect));
            d2_text.setTypeface(font2);
        }

    }

}
