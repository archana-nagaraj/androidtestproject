package com.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class HelloWorldActivity extends Activity
{
	
	TextView tv;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        /*tv=new TextView(this);
        tv.setText("Hello ANdroid World");
        setContentView(tv);*/
        setContentView(R.layout.main);
        tv=(TextView)findViewById(R.id.textView1);
        tv.setText("Hello Android World");    
        
    }
}