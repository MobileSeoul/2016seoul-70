package com.example.scrollview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

@SuppressLint("ValidFragment")
public class EastTab2 extends Fragment {
	Context mContext;

	public EastTab2(Context context) {
		mContext = context;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.activity_east_tab2, null);

		ImageButton button1;
		ImageButton button2;
		ImageButton button3;
		ImageButton button4;
		ImageButton button5;
		ImageButton button6;

		button1 = (ImageButton) view.findViewById(R.id.eb_button1);
		button2 = (ImageButton) view.findViewById(R.id.eb_button2);
		button3 = (ImageButton) view.findViewById(R.id.eb_button3);
		button4 = (ImageButton) view.findViewById(R.id.eb_button4);
		button5 = (ImageButton) view.findViewById(R.id.eb_button5);
		button6 = (ImageButton) view.findViewById(R.id.eb_button6);

		button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent it = new Intent(getActivity(), Eb_Page1.class);
				startActivity(it);
			}
		});

		button2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent it = new Intent(getActivity(), Eb_Page2.class);
				startActivity(it);
			}
		});

		button3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent it = new Intent(getActivity(), Eb_Page3.class);
				startActivity(it);
			}
		});

		button4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent it = new Intent(getActivity(), Eb_Page4.class);
				startActivity(it);
			}
		});

		button5.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent it = new Intent(getActivity(), Eb_Page5.class);
				startActivity(it);
			}
		});

		button6.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent it = new Intent(getActivity(), Eb_Page6.class);
				startActivity(it);
			}
		});

		return view;
	}

}