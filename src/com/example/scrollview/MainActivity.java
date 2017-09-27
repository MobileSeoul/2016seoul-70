package com.example.scrollview;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {

	ImageButton middle, east, west, plusBtn, imageBtn1, imageBtn2, imageBtn3,
			imageBtn4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		startActivity(new Intent(this, Splash.class)); // 스플래쉬

		final ActionBar actionBar = getActionBar();
		actionBar.setCustomView(R.layout.actionbar_custom_view_home);
		actionBar.setDisplayShowTitleEnabled(false);
		actionBar.setDisplayShowCustomEnabled(true);
		actionBar.setDisplayUseLogoEnabled(false);
		actionBar.setDisplayShowHomeEnabled(false);

		// ImageView iv1 = (ImageView) findViewById(R.id.imageView1);
		// ImageView iv2 = (ImageView) findViewById(R.id.imageView2);
		// ImageView iv3 = (ImageView) findViewById(R.id.imageView3);
		// ImageView iv4 = (ImageView) findViewById(R.id.imageView4);

		TextView tv1 = (TextView) findViewById(R.id.textView1);
		TextView tv2 = (TextView) findViewById(R.id.textView2);

		tv1.setTypeface(Typeface.createFromAsset(getAssets(),
				"cherryblossom.ttf"));
		tv2.setTypeface(Typeface.createFromAsset(getAssets(),
				"cherryblossom.ttf"));

		/*
		 * iv1.setAdjustViewBounds(true); iv1.setMaxWidth(400);
		 * iv1.setMaxHeight(400);
		 * 
		 * iv2.setAdjustViewBounds(true); iv2.setMaxWidth(400);
		 * iv2.setMaxHeight(400);
		 * 
		 * iv3.setAdjustViewBounds(true); iv3.setMaxWidth(400);
		 * iv3.setMaxHeight(400);
		 * 
		 * iv4.setAdjustViewBounds(true); iv4.setMaxWidth(400);
		 * iv4.setMaxHeight(400);
		 * 
		 * iv1.setImageDrawable(getResources().getDrawable(R.drawable.p1));
		 * iv2.setImageDrawable(getResources().getDrawable(R.drawable.p2));
		 * iv3.setImageDrawable(getResources().getDrawable(R.drawable.p3));
		 * iv4.setImageDrawable(getResources().getDrawable(R.drawable.p4));
		 */

		middle = (ImageButton) findViewById(R.id.middle);
		east = (ImageButton) findViewById(R.id.east);
		west = (ImageButton) findViewById(R.id.west);
		plusBtn = (ImageButton) findViewById(R.id.plusBtnD7);
		imageBtn1 = (ImageButton) findViewById(R.id.imageBtn1);
		imageBtn2 = (ImageButton) findViewById(R.id.imageBtn2);
		imageBtn3 = (ImageButton) findViewById(R.id.imageBtn3);
		imageBtn4 = (ImageButton) findViewById(R.id.imageBtn4);

		middle.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Intent myIntent = new Intent(getApplicationContext(),
						TabActivity.class);
				startActivity(myIntent);
			}
		});

		middle.setOnTouchListener(new OnTouchListener() {
			public boolean onTouch(View v, MotionEvent event) {
				if (event.getAction() == MotionEvent.ACTION_DOWN)
					middle.setBackgroundResource(R.drawable.middle_1);
				if (event.getAction() == MotionEvent.ACTION_UP) {
					middle.setBackgroundResource(R.drawable.middle);
				}
				return false;
			}
		});

		west.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Intent myIntent = new Intent(getApplicationContext(),
						WestTabActivity.class);
				startActivity(myIntent);
			}
		});

		west.setOnTouchListener(new OnTouchListener() {
			public boolean onTouch(View v, MotionEvent event) {
				if (event.getAction() == MotionEvent.ACTION_DOWN)
					west.setBackgroundResource(R.drawable.west_1);
				if (event.getAction() == MotionEvent.ACTION_UP) {
					west.setBackgroundResource(R.drawable.west);
				}
				return false;
			}
		});

		east.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Intent myIntent = new Intent(getApplicationContext(),
						EastTabActivity.class);
				startActivity(myIntent);
			}
		});

		east.setOnTouchListener(new OnTouchListener() {
			public boolean onTouch(View v, MotionEvent event) {
				if (event.getAction() == MotionEvent.ACTION_DOWN)
					east.setBackgroundResource(R.drawable.east_1);
				if (event.getAction() == MotionEvent.ACTION_UP) {
					east.setBackgroundResource(R.drawable.east);
				}
				return false;
			}
		});

		plusBtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Intent myIntent = new Intent(
						Intent.ACTION_VIEW,
						Uri.parse("http://www.culture.go.kr/wday/facility/facilityList.do"));
				startActivity(myIntent);
			}
		});

		plusBtn.setOnTouchListener(new OnTouchListener() {
			public boolean onTouch(View v, MotionEvent event) {
				if (event.getAction() == MotionEvent.ACTION_DOWN)
					plusBtn.setBackgroundResource(R.drawable.d7_1);
				if (event.getAction() == MotionEvent.ACTION_UP) {
					plusBtn.setBackgroundResource(R.drawable.d7);
				}
				return false;
			}
		});

		imageBtn1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent myIntent = new Intent(getApplicationContext(),
						Course_Page1.class);
				startActivity(myIntent);
			}
		});

		imageBtn2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent myIntent = new Intent(getApplicationContext(),
						Course_Page2.class);
				startActivity(myIntent);
			}
		});

		imageBtn3.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent myIntent = new Intent(getApplicationContext(),
						Course_Page3.class);
				startActivity(myIntent);
			}
		});

		imageBtn4.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent myIntent = new Intent(getApplicationContext(),
						Course_Page4.class);
				startActivity(myIntent);
			}
		});
	}

	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
		} else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
		}
	}

}