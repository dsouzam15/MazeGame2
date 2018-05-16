package com.example.administrator.mazegame;

import android.media.Image;
import android.os.Bundle;
import android.support.v4.util.ArraySet;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import java.sql.Array;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by Administrator on 5/15/2018.
 */

public class PlayActivity extends AppCompatActivity{

    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_screen);

        ImageView row1[] = null;
        row1[0] = findViewById(R.id.Path_A1);
        row1[1] = findViewById(R.id.Path_B1);
        row1[2] = findViewById(R.id.Path_C1);
        row1[3] = findViewById(R.id.Path_D1);
        row1[4] = findViewById(R.id.Path_E1);

        ImageView row2[] = null;
        row2[0] = findViewById(R.id.Path_A2);
        row2[1] = findViewById(R.id.Path_B2);
        row2[2] = findViewById(R.id.Path_C2);
        row2[3] = findViewById(R.id.Path_D2);
        row2[4] = findViewById(R.id.Path_E2);

        ImageView row3[] = null;
        row3[0] = findViewById(R.id.Path_A3);
        row3[1] = findViewById(R.id.Path_B3);
        row3[2] = findViewById(R.id.Path_C3);
        row3[3] = findViewById(R.id.Path_D3);
        row3[4] = findViewById(R.id.Path_E3);

        ImageView row4[] = null;
        row4[0] = findViewById(R.id.Path_A4);
        row4[1] = findViewById(R.id.Path_B4);
        row4[2] = findViewById(R.id.Path_C4);
        row4[3] = findViewById(R.id.Path_D4);
        row4[4] = findViewById(R.id.Path_E4);

        ImageView row5[] = null;
        row5[0] = findViewById(R.id.Path_A5);
        row5[1] = findViewById(R.id.Path_B5);
        row5[2] = findViewById(R.id.Path_C5);
        row5[3] = findViewById(R.id.Path_D5);
        row5[4] = findViewById(R.id.Path_E5);

        ImageView[][] grid = {row1, row2, row3, row4, row5};

        ImageView current_position = grid[0][0];

        Button up = (Button) findViewById(R.id.Up_Button);
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (){

                }

            }
        });

        Button down = (Button) findViewById(R.id.Down_Button);
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Button left = (Button) findViewById(R.id.Left_Button);
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Button right = (Button) findViewById(R.id.Right_Button);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }

}
