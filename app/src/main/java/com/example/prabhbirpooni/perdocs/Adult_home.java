package com.example.prabhbirpooni.perdocs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/**TEST
/**
 * Created by prabhbirpooni on 16-02-13.
 * The purpose of this code is to anazlyes what button is clicked on the main adult screen and redirects to the next window
 */

public class Adult_home extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adult_home);
    }
    public void infosetone(View view) {
        String button_text;
        button_text =((Button) view).getText().toString();
        if(button_text.equals("Cast and Crutches ")){
            Intent intent = new Intent(this, Cast_and_Crutches.class);
            startActivity(intent);
        }
        else if(button_text.equals("Common Injuries ")){
            Intent intent = new Intent(this,Common_Injuries.class);
            startActivity(intent);
        }
        else if(button_text.equals("Jaundice and Your Body")){
            Intent intent = new Intent(this,Jaundice_and_Your_Body.class);
            startActivity(intent);
        }
        else if(button_text.equals("Respiratory ")){
            Intent intent = new Intent(this,Respiratory.class);
            startActivity(intent);
        }
    }

}
