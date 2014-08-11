package com.example.duaaktivitiprojectaerdy;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DuaAktivitiProjectAerdy extends Activity implements OnClickListener {
	Button btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dua_aktiviti_project_aerdy);
		btn = (Button)findViewById(R.id.button1);
		btn.setOnClickListener(this);
		}
		//method untuk menampilkan aktivitas kedua yaitu child.class
		
		@Override
		public void onClick(android.view.View v) {
			// TODO Auto-generated method stub
			Intent i = new Intent(DuaAktivitiProjectAerdy.this , Child.class);
			startActivity(i);
		}
		}
