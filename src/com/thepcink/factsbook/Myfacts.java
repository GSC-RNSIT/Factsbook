package com.thepcink.factsbook;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.Window;

public class Myfacts extends FragmentActivity {
	int v=0;
	int ch=0;
	String PREFS_NAME="";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.facts);		
		
		//SharedPreferences
		SharedPreferences settings=getSharedPreferences(PREFS_NAME,0);
		v=settings.getInt("ch", ch);
		v=v-2;
		
        /** Getting a reference to the ViewPager defined the layout file */
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
 
        /** Getting fragment manager */
        FragmentManager fm = getSupportFragmentManager();
 
        /** Instantiating FragmentPagerAdapter */
        MyFragmentPagerAdapter pagerAdapter = new MyFragmentPagerAdapter(fm);
 
        /** Setting the pagerAdapter to the pager object */
        pager.setAdapter(pagerAdapter);
        
        pager.setCurrentItem(v);
        
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		SharedPreferences settings= getSharedPreferences(PREFS_NAME,0);
		SharedPreferences.Editor editor=settings.edit();
		ch=MyFragmentPagerAdapter.getValue();
		editor.putInt("ch", ch);
		editor.commit();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		SharedPreferences settings= getSharedPreferences(PREFS_NAME,0);
		SharedPreferences.Editor editor=settings.edit();
		ch=MyFragmentPagerAdapter.getValue();
			editor.putInt("ch", ch);
			editor.commit();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		SharedPreferences settings= getSharedPreferences(PREFS_NAME,0);
		SharedPreferences.Editor editor=settings.edit();
		ch=MyFragmentPagerAdapter.getValue();
			editor.putInt("ch", ch);
			editor.commit();
	}	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
