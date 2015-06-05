package com.example.test2;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Logo extends Activity {
	
	public static ArrayList<Activity> at = new ArrayList<Activity>();
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logo);
        
        at.add(this);
        
        Handler mHandler = new Handler();
		mHandler.postDelayed(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Intent i = new Intent(Logo.this,
						Intro.class);
				startActivity(i);
				finish();
			}
		}, 2000); // 1000ms
	}
}
