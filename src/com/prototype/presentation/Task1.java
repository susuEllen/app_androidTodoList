package com.prototype.presentation;

import com.prototype.R;
import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Task1 extends Activity{

	MediaPlayer task1sound;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.task1);
		task1sound =  MediaPlayer.create(Task1.this, R.raw.sea_waves);
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		task1sound.start();
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		task1sound.release();
	}
	

}
