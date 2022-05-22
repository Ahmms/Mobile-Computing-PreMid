package com.example.learninggame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;


public class QuizActivity extends AppCompatActivity {
    CharSequence match;
    int[] number;
    char[] option;
    ArrayList<Character> mylist = new ArrayList<Character>();
    char option1,option2,option3,option4;
    char answer;
    RadioGroup rg;
    RadioButton b1,b2,b3,b4,checkedButton;
    boolean bool1,bool2,bool3,bool4;
    ImageView img;
    TextView txt;
    Button btn,btn2;
    int score=0;
    int total_question=0;
    int checked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        rg = findViewById(R.id.rg);
        img = findViewById(R.id.imageView4);
        btn = findViewById(R.id.next);
        b1 = findViewById(R.id.radioButton1);
        b2 = findViewById(R.id.radioButton2);
        b3 = findViewById(R.id.radioButton3);
        b4 = findViewById(R.id.radioButton4);
        txt=findViewById(R.id.textView3);
        btn2=findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizActivity.this, ScorecardActivity.class);
                intent.putExtra("score", score);
                intent.putExtra("total", total_question);
                startActivity(intent);
            }
        });
        question();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checked = rg.getCheckedRadioButtonId();
                checkedButton = findViewById(checked);
                CharSequence ans = checkedButton.getText();
                if (ans.charAt(0) == answer) {
                    score++;
                    txt.setText("Your Score :"+score+"/"+total_question);
                }
                else{
                    txt.setText("Your Score :"+score+"/"+total_question);
                }
                rg.clearCheck();
                question();
            }
        });

    }
    public void question() {
        total_question++;
        answer=random();
        setImage(answer);
        mylist.add(answer);
        mylist.add(random());
        mylist.add(random());
        mylist.add(random());
        Collections.shuffle(mylist);
        b1.setText(""+mylist.get(0)+"");
        b2.setText(""+mylist.get(1)+"");
        b3.setText(""+mylist.get(2)+"");
        b4.setText(""+mylist.get(3)+"");
        mylist.clear();

    }
    public char random() {
        Random random = new Random();
        char randomizedCharacter = (char) (random.nextInt(26) + 'a');
        return randomizedCharacter;
    }
    public void setImage(char current_id) {
        if(current_id=='a') {
            img.setImageResource(R.drawable.apple);
        }
        else if(current_id=='b') {
            img.setImageResource(R.drawable.ball);
        }
        else if(current_id=='c') {
            img.setImageResource(R.drawable.cat);
        }
        else if(current_id=='d') {
            img.setImageResource(R.drawable.dog);
        }
        else if(current_id=='e') {
            img.setImageResource(R.drawable.elephant);
        }
        else if(current_id=='f') {
            img.setImageResource(R.drawable.fish);
        }
        else if(current_id=='g') {
            img.setImageResource(R.drawable.goat);
        }
        else if(current_id=='h') {
            img.setImageResource(R.drawable.hen);
        }
        else if(current_id=='i') {
            img.setImageResource(R.drawable.icecream);
        }
        else if(current_id=='j') {
            img.setImageResource(R.drawable.jug);
        }
        else if(current_id=='k') {
            img.setImageResource(R.drawable.kite);
        }
        else if(current_id=='l') {
            img.setImageResource(R.drawable.lion);
        }
        else if(current_id=='m') {
            img.setImageResource(R.drawable.mango);
        }
        else if(current_id=='n') {
            img.setImageResource(R.drawable.nest);
        }
        else if(current_id=='o') {
            img.setImageResource(R.drawable.orange);
        }
        else if(current_id=='p') {
            img.setImageResource(R.drawable.parrot);
        }
        else if(current_id=='q') {
            img.setImageResource(R.drawable.quail);
        }
        else if(current_id=='r') {
            img.setImageResource(R.drawable.rabbit);
        }
        else if(current_id=='s') {
            img.setImageResource(R.drawable.sun);
        }
        else if(current_id=='t') {
            img.setImageResource(R.drawable.tree);
        }
        else if(current_id=='u') {
            img.setImageResource(R.drawable.umbrella);
        }
        else if(current_id=='v') {
            img.setImageResource(R.drawable.van);
        }
        else if(current_id=='w') {
            img.setImageResource(R.drawable.whale);
        }
        else if(current_id=='x') {
            img.setImageResource(R.drawable.xray);
        }
        else if(current_id=='y') {
            img.setImageResource(R.drawable.yak);
        }
        else if(current_id=='z') {
            img.setImageResource(R.drawable.zebra);
        }
    }

}