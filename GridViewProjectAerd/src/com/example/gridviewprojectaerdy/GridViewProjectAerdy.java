package com.example.gridviewprojectaerdy;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.AdapterView.OnItemSelectedListener;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.GridLayoutAnimationController;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.GridView;
import android.widget.TextView;
//sebelumnya kita memasukkan implement kepada class activity

public class GridViewProjectAerdy extends Activity implements OnItemSelectedListener{
	TextView selection;
	GridView g;
	//membuat array untuk memasukkan nilai pada layout
	String [] items = {"dede","mamas","bapak","ibu","ryan","pakde","bude"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grid_view_project_aerdy);
		selection = (TextView)findViewById(R.id.selection);
		g = (GridView)findViewById(R.id.gridView1);
		g.setAdapter(new FunnyAdapter(this , android.R.layout.simple_list_item_1,items));
		g.setOnItemSelectedListener(this);
		}
		//Masih terjadi error pada FUnnyAdapter
		// kita akan membuat class Abstrac dan di implement kan ArrayAdapter
		public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
		long arg3) {
		// TODO Auto-generated method stub
		selection.setText(items[arg2]);
		}
		public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		selection.setText("");
		}
		public class FunnyAdapter extends ArrayAdapter{
		private Context context;
		public FunnyAdapter(Context context, int textViewResourceId , String [] items) {
		super(context, textViewResourceId,items);
		// TODO Auto-generated constructor stub
		this.context = context;
		}
		}
		}