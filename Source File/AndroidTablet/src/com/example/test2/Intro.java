package com.example.test2;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Intro extends Activity {

	private static final int DIALOG_YES_NO_MESSAGE = 1;
    
	public View intro_exit_button;
	SoundPool sound;
	int soundId;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);
        
        Logo.at.add(this);
        
		sound = new SoundPool(5,AudioManager.STREAM_MUSIC,0);
		soundId = sound.load(this, R.raw.button_touch1, 1);

        intro_exit_button = findViewById(R.id.intro_exit_button);
        intro_exit_button.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				
				sound.play(soundId, 1f, 1f, 0, 0, 1f);
				showDialog(DIALOG_YES_NO_MESSAGE);
			}
		});
        
        
		ImageButton button1 = (ImageButton) findViewById(R.id.Korean_Button);
		ImageButton usa_button = (ImageButton) findViewById(R.id.Usa_Button);
		
		button1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				sound.play(soundId, 1f, 1f, 0, 0, 1f);
				Intent intent = new Intent(Intro.this,
						Korean_Activity.class);
				startActivity(intent);
				finish();
			}
		});
		
		usa_button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				sound.play(soundId, 1f, 1f, 0, 0, 1f);
				Intent intent = new Intent(Intro.this,Usa_Activity.class);
				startActivity(intent);
				finish();
			}
		});
		
    }
    
	@Override
	protected Dialog onCreateDialog(int id) {
		switch (id) {
		case DIALOG_YES_NO_MESSAGE:
			AlertDialog.Builder builder = new AlertDialog.Builder(this);
			builder.setTitle("종료 대화상자")
					.setMessage("SMART ORDER 어플리케이션을 종료하시겠습니까?")
					.setCancelable(false)
					.setPositiveButton("YES",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,
										int whichButton) {
									Intro.this.finish();
									for (int i = 0; i < Logo.at.size(); i++) {
										   Logo.at.get(i).finish();  //List가 Static 이므로, Class명.변수명.get으로 접근
										  }
									Korean_Fragment_Steak.steak_numInt1=0;
									Korean_Fragment_Steak.steak_numInt2=0;
									Korean_Fragment_Steak.steak_numInt3=0;
									Korean_Fragment_Steak.steak_numInt4=0;
								}
							})
					.setNegativeButton("NO",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,
										int whichButton) {
									dialog.cancel();
								}
							});
			AlertDialog alert = builder.create();
			return alert;
		}
		return null;
	}
}
