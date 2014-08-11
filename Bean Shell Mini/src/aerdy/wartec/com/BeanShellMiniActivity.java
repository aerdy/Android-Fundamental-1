package aerdy.wartec.com;

import bsh.Interpreter;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;

public class BeanShellMiniActivity extends Activity {
    /** Called when the activity is first created. */
	private Interpreter i=new Interpreter();
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TabHost tabs=(TabHost)findViewById(R.id.tabhost);
        tabs.setup();

        Button btn=(Button)findViewById(R.id.eval);
        final EditText script=(EditText)findViewById(R.id.script);
        btn.setOnClickListener(new View.OnClickListener() {
        	
        public void onClick(View view) {
        String src=script.getText().toString();
        try {
        i.set("context",BeanShellMiniActivity.this);
        i.eval(src);
        AlertDialog.Builder builder=  new AlertDialog.Builder(BeanShellMiniActivity.this);
       
        builder
        .setTitle("Compile")
        .setMessage((String) i.eval(src))
        .setPositiveButton("OK",null);
        }
        catch (bsh.EvalError e) {
        AlertDialog.Builder builder=
        new AlertDialog.Builder(BeanShellMiniActivity.this);
        builder
        .setTitle("Error!!!")
        .setMessage(e.toString())
        .setPositiveButton("OK", null)
        .show();
        }
        }
        });
        
        
        TabHost.TabSpec spec=tabs.newTabSpec("tag1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("BeanShell");
        tabs.addTab(spec);
        
        spec=tabs.newTabSpec("tag2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("History");
        tabs.addTab(spec);
        
        spec=tabs.newTabSpec("tag2");
        spec.setContent(R.id.tab3);
        spec.setIndicator("About");
        tabs.addTab(spec);
        tabs.setCurrentTab(0);
    }
}