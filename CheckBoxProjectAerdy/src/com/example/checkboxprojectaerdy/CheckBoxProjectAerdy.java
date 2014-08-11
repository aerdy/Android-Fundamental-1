package com.example.checkboxprojectaerdy;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

import android.app.Activity;
import android.view.Menu;

public class CheckBoxProjectAerdy extends Activity implements OnCheckedChangeListener{
	CheckBox cb;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_check_box_project_aerdy);
		cb = (CheckBox)findViewById(R.id.check);
		cb.setOnCheckedChangeListener(this);
		}
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		// TODO Auto-generated method stub
		// Memberikan Opsion percabangan.
		if(isChecked){
		cb.setText("this checkbox is : checked");
		}else {
		cb.setText("this checkbox is : unchecked");
		}
		}
		}
