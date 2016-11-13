package com.example.user.funfacts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FunFactsActivity extends AppCompatActivity {
    private Button mShowFactButton;
    private TextView mFactTextView;
    private RelativeLayout mRelativeLayout;
    FactBook myFactBook = new FactBook();
    ColorWheel myColorWheel = new ColorWheel();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
        mFactTextView = (TextView)findViewById(R.id.factTextView);
        mShowFactButton = (Button)findViewById(R.id.showFactButton);
        mRelativeLayout = (RelativeLayout)findViewById(R.id.activity_fun_facts);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mRelativeLayout.setBackgroundColor(myColorWheel.getColor());
                mFactTextView.setText(myFactBook.getFact());
            }
        };
        mShowFactButton.setOnClickListener(listener);
    }
}
