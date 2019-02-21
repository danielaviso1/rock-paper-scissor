package com.example.rps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class opsyon extends Activity implements OnItemSelectedListener{
	Utility util = new Utility();
	Button Save,Clear,Confirm,Cancel;
	Spinner SpinNumber;
	private int choice = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.opsyonif);
		init();
		SpinNumber=(Spinner) findViewById(R.id.DropDown);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.numbers, android.R.layout.simple_spinner_item);
	    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	    SpinNumber.setOnItemSelectedListener(this);
	    SpinNumber.setAdapter(adapter);
	}
	
	public void init()
	{
		Confirm=(Button) findViewById(R.id.btnConfirm);
		Cancel=(Button) findViewById(R.id.btnCancel);
	}
	
	public void onItemSelected(AdapterView<?> arg0, View arg1, int pos,long id)
	{
		if(pos==0)
		{
			Toast.makeText(this,"3", Toast.LENGTH_LONG).show();
			choice =  3;
		}
		
		else if(pos==1)
		{
			Toast.makeText(this,"5", Toast.LENGTH_LONG).show();
			choice = 5;
		}
		
		else if(pos==2)
		{
			Toast.makeText(this,"7", Toast.LENGTH_LONG).show();
			choice = 7;
		}
		
		else if(pos==3)
		{
			Toast.makeText(this,"10", Toast.LENGTH_LONG).show();
			choice = 10;
		}
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) 
	{
		
	}
	
	public void Confirm(View view)
	{
		
	    
		if(choice == 5)
		{
			util.pos5(5);
		}
		
		else if(choice == 7)
		{
			util.pos7(7);
		}
		
		else if(choice == 10)
		{
			util.pos10(10);
		}
		
		else
		{
			util.pos3(3);
		}
		
		Intent intent = new Intent(this, main.class);
	    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	    startActivity(intent);
		
	}
	
	public void Cancel(View view)
	{
		
	}

}
