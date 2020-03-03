package com.example.parth.bingo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView comp,user;
    private boolean[] flag=new boolean[26];
    private boolean[] user_Flag=new boolean[26];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        create();
        userCreate();

    }
    void userCreate() {
        int i,j;
        String s=null;
        for (i = 1; i < 26; i++)
            user_Flag[i] = false;
        for(i=1;i<=5;i++) {
            for (j = 1; j <= 5; j++) {
                s = "R" + i + "C" + j;
                System.out.println(s);
                comp = (TextView) findViewById(getResources().getIdentifier(s, "id", getPackageName()));
                comp.setTextSize(18);
            }
        }

    }
    void onClick(View v) {
        Log.d("Hello", "onClick: Click");
    }
    void create() {
        int i, j, r;
        String s = null;
        for (i = 1; i < 26; i++)
            flag[i] = false;

        for(i=1;i<=5;i++) {
            for (j = 1; j <= 5; j++) {
                s = "r" + i + "c" + j;
                System.out.println(s);
                comp = (TextView) findViewById(getResources().getIdentifier(s, "id", getPackageName()));
                comp.setTextSize(18);
                Random rand=new Random();
                do {
                    r = rand.nextInt(25) + 1;
                }while(flag[r]==true);
                flag[r]=true;
                comp.setText(Integer.toString(r));
                //t.setText((char)5);


            }
        }
    }
}
