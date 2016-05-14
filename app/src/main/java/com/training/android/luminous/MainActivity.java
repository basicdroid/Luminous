package com.training.android.luminous;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private ImageView    mImgLights;
    private ToggleButton mBtnSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImgLights = (ImageView) findViewById(R.id.imgLights);
        mBtnSwitch = (ToggleButton) findViewById(R.id.btnSwitch);

        mBtnSwitch.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            mImgLights.setImageResource(R.drawable.lights_on);
        } else {
            mImgLights.setImageResource(R.drawable.lights_off);
        }
    }
}
