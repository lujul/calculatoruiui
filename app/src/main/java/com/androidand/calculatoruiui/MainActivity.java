package com.androidand.calculatoruiui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final TextView textView = (TextView) findViewById(R.id.text_view_0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        String clicked = view.getTag().toString();
    }

    private void display(String s){
        textView.setText((textView+s).toString());

    }

    private String action(String clicked) {
        switch (clicked) {
            // The "C" button is used to clear
            case "+":
                return "";


            default:
                return clicked;
        }
    }
}
