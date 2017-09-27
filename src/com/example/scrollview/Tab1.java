package com.example.scrollview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

@SuppressLint("ValidFragment")
public class Tab1 extends Fragment {
	Context mContext;

	public Tab1(Context context) {
		mContext = context;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.activity_tab1, null);

		ImageButton ma_button1;
		ImageButton ma_button2;
		ImageButton ma_button3;
		ImageButton ma_button4;
		ImageButton ma_button5;
		ImageButton ma_button6;
		ImageButton ma_button7;

		ma_button1 = (ImageButton) view.findViewById(R.id.ma_button1);
		ma_button2 = (ImageButton) view.findViewById(R.id.ma_button2);
		ma_button3 = (ImageButton) view.findViewById(R.id.ma_button3);
		ma_button4 = (ImageButton) view.findViewById(R.id.ma_button4);
		ma_button5 = (ImageButton) view.findViewById(R.id.ma_button5);
		ma_button6 = (ImageButton) view.findViewById(R.id.ma_button6);
		ma_button7 = (ImageButton) view.findViewById(R.id.ma_button7);

		ma_button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent it = new Intent(getActivity(), Ma_Page1.class);
				startActivity(it);
			}
		});

		ma_button2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent it = new Intent(getActivity(), Ma_Page2.class);
				startActivity(it);
			}
		});

		ma_button3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent it = new Intent(getActivity(), Ma_Page3.class);
				startActivity(it);
			}
		});

		ma_button4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent it = new Intent(getActivity(), Ma_Page4.class);
				startActivity(it);
			}
		});

		ma_button5.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent it = new Intent(getActivity(), Ma_Page5.class);
				startActivity(it);
			}
		});

		ma_button6.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent it = new Intent(getActivity(), Ma_Page6.class);
				startActivity(it);
			}
		});

		ma_button7.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent it = new Intent(getActivity(), Ma_Page7.class);
				startActivity(it);
			}
		});
		return view;
	}
}