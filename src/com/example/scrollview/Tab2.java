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
public class Tab2 extends Fragment {
	Context mContext;

	public Tab2(Context context) {
		mContext = context;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.activity_tab2, null);

		ImageButton mb_button1;
		ImageButton mb_button2;
		ImageButton mb_button3;
		ImageButton mb_button4;
		ImageButton mb_button5;
		ImageButton mb_button6;

		mb_button1 = (ImageButton) view.findViewById(R.id.mb_button1);
		mb_button2 = (ImageButton) view.findViewById(R.id.mb_button2);
		mb_button3 = (ImageButton) view.findViewById(R.id.mb_button3);
		mb_button4 = (ImageButton) view.findViewById(R.id.mb_button4);
		mb_button5 = (ImageButton) view.findViewById(R.id.mb_button5);
		mb_button6 = (ImageButton) view.findViewById(R.id.mb_button6);

		mb_button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent it = new Intent(getActivity(), Mb_Page1.class);
				startActivity(it);
			}
		});

		mb_button2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent it = new Intent(getActivity(), Mb_Page2.class);
				startActivity(it);
			}
		});

		mb_button3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent it = new Intent(getActivity(), Mb_Page3.class);
				startActivity(it);
			}
		});

		mb_button4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent it = new Intent(getActivity(), Mb_Page4.class);
				startActivity(it);
			}
		});

		mb_button5.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent it = new Intent(getActivity(), Mb_Page5.class);
				startActivity(it);
			}
		});

		mb_button6.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent it = new Intent(getActivity(), Mb_Page6.class);
				startActivity(it);
			}
		});

		return view;
	}

}