package com.example.textweatcherprojectaerdy;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
//implement TextWatcher terlebih dahulu

public class TextWeatcherProjectAerdy extends Activity implements TextWatcher{
	TextView selection;
	AutoCompleteTextView edit;
	// Membuat Array Untuk mengisi items pada layout
	String [] items = {"dede","mamas","ryan","bapak","ibu","pakde","bude"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_text_weatcher_project_aerdy);
		selection = (TextView)findViewById(R.id.selection);
		edit = (AutoCompleteTextView)findViewById(R.id.edit);
		edit.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items));
		edit.addTextChangedListener(this);
		}
		public void afterTextChanged(Editable arg0) {
		// TODO Auto-generated method stub
		}
		public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
		int arg3) {
		// TODO Auto-generated method stub
		}
		public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		edit.setText(edit.getText());
		}
		}