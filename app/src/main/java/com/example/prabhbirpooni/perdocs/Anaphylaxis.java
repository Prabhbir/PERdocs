package com.example.prabhbirpooni.perdocs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by prabhbir on 1/17/2016.
 */
public class Anaphylaxis extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anaphylaxis);
    }
    public void infosetone(View view) {
        String button_text;
        button_text =((Button) view).getText().toString();
        if(button_text.equals("What is it?")) {
            Intent intent = new Intent(this, Anaphylaxis_what_is_it.class);
            startActivity(intent);
        }
        if(button_text.equals("How is anaphylaxis treated?")) {
            Intent intent = new Intent(this, Anaphylaxis_treatment.class);
            startActivity(intent);
        }
    }
}