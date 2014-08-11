package com.example.alergdialogbukuannabe;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AlergDialogProject extends Activity {
	Button btn;
	Button exit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_alerg_dialog_project);
		btn = (Button)findViewById(R.id.button1);
		btn.setOnClickListener(new OnClickListener() {
		public void onClick(View arg0) {
		// TODO Auto-generated method stub
		AlertDialog.Builder build = new
		AlertDialog.Builder(AlergDialogProject.this);
		build.setTitle("Message")
		.setIcon(R.drawable.ic_launcher)
		.setMessage("Hai")
		.setPositiveButton("OK",null)
		.show();
		}
		});
		exit = (Button)findViewById(R.id.btnExit);
		exit.setOnClickListener(new OnClickListener() {
		public void onClick(View arg0) {
		// TODO Auto-generated method stub
		AlertDialog.Builder build = new
		AlertDialog.Builder(AlergDialogProject.this);
		build
		.setMessage("apakah benar anda akan keluar")
		.setCancelable(false)
		.setPositiveButton("yes",new
		DialogInterface.OnClickListener() {
		public void onClick(DialogInterface arg0, int
		arg1) {
		// TODO Auto-generated method stub
		System.exit(RESULT_OK);
		}
		})
		.setNegativeButton("tidak",new
		DialogInterface.OnClickListener() {
		public void onClick(DialogInterface arg0, int
		arg1) {
		// TODO Auto-generated method stub
		arg0.cancel();
		}
		})
		.show();
		}
		});
		}
		//kita akan membuat method untuk menampilkan message alergdialog banya bentuk yang di gunakan.
		public void message(){
		AlertDialog.Builder build = new
		AlertDialog.Builder(AlergDialogProject.this);
		build.setTitle("Message")
		.setIcon(R.drawable.ic_launcher)
		.setMessage("Hai")
		.setPositiveButton("OK",null)
		.show();
		}
		public void onClick(View arg0) {
		// TODO Auto-generated method stub
		}
		}
