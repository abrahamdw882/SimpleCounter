package com.example.simpleCounter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView counterText;
    private Button incrementButton;
    private Button resetButton;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        counterText = (TextView) findViewById(R.id.counterText);
        incrementButton = (Button) findViewById(R.id.incrementButton);
        resetButton = (Button) findViewById(R.id.resetButton);

      
        incrementButton.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					counter++;
					counterText.setText(String.valueOf(counter));
				}
			});

       
        resetButton.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					counter = 0;
					counterText.setText(String.valueOf(counter));
				}
			});
    }
}
