package com.example.rps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class main extends Activity
{
	Button Option,Start,About,Exit;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.intface);
		init();
	}
	
	public void init()
	{
		Start=(Button) findViewById(R.id.Start);
		Option=(Button) findViewById(R.id.Option);
		About=(Button) findViewById(R.id.About);
		Exit=(Button) findViewById(R.id.Exit);
	}
	
	public void Start(View view)
	{
		Intent openWindow=new Intent("com.example.rps.start");
		startActivity(openWindow);
	}
	
	public void Option(View view)
	{
		Intent openWindow=new Intent("com.example.rps.opsyon");
		startActivity(openWindow);
	}
	
	public void About(View view)
	{
		Intent openWindow=new Intent("com.example.rps.abawt");
		startActivity(openWindow);
	}
	
	public void Exit(View view)
	{
		System.exit(0);
	}
	
}

