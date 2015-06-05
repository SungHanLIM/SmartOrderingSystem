package com.example.test2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Korean_OrderComplete extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.korean_ordercomplete);
		
			Handler mHandler = new Handler();
			mHandler.postDelayed(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					Intent i = new Intent(Korean_OrderComplete.this,
							Intro.class);
					startActivity(i);
					finish();
				}
			}, 3000); // 1000ms
		}
	}
