package com.ding.activity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Gravity;
import android.view.Menu;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.GridLayout.Spec;

public class MainActivity extends Activity {
	
	String [] chars = new String[]{
			"7","8","9","¡Â",
			"4","5","6","¡Á",
			"1","2","3","-",
			".","0","=","+"
	};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_layout);
        
        GridLayout gridLayout = (GridLayout) findViewById(R.id.root);
        
        for(int i = 0; i < chars.length; i++){
        	Button btn = new Button(this);
        	btn.setText(chars[i]);
        	btn.setTextSize(40);
        	Spec rowSpec = GridLayout.spec(i / 4 + 2);
        	Spec columnSpec = GridLayout.spec(i % 4);
        	GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, columnSpec);
        	params.setGravity(Gravity.FILL);
        	gridLayout.addView(btn, params);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
