package com.example.prabhbirpooni.perdocs;

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
// opening screen most import java section of all be very careful
public class MainActivity extends AppCompatActivity {
    //public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";
    private static Button button_sbm;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.content_main);
        }
//buttons which lead to either the children secition or adult section
        public void welcomeKS (View view){
            String button_text;
            button_text=((Button)view).getText().toString();
            if(button_text.equals("Adult Section"))
            {
                Intent intent = new Intent(this, Adult_home.class);
                startActivity(intent);
            }
            else if (button_text.equals("Children Section"))
            {
                Intent intent = new Intent(this, Child_KidSection.class);
                startActivity(intent);
            }

        }



        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                return true;
            }

            return super.onOptionsItemSelected(item);
        }
    }


