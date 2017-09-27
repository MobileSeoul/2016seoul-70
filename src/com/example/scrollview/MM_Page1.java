package com.example.scrollview;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MM_Page1 extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) { // 생성한 것을 올린다
		super.onCreate(savedInstanceState);
		setContentView(R.layout.page1);
		
		final ActionBar actionBar = getActionBar();
		actionBar.setCustomView(R.layout.actionbar_custom_view_home);
		actionBar.setDisplayShowTitleEnabled(false);
		actionBar.setDisplayShowCustomEnabled(true);
		actionBar.setDisplayUseLogoEnabled(false);
		actionBar.setDisplayShowHomeEnabled(false);
		
		TextView tv1 = (TextView) findViewById(R.id.textView1);
		TextView tv2 = (TextView) findViewById(R.id.textView2);
		
		tv1.setTypeface(Typeface.createFromAsset(getAssets(), "cherryblossom.ttf"));
		tv2.setTypeface(Typeface.createFromAsset(getAssets(), "cherryblossom.ttf"));
	}
}