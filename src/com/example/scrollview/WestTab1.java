package com.example.scrollview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

@SuppressLint("ValidFragment")
public class WestTab1 extends Fragment {
	Context mContext;

	public WestTab1(Context context) {
		mContext = context;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.activity_west_tab1, null);

		ImageButton wa_button1;
		ImageButton wa_button2;
		ImageButton wa_button3;
		ImageButton wa_button4;
		ImageButton wa_button5;
		ImageButton wa_button6;

		wa_button1 = (ImageButton) view.findViewById(R.id.wa_button1);
		wa_button2 = (ImageButton) view.findViewById(R.id.wa_button2);
		wa_button3 = (ImageButton) view.findViewById(R.id.wa_button3);
		wa_button4 = (ImageButton) view.findViewById(R.id.wa_button4);
		wa_button5 = (ImageButton) view.findViewById(R.id.wa_button5);
		wa_button6 = (ImageButton) view.findViewById(R.id.wa_button6);

		wa_button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent it = new Intent(getActivity(), Wa_Page1.class);
				startActivity(it);
			}
		});

		wa_button2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent it = new Intent(getActivity(), Wa_Page2.class);
				startActivity(it);
			}
		});

		wa_button3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent it = new Intent(getActivity(), Wa_Page3.class);
				startActivity(it);
			}
		});

		wa_button4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent it = new Intent(getActivity(), Wa_Page4.class);
				startActivity(it);
			}
		});

		wa_button5.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent it = new Intent(getActivity(), Wa_Page5.class);
				startActivity(it);
			}
		});

		wa_button6.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent it = new Intent(getActivity(), Wa_Page6.class);
				startActivity(it);
			}
		});

		return view;
	}

}