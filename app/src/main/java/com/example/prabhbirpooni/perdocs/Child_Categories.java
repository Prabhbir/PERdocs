package com.example.prabhbirpooni.perdocs;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Child_Categories extends Child_KidSection{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_categories);
    }

    public void wwyltL (View view) {
        String button_text;
        button_text=((Button)view).getText().toString();
        if(button_text.equals("Common Injuries"))
        {
            Intent intent = new Intent(this, Child_CommonInjury.class);
            startActivity(intent);
        }
        else if (button_text.equals("Respiratory"))
        {
            Intent intent = new Intent(this, Child_Respiratory.class);
            startActivity(intent);
        }
        else if (button_text.equals("Casts and crutches"))
        {
            Intent intent = new Intent(this, Child_Crutches.class);
            startActivity(intent);
        }

    }
}