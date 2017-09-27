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
public class WestTab2 extends Fragment {
	Context mContext;

	public WestTab2(Context context) {
		mContext = context;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.activity_west_tab2, null);

		ImageButton wb_button1;
		ImageButton wb_button2;
		ImageButton wb_button3;
		ImageButton wb_button4;
		ImageButton wb_button5;
		ImageButton wb_button6;

		wb_button1 = (ImageButton) view.findViewById(R.id.wb_button1);
		wb_button2 = (ImageButton) view.findViewById(R.id.wb_button2);
		wb_button3 = (ImageButton) view.findViewById(R.id.wb_button3);
		wb_button4 = (ImageButton) view.findViewById(R.id.wb_button4);
		wb_button5 = (ImageButton) view.findViewById(R.id.wb_button5);
		wb_button6 = (ImageButton) view.findViewById(R.id.wb_button6);

		wb_button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent it = new Intent(getActivity(), Wb_Page1.class);
				startActivity(it);
			}
		});

		wb_button2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent it = new Intent(getActivity(), Wb_Page2.class);
				startActivity(it);
			}
		});

		wb_button3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent it = new Intent(getActivity(), Wb_Page3.class);
				startActivity(it);
			}
		});

		wb_button4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent it = new Intent(getActivity(), Wb_Page4.class);
				startActivity(it);
			}
		});

		wb_button5.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent it = new Intent(getActivity(), Wb_Page5.class);
				startActivity(it);
			}
		});

		wb_button6.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent it = new Intent(getActivity(), Wb_Page6.class);
				startActivity(it);
			}
		});

		return view;
	}

}