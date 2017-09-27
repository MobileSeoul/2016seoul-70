package com.example.scrollview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class Page1 extends Activity {
	@Override
    protected void onCreate(Bundle savedInstanceState) { //생성한 것을 올린다
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.page1);
    }
	
	

}
