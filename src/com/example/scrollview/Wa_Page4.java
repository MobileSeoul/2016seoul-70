package com.example.scrollview;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Wa_Page4 extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wm_page4);

		final ActionBar actionBar = getActionBar();
		actionBar.setCustomView(R.layout.actionbar_custom_view_home);
		actionBar.setDisplayShowTitleEnabled(false);
		actionBar.setDisplayShowCustomEnabled(true);
		actionBar.setDisplayUseLogoEnabled(false);
		actionBar.setDisplayShowHomeEnabled(false);
		TextView tv1 = (TextView) findViewById(R.id.textView1);
		TextView tv2 = (TextView) findViewById(R.id.textView2);
		TextView tv3 = (TextView) findViewById(R.id.textBtn);

		tv1.setTypeface(Typeface.createFromAsset(getAssets(),
				"cherryblossom.ttf"));
		tv2.setTypeface(Typeface.createFromAsset(getAssets(),
				"cherryblossom.ttf"));
		tv3.setTypeface(Typeface.createFromAsset(getAssets(),
				"cherryblossom.ttf"));
	}

	public void callBtn(View v) {
		Intent myIntent = new Intent(Intent.ACTION_VIEW,
				Uri.parse("tel:02-2632-8848"));
		startActivity(myIntent);
	}

	public void textBtn(View v) {
		Intent myIntent = new Intent(Intent.ACTION_VIEW,
				Uri.parse("http://www.gongcraft.net/"));
		startActivity(myIntent);
	}

}