package com.wjq.roundmenuviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private  String test ="00000";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void feature1() {
        Log.e("feature-1", "add feature-1");
    }

    private void feature2() {
        Log.e("feature-2", "add feature-2");    }
}
