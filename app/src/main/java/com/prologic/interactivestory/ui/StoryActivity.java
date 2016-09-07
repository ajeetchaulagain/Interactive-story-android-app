package com.prologic.interactivestory.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.prologic.interactivestory.R;

public class StoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        String name= intent.getStringExtra(getString(R.string.key_name));
//        Log.d("Message", name);
         Toast.makeText(this, name, Toast.LENGTH_LONG).show();
    }
}
