package com.willyDigital.cineme.ui.Activity;


import com.willyDigital.cineme.R;
import com.willyDigital.cineme.Api.CNRequestBuilder;
import com.willyDigital.cineme.Service.Service;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Intent intent = CNRequestBuilder.intentForUpcomingMovies(this);
		 intent.putExtra(Service.EXTRA_RESULT_RECEIVER, "tesst");
		startService(intent);
		
				
		Log.d("OnCreate", "startService here");
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
