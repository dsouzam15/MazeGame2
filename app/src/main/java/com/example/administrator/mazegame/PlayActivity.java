package com.example.administrator.mazegame;

import android.content.Intent;
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
    int current_row = 0;
    int current_column = 0;
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

        final ImageView[][] grid = {row1, row2, row3, row4, row5};

        ImageView [] Wall_column1 = null;
        Wall_column1[0] = findViewById(R.id.Wall_A1_A2);
        Wall_column1[1] = findViewById(R.id.Wall_B1_B2);
        Wall_column1[2] = findViewById(R.id.Wall_C1_C2);
        Wall_column1[3] = findViewById(R.id.Wall_D1_D2);
        Wall_column1[4] = findViewById(R.id.Wall_E1_E2);

        ImageView [] Wall_column2 = null;
        Wall_column2[0] = findViewById(R.id.Wall_A2_A3);
        Wall_column2[1] = findViewById(R.id.Wall_B2_B3);
        Wall_column2[2] = findViewById(R.id.Wall_C2_C3);
        Wall_column2[3] = findViewById(R.id.Wall_D2_D3);
        Wall_column2[4] = findViewById(R.id.Wall_E2_E3);

        ImageView [] Wall_column3 = null;
        Wall_column3[0] = findViewById(R.id.Wall_A3_A4);
        Wall_column3[1] = findViewById(R.id.Wall_B3_B4);
        Wall_column3[2] = findViewById(R.id.Wall_C3_C4);
        Wall_column3[3] = findViewById(R.id.Wall_D3_D4);
        Wall_column3[4] = findViewById(R.id.Wall_E3_E4);

        ImageView [] Wall_column4 = null;
        Wall_column4[0] = findViewById(R.id.Wall_A4_A5);
        Wall_column4[1] = findViewById(R.id.Wall_B4_B5);
        Wall_column4[2] = findViewById(R.id.Wall_C4_C5);
        Wall_column4[3] = findViewById(R.id.Wall_D4_D5);
        Wall_column4[4] = findViewById(R.id.Wall_E4_E5);


        ImageView [] Wall_row1= null;
        Wall_row1[0] = findViewById(R.id.Wall_A1_B1);
        Wall_row1[1] = findViewById(R.id.Wall_B1_C1);
        Wall_row1[2] = findViewById(R.id.Wall_C1_D1);
        Wall_row1[3] = findViewById(R.id.Wall_D1_E1);

        ImageView [] Wall_row2= null;
        Wall_row2[0] = findViewById(R.id.Wall_A2_B2);
        Wall_row2[1] = findViewById(R.id.Wall_B2_C2);
        Wall_row2[2] = findViewById(R.id.Wall_C2_D2);
        Wall_row2[3] = findViewById(R.id.Wall_D2_E2);

        ImageView [] Wall_row3= null;
        Wall_row3[0] = findViewById(R.id.Wall_A3_B3);
        Wall_row3[1] = findViewById(R.id.Wall_B3_C3);
        Wall_row3[2] = findViewById(R.id.Wall_C3_D3);
        Wall_row3[3] = findViewById(R.id.Wall_D3_E3);

        ImageView [] Wall_row4= null;
        Wall_row4[0] = findViewById(R.id.Wall_A4_B4);
        Wall_row4[1] = findViewById(R.id.Wall_B4_C4);
        Wall_row4[2] = findViewById(R.id.Wall_C4_D4);
        Wall_row4[3] = findViewById(R.id.Wall_D4_E4);

        ImageView [] Wall_row5= null;
        Wall_row5[0] = findViewById(R.id.Wall_A5_B5);
        Wall_row5[1] = findViewById(R.id.Wall_B5_C5);
        Wall_row5[2] = findViewById(R.id.Wall_C5_D5);
        Wall_row5[3] = findViewById(R.id.Wall_D5_E5);


        final ImageView [][] barrier_row = {Wall_row1, Wall_row2, Wall_row3, Wall_row4, Wall_row5};
        final ImageView [][] barrier_column = {Wall_column1, Wall_column2, Wall_column3, Wall_column4};



        Button up = findViewById(R.id.Up_Button);
        up.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                if (current_row > 0){
                    if (barrier_row[current_row][current_column].getVisibility() == View.INVISIBLE) {
                        ImageView last_position = grid[current_row][current_column];
                        current_row = current_row - 1;
                        ImageView current_position = grid[current_row][current_column];
                        current_position.setImageResource(R.drawable.marker);
                        last_position.setImageResource(R.drawable.clear);
                    }
            }
        }}
        );
    //    });

        Button down = findViewById(R.id.Down_Button);
        down.setOnClickListener (new View.OnClickListener() {
                                     public void onClick(View view) {
                                         if (current_row < 5) {
                                             if (barrier_row[current_row][current_column].getVisibility() == View.INVISIBLE) {
                                                 ImageView last_position = grid[current_row][current_column];
                                                 current_row = current_row + 1;
                                                 ImageView current_position = grid[current_row][current_column];
                                                 current_position.setImageResource(R.drawable.marker);
                                                 last_position.setImageResource(R.drawable.clear);
                                                 if (current_position == findViewById(R.id.Path_E5)) {
                                                     startActivity(new Intent(PlayActivity.this, WinActivity.class));
                                                 }
                                             }
                                         }
                                     }
                                 }

);
        Button left = findViewById(R.id.Left_Button);
        left.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (current_column > 0){
                    if (barrier_column[current_row][current_column].getVisibility() == View.INVISIBLE) {
                        ImageView last_position = grid[current_row][current_column];
                        current_column = current_column - 1;
                        ImageView current_position = grid[current_row][current_column];
                        current_position.setImageResource(R.drawable.marker);
                        last_position.setImageResource(R.drawable.clear);
                    }
                }
            }
        }
        );

        Button right = findViewById(R.id.Right_Button);
        right.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (current_column < 5) {
                    if (barrier_column[current_row][current_column].getVisibility() == View.INVISIBLE) {
                        ImageView last_position = grid[current_row][current_column];
                        current_column = current_column + 1;
                        ImageView current_position = grid[current_row][current_column];
                        current_position.setImageResource(R.drawable.marker);
                        last_position.setImageResource(R.drawable.clear);
                        if (current_position == findViewById(R.id.Path_E5)) {
                            startActivity(new Intent(PlayActivity.this, WinActivity.class));
                        }
                    }
                }

            }
        });


    }

}

