package com.example.tabmenuprojectaerdy;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class TabMenuProjectAerdy extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tab_menu_project_aerdy);
		   TabHost tabs=(TabHost)findViewById(R.id.tabhost);
	        tabs.setup();
	        TabHost.TabSpec spec=tabs.newTabSpec("tag1");
	        
	        
	        spec.setContent(R.id.tab1);
	        spec.setIndicator("Clock");
	        tabs.addTab(spec);
	       
	        spec=tabs.newTabSpec("tag2");
	        spec.setContent(R.id.tab2);
	        spec.setIndicator("Button");
	        tabs.addTab(spec);
	        tabs.setCurrentTab(0);

	    }
	}