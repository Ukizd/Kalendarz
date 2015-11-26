package com.example.koniec;

import java.util.Calendar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	int r,m,d,h,min,s;
	TextView view1,view2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button but1 = (Button)findViewById(R.id.button1);
		Button but2 = (Button)findViewById(R.id.button2);
		view1 = (TextView)findViewById(R.id.textView1);
		view2 = (TextView)findViewById(R.id.textView2);
		
		
		but1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				finish();
				
			}
		});
		but2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			Calendar c = Calendar.getInstance();
			r =c.get(Calendar.YEAR);
			m =c.get(Calendar.MONTH);
			d =c.get(Calendar.DAY_OF_MONTH);
			h =c.get(Calendar.HOUR)+1;
			min =c.get(Calendar.MINUTE);
			s = c.get(Calendar.SECOND);
			
			view1.setText(r+" "+m+" "+d+" ");
			view2.setText(h+" "+min+" "+s+" ");
			
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
