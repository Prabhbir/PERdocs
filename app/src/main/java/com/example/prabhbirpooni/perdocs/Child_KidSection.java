package com.example.prabhbirpooni.perdocs;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Button;

public class Child_KidSection extends Activity {
    //public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kid_section);
    }

    public void welcomeKS(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Categories")) {
            Intent intent = new Intent(this, Child_Categories.class);
            startActivity(intent);
        } else if (button_text.equals("Games")) {
            Intent intent = new Intent(this, Child_Games.class);
            startActivity(intent);
        }

    }
}