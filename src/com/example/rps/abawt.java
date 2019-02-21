package com.example.rps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class abawt extends Activity{
	Button Ok;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.abawtif);
		Ok=(Button) findViewById(R.id.btnOk);
	}
	
	public void Ok(View view)
	{
		Intent intent = new Intent(this, main.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
	}

}
