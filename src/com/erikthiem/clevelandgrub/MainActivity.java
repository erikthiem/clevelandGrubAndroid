package com.erikthiem.clevelandgrub;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	// Handles when the yes button is clicked
	public void yesButtonClicked(View view)
	{
		
	}
	
	// Handles when the no button is clicked
	public void noButtonClicked(View view)
	{
		
	}
	
	// This function handles all button clicks in one convenient place!
	public void onClickHandler(View view)
	{
		switch (view.getId())
		{
			case R.id.mainscreen_yes_button:
				//yes button clicked
				System.out.println("yes button clicked");
				break;
			case R.id.mainscreen_no_button:
				//no button clicked
				System.out.println("no button clicked");
				break;
			default:
				// do nothing, there is no default for now
				break;
		}
	}

}
