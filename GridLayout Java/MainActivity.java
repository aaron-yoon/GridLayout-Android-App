package com.csuf.cpsc411.assignment1java;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.ViewGroup.LayoutParams;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.TextView;
import android.view.ViewGroup;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        HorizontalScrollView hsv = new HorizontalScrollView(this);
        GridLayout root = new GridLayout(this);

        //GridView root = new GridView(this);

        ViewGroup.LayoutParams hParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        ViewGroup.LayoutParams rParams = new ViewGroup.LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT
        );

        hsv.setLayoutParams(hParams);

        /* Code only for GridView

        root.setLayoutParams(hParams);
        root.setNumColumns(5);
        root.setColumnWidth(400);

         */

        root.setLayoutParams(rParams);
        root.setOrientation(GridLayout.HORIZONTAL);
        root.setColumnCount(5);
        root.setRowCount(12);
        root.setHorizontalScrollBarEnabled(true);



        //First Row
        TextView tv = new TextView(this);
        tv.setText("1");
        tv.setBackgroundColor(Color.GRAY);
        tv.setTextColor(Color.BLACK);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        GridLayout.Spec row_spec = GridLayout.spec(0);
        GridLayout.Spec col_spec = GridLayout.spec(0, GridLayout.FILL);
        GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);


        tv = new TextView(this);
        tv.setText("Rules void hello1(int hour)");
        tv.setBackgroundColor(Color.BLACK);
        tv.setTextColor(Color.WHITE);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        row_spec = GridLayout.spec(0, GridLayout.FILL);
        col_spec = GridLayout.spec(1, 4, GridLayout.FILL, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);


        //Row 2 & 3

        tv = new TextView(this);
        tv.setText("2");
        tv.setBackgroundColor(Color.GRAY);
        tv.setTextColor(Color.BLACK);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        row_spec = GridLayout.spec(1, GridLayout.FILL, 1f);
        col_spec = GridLayout.spec(0, GridLayout.FILL, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("3");
        tv.setBackgroundColor(Color.GRAY);
        tv.setTextColor(Color.BLACK);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        row_spec = GridLayout.spec(2, GridLayout.FILL, 1f);
        col_spec = GridLayout.spec(0, GridLayout.FILL, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);


        tv = new TextView(this);
        tv.setText("properties");
        tv.setTextColor(Color.BLACK);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        row_spec = GridLayout.spec(1,2, GridLayout.CENTER, 1f);
        col_spec = GridLayout.spec(1, GridLayout.CENTER, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("name");
        tv.setTextColor(Color.BLACK);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        row_spec = GridLayout.spec(1, GridLayout.CENTER, 1f);
        col_spec = GridLayout.spec(2,2, GridLayout.CENTER, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("category");
        tv.setTextColor(Color.BLACK);
        row_spec = GridLayout.spec(2, GridLayout.CENTER);
        col_spec = GridLayout.spec(2,2, GridLayout.CENTER);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("Day Hour Classification");
        tv.setTextColor(Color.BLACK);
        row_spec = GridLayout.spec(1);
        col_spec = GridLayout.spec(4);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("Day and Time");
        tv.setTextColor(Color.BLACK);
        row_spec = GridLayout.spec(2);
        col_spec = GridLayout.spec(4);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);



        //Row 4

        tv = new TextView(this);
        tv.setText("4");
        tv.setBackgroundColor(Color.GRAY);
        tv.setTextColor(Color.BLACK);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        row_spec = GridLayout.spec(3, GridLayout.FILL);
        col_spec = GridLayout.spec(0, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        /*
        tv = new TextView(this);
        tv.setText("Rule");
        tv.setTypeface(null, Typeface.BOLD);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.rgb(66, 245, 236));
        row_spec = GridLayout.spec(3, GridLayout.CENTER, 1f);
        col_spec = GridLayout.spec(1, GridLayout.CENTER, 1f);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);
        */

        tv = new TextView(this);
        tv.setText("Rule");
        tv.setTypeface(null, Typeface.BOLD);
        tv.setBackgroundColor(Color.rgb(66, 245, 236));
        tv.setTextColor(Color.BLACK);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        row_spec = GridLayout.spec(3, GridLayout.FILL);
        col_spec = GridLayout.spec(1, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);



        tv = new TextView(this);
        tv.setText("C1");
        tv.setTypeface(null, Typeface.BOLD);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.rgb(66, 245, 236));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        row_spec = GridLayout.spec(3, GridLayout.FILL);
        col_spec = GridLayout.spec(2,2, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("A1");
        tv.setTypeface(null, Typeface.BOLD);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.rgb(66, 245, 236));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        row_spec = GridLayout.spec(3, GridLayout.FILL);
        col_spec = GridLayout.spec(4, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        // Row 5

        tv = new TextView(this);
        tv.setText("5");
        tv.setBackgroundColor(Color.GRAY);
        tv.setTextColor(Color.BLACK);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        row_spec = GridLayout.spec(4, GridLayout.FILL);
        col_spec = GridLayout.spec(0, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setBackgroundColor(Color.rgb(66, 245, 236));
        row_spec = GridLayout.spec(4, GridLayout.FILL);
        col_spec = GridLayout.spec(1, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("min <= hour && hour <= max");
        tv.setTextColor(Color.BLACK);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setBackgroundColor(Color.rgb(66, 245, 236));
        row_spec = GridLayout.spec(4, GridLayout.FILL);
        col_spec = GridLayout.spec(2, 2, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("System.out.print(greeting + , World!");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.rgb(66, 245, 236));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        row_spec = GridLayout.spec(4, GridLayout.FILL);
        col_spec = GridLayout.spec(4, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        //Row 6

        tv = new TextView(this);
        tv.setText("6");
        tv.setBackgroundColor(Color.GRAY);
        tv.setTextColor(Color.BLACK);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        row_spec = GridLayout.spec(5, GridLayout.FILL);
        col_spec = GridLayout.spec(0, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setBackgroundColor(Color.rgb(66, 245, 236));
        row_spec = GridLayout.spec(5, GridLayout.FILL);
        col_spec = GridLayout.spec(1, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("      int min      ");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.rgb(66, 245, 236));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        row_spec = GridLayout.spec(5, GridLayout.FILL);
        col_spec = GridLayout.spec(2, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("int max");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.rgb(66, 245, 236));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        row_spec = GridLayout.spec(5, GridLayout.FILL);
        col_spec = GridLayout.spec(3, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("String greeting");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.rgb(66, 245, 236));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        row_spec = GridLayout.spec(5, GridLayout.FILL);
        col_spec = GridLayout.spec(4, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);


        //Row 7

        tv = new TextView(this);
        tv.setText("7");
        tv.setBackgroundColor(Color.GRAY);
        tv.setTextColor(Color.BLACK);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        row_spec = GridLayout.spec(6, GridLayout.FILL);
        col_spec = GridLayout.spec(0, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("Rule");
        tv.setTypeface(null, Typeface.BOLD);
        tv.setTextColor(Color.BLACK);
        row_spec = GridLayout.spec(6);
        col_spec = GridLayout.spec(1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("From");
        tv.setTypeface(null, Typeface.BOLD);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.rgb(255, 252, 92));
        row_spec = GridLayout.spec(6, GridLayout.FILL);
        col_spec = GridLayout.spec(2, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("To");
        tv.setTypeface(null, Typeface.BOLD);
        tv.setBackgroundColor(Color.rgb(255, 252, 92));
        tv.setTextColor(Color.BLACK);
        row_spec = GridLayout.spec(6, GridLayout.FILL);
        col_spec = GridLayout.spec(3, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("Greeting");
        tv.setBackgroundColor(Color.rgb(255, 176, 48));
        tv.setTypeface(null, Typeface.BOLD);
        tv.setTextColor(Color.BLACK);
        row_spec = GridLayout.spec(6, GridLayout.FILL);
        col_spec = GridLayout.spec(4, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        // Row 8

        tv = new TextView(this);
        tv.setText("8");
        tv.setBackgroundColor(Color.GRAY);
        tv.setTextColor(Color.BLACK);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        row_spec = GridLayout.spec(7, GridLayout.FILL);
        col_spec = GridLayout.spec(0, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("R10");
        tv.setTextColor(Color.BLACK);
        row_spec = GridLayout.spec(7);
        col_spec = GridLayout.spec(1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("0");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.rgb(255, 252, 92));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        row_spec = GridLayout.spec(7, GridLayout.FILL);
        col_spec = GridLayout.spec(2, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("11");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.rgb(255, 252, 92));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        row_spec = GridLayout.spec(7, GridLayout.FILL);
        col_spec = GridLayout.spec(3, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Morning");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.rgb(255, 176, 48));
        row_spec = GridLayout.spec(7, GridLayout.FILL);
        col_spec = GridLayout.spec(4, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        // Row 9

        tv = new TextView(this);
        tv.setText("9");
        tv.setBackgroundColor(Color.GRAY);
        tv.setTextColor(Color.BLACK);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        row_spec = GridLayout.spec(8, GridLayout.FILL);
        col_spec = GridLayout.spec(0, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("R20");
        tv.setTextColor(Color.BLACK);
        row_spec = GridLayout.spec(8);
        col_spec = GridLayout.spec(1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("12");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.rgb(255, 252, 92));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        row_spec = GridLayout.spec(8, GridLayout.FILL);
        col_spec = GridLayout.spec(2, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("17");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.rgb(255, 252, 92));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        row_spec = GridLayout.spec(8, GridLayout.FILL);
        col_spec = GridLayout.spec(3, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Afternoon");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.rgb(255, 176, 48));
        row_spec = GridLayout.spec(8, GridLayout.FILL);
        col_spec = GridLayout.spec(4, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        //Row 10

        tv = new TextView(this);
        tv.setText("10");
        tv.setBackgroundColor(Color.GRAY);
        tv.setTextColor(Color.BLACK);
        row_spec = GridLayout.spec(9, GridLayout.CENTER);
        col_spec = GridLayout.spec(0, GridLayout.CENTER);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("R30");
        tv.setTextColor(Color.BLACK);
        row_spec = GridLayout.spec(9);
        col_spec = GridLayout.spec(1);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("18");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.rgb(255, 252, 92));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        row_spec = GridLayout.spec(9, GridLayout.FILL);
        col_spec = GridLayout.spec(2, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("21");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.rgb(255, 252, 92));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        row_spec = GridLayout.spec(9, GridLayout.FILL);
        col_spec = GridLayout.spec(3, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Evening");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.rgb(255, 176, 48));
        row_spec = GridLayout.spec(9, GridLayout.FILL);
        col_spec = GridLayout.spec(4, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        // Row 11

        tv = new TextView(this);
        tv.setText("11");
        tv.setBackgroundColor(Color.GRAY);
        tv.setTextColor(Color.BLACK);
        row_spec = GridLayout.spec(10, GridLayout.END);
        col_spec = GridLayout.spec(0, GridLayout.END);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("R40");
        tv.setTextColor(Color.BLACK);
        row_spec = GridLayout.spec(10, GridLayout.START);
        col_spec = GridLayout.spec(1, GridLayout.START);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("22");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.rgb(255, 252, 92));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        row_spec = GridLayout.spec(10, GridLayout.FILL);
        col_spec = GridLayout.spec(2, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("23");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.rgb(255, 252, 92));
        tv.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        row_spec = GridLayout.spec(10, GridLayout.FILL);
        col_spec = GridLayout.spec(3, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Night");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.rgb(255, 176, 48));
        row_spec = GridLayout.spec(10, GridLayout.FILL);
        col_spec = GridLayout.spec(4, GridLayout.FILL);
        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        hsv.addView(root);
        setContentView(hsv);
    }
}
