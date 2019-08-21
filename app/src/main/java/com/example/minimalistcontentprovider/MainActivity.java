package com.example.minimalistcontentprovider;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);


    }

    public void onClickDisplayEntries(View view) {
        Log.d(TAG, "onClickDisplayEntries: Yay I Was Kliked!");

        switch (view.getId()) {
            case R.id.button_display_all:
                Log.d(TAG, "onClickDisplayEntries: Display All Kliked");
                break;
            case R.id.button_display_one:
                Log.d(TAG, "onClickDisplayEntries: Display One Kliked");
                break;
        }

        textView.append(" Clicked");
    }
}
