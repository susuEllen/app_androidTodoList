package com.prototype.presentation;

import com.prototype.R;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;


// This is responsible for the loading screen of the app
public class LoadingActivity extends Activity{

	MediaPlayer happySong;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.loading);
		
		happySong = MediaPlayer.create(LoadingActivity.this, R.raw.funny_boy_laugh);
		happySong.start();
		// TODO: we have a default hardcoded timer for now, change this to something else depending on server responses later
		Thread timer = new Thread() {
			public void run() {
				try{
					Thread.sleep(5000);
				} catch ( InterruptedException e) {
					Log.e("LoadingActivity", e.getMessage());
				} finally {
					Log.d("LoadingActivity", "enter finally");
					Intent openMenu = new Intent("com.prototype.presentation.MainMenuActivity");
					startActivity(openMenu);
				}
			}
		};
		
		timer.start();
	}	
	
	@Override
	protected void onPause() {
		super.onPause();
		happySong.release();
	}

}
