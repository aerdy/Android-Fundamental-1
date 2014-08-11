package com.example.spinnerprojectaerdy;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class SpinnerProjectAerdy extends Activity {
	TextView selection;
	Spinner spin;
	String [] items = {"dede","mamas","ryan","ibu","bapak"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spinner_project_aerdy);
		//Membuat hubungan antara Layout dengan Activity java
				selection = (TextView)findViewById(R.id.selection);
				spin = (Spinner)findViewById(R.id.spinner);
				ArrayAdapter<String> aa = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item,items);
				aa.setDropDownViewResource(android.R.layout.simple_spinner_item);
				spin.setAdapter(aa);
				}
				public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
				// TODO Auto-generated method stub
				selection.setText(items[arg2]);
				}
				public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				selection.setText("");
				}
				}
