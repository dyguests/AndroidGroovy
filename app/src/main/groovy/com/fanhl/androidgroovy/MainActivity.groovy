package com.fanhl.androidgroovy

import android.os.Bundle
import android.support.v7.app.ActionBarActivity

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById(R.id.textView).text = "Hello Groovy!!"
    }
}
