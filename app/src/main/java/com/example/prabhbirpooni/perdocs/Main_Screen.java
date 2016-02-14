package com.example.prabhbirpooni.perdocs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by prabhbirpooni on 16-02-14.
 */
public class Main_Screen extends AppCompatActivity {
    private static Button button_sbm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
    }
    public void infosetone(View view) {
        String button_text;
        button_text =((Button) view).getText().toString();
        if(button_text.equals("Adult Section")){
            Intent intent = new Intent(this, Adult_home.class);
            startActivity(intent);
        }
        else if(button_text.equals("Children Section ")){
            Intent intent = new Intent(this,Child_KidSection.class);
            startActivity(intent);
        }
    }
}
