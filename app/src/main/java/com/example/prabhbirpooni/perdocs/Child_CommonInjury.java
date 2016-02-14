package com.example.prabhbirpooni.perdocs;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.transition.AutoTransition;
import android.transition.Scene;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.RelativeLayout;
import android.transition.TransitionManager;

public class Child_CommonInjury extends Child_Categories {
    //scenes to transition
    private Scene scene1, scene2;
    //transition to move between scenes
    private Transition transition;
    //flag to swap between scenes
    private boolean start;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_common_injury);
        //get the layout ID
        RelativeLayout baseLayout = (RelativeLayout)findViewById(R.id.base);

        //first scene
        ViewGroup startViews = (ViewGroup)getLayoutInflater()
                .inflate(R.layout.content_common_injury, baseLayout, false);

        //second scene
        ViewGroup endViews = (ViewGroup)getLayoutInflater()
                .inflate(R.layout.content_commoninjury2, baseLayout, false);
        scene1 = new Scene(baseLayout, startViews);
        scene2 = new Scene(baseLayout, endViews);
        //create transition, set properties
        transition = new AutoTransition();
        transition.setDuration(1000);
        transition.setInterpolator(new AccelerateDecelerateInterpolator());

//initialize flag
        start=true;
    }

    public void changeScene(View v){

        //check flag
        if(start) {
            TransitionManager.go(scene2, transition);
            start=false;
        }
        else {
            TransitionManager.go(scene1, transition);
            start=true;
        }
    }
}


