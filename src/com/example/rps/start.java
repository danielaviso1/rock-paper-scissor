package com.example.rps;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class start extends Activity{
	Utility util = new Utility();
	TextView txtBest;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.startif);
		init();
	}
	
	public void init()
	{
		txtBest=(TextView) findViewById(R.id.txtBest);
	}
	
	public void Save(View view)
	{
		txtBest.setText("Best of : " + util.pos());
	}

}
