package com.example.learninggame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LearnActivity extends AppCompatActivity {
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        img=findViewById(R.id.imageView2);
    }

    public void sendImage(View view) {
        int current_id=view.getId();
        if(current_id==R.id.a) {
            img.setImageResource(R.drawable.apple);
        }
        else if(current_id==R.id.b) {
            img.setImageResource(R.drawable.ball);
        }
        else if(current_id==R.id.c) {
            img.setImageResource(R.drawable.cat);
        }
        else if(current_id==R.id.d) {
            img.setImageResource(R.drawable.dog);
        }
        else if(current_id==R.id.e) {
            img.setImageResource(R.drawable.elephant);
        }
        else if(current_id==R.id.f) {
            img.setImageResource(R.drawable.fish);
        }
        else if(current_id==R.id.g) {
            img.setImageResource(R.drawable.goat);
        }
        else if(current_id==R.id.h) {
            img.setImageResource(R.drawable.hen);
        }
        else if(current_id==R.id.i) {
            img.setImageResource(R.drawable.icecream);
        }
        else if(current_id==R.id.j) {
            img.setImageResource(R.drawable.jug);
        }
        else if(current_id==R.id.k) {
            img.setImageResource(R.drawable.kite);
        }
        else if(current_id==R.id.l) {
            img.setImageResource(R.drawable.lion);
        }
        else if(current_id==R.id.m) {
            img.setImageResource(R.drawable.mango);
        }
        else if(current_id==R.id.n) {
            img.setImageResource(R.drawable.nest);
        }
        else if(current_id==R.id.o) {
            img.setImageResource(R.drawable.orange);
        }
        else if(current_id==R.id.p) {
            img.setImageResource(R.drawable.parrot);
        }
        else if(current_id==R.id.q) {
            img.setImageResource(R.drawable.quail);
        }
        else if(current_id==R.id.r) {
            img.setImageResource(R.drawable.rabbit);
        }
        else if(current_id==R.id.s) {
            img.setImageResource(R.drawable.sun);
        }
        else if(current_id==R.id.t) {
            img.setImageResource(R.drawable.tree);
        }
        else if(current_id==R.id.u) {
            img.setImageResource(R.drawable.umbrella);
        }
        else if(current_id==R.id.v) {
            img.setImageResource(R.drawable.van);
        }
        else if(current_id==R.id.w) {
            img.setImageResource(R.drawable.whale);
        }
        else if(current_id==R.id.x) {
            img.setImageResource(R.drawable.xray);
        }
        else if(current_id==R.id.y) {
            img.setImageResource(R.drawable.yak);
        }
        else if(current_id==R.id.z) {
            img.setImageResource(R.drawable.zebra);
        }
    }
}