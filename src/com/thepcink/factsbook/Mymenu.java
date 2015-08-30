package com.thepcink.factsbook;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Mymenu extends Activity {

@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main);

		//Image Buttons
		Button bstart= (Button) findViewById(R.id.startbtn);
		Button bhelp= (Button) findViewById(R.id.helpbtn);
		Button babout= (Button) findViewById(R.id.aboutbtn);

		
		new MediaPlayer();
		//button sound
		final MediaPlayer mp= MediaPlayer.create(this, R.raw.button_click);

		bstart.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				mp.start();
				startActivity(new Intent("com.thepcink.factsbook.FACTS"));
			}
		});
		bhelp.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				mp.start();
				startActivity(new Intent("com.thepcink.factsbook.HELP"));
				}
		});
		babout.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				mp.start();
				startActivity(new Intent("com.thepcink.factsbook.ABOUT"));
			}
		});
	}
	
}
