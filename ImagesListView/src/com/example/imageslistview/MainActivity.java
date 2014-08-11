package com.example.imageslistview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends Activity {
private ListView listview1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 Fruit weather_data[] = new Fruit[]
				 
				         {
				 
				             new Fruit(R.drawable.a1, "Nasi Goreng"),
				 
				             new Fruit(R.drawable.a2, "Mie Ayah"),
				 
				             new Fruit(R.drawable.a1, "Nasi Goreng"),
				 
				             new Fruit(R.drawable.a1, "Nasi Goreng"),
				 
				             new Fruit(R.drawable.a2, "Mie Ayam")
				 
				         };
		 
		 FruitAdapter adapter = new FruitAdapter(this,R.layout.listview_item_row, weather_data);

		 listview1 = (ListView)findViewById(R.id.listView1);
		 View header = (View)getLayoutInflater().inflate(R.layout.list_view_header_row,null);
		 listview1.addHeaderView(header);
		 listview1.setAdapter(adapter);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
