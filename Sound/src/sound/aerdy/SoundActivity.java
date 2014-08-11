package sound.aerdy;

import android.app.Activity;
import java.io.IOException;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class SoundActivity extends Activity {
    /** Called when the activity is first created. */
	ImageButton mainkan;
	MediaPlayer mp;
	MediaPlayer mp2;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
        mainkan=(ImageButton)findViewById(R.id.start);
        mainkan.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				mainkan.setEnabled(false);
				go();
			}
		});
    }
	
	public void go(){
		mp=MediaPlayer.create(this,R.raw.do2);
		try {
		mp.prepare();
		} catch (IllegalStateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		mp.start();
		mp.setOnCompletionListener(new OnCompletionListener(){
		public void onCompletion(MediaPlayer arg0){
		mainkan.setEnabled(true);
		}
		});
		}

	}
