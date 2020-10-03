package com.example.simplesurveycreator.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.simplesurveycreator.R;
import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;

public class HomeAppActivity extends AppCompatActivity {

    SpaceNavigationView spaceNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_app);

        spaceNavigationView = findViewById(R.id.space);
        spaceNavigationView.initWithSaveInstanceState(savedInstanceState);
        spaceNavigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_baseline_add_box_24));
        spaceNavigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_baseline_call_to_action_24));
        spaceNavigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_equalizer_black_24dp));
        spaceNavigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_settings_black_24dp));
        spaceNavigationView.setCentreButtonSelectable(true);
        spaceNavigationView.setCentreButtonSelected();

        //set category screen
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new MainScreen()).commit();

    }
}