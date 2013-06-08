package com.erikthiem.clevelandgrub;

import android.app.Activity;
import android.content.Intent;
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
		Intent yesButtonClickedIntent = new Intent(this, show_restaurants_activity.class);
		startActivity(yesButtonClickedIntent);
	}
	
	// Handles when the no button is clicked
	public void noButtonClicked(View view)
	{
		Intent noButtonClickedIntent = new Intent(this, mainscreen_no_button_clicked_activity.class);
		startActivity(noButtonClickedIntent);
	}
	
	// This function handles all button clicks in one convenient place!
	public void onClickHandler(View view)
	{
		switch (view.getId())
		{
			case R.id.mainscreen_yes_button:
				yesButtonClicked(view);
				break;
			case R.id.mainscreen_no_button:
				noButtonClicked(view);
				break;
			default:
				// do nothing, there is no default for now
				break;
		}
	}

}
