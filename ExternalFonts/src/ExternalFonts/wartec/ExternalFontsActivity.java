package ExternalFonts.wartec;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class ExternalFontsActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        String fontpath = "fonts/Face Your Fears.ttf";
        
        TextView txtWartec= (TextView)findViewById(R.id.wartec);
        
        Typeface tf = Typeface.createFromAsset(getAssets(),fontpath);
        
        txtWartec.setTypeface(tf);
    }
  //pembuatan method inflater menu.
    public boolean onCreateOptionsMenu(Menu menu) {
    MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.menu,menu);
    return true;
    }
    //pembuatan method pemaggilan menu
    public boolean onOptionsItemSelected(MenuItem item) {
    // Handle item selection
    switch (item.getItemId()) {
    case R.id.about:
    about();
    return true;
    case R.id.exit:
    	exit();
    	return true;
    	default:
    	return super.onOptionsItemSelected(item);
    	}
    	}
    	//Method exit
    	private void exit() {
    	// TODO Auto-generated method stub
    	}
    	//method about
    	private void about() {
    	// TODO Auto-generated method stub
    	}

}