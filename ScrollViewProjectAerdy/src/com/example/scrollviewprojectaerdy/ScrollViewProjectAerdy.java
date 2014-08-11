package com.example.scrollviewprojectaerdy;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ScrollViewProjectAerdy extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scroll_view_project_aerdy);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_scroll_view_project_aerdy,
				menu);
		return true;
	}

}
