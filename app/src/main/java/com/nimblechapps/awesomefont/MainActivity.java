package com.nimblechapps.awesomefont;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvIcon1, tvIcon2, tvIcon3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface iconFont = FontManager.getTypeface(getApplicationContext(), FontManager.FONTAWESOME);

        tvIcon1 = (TextView) findViewById(R.id.tvIcon1);
        tvIcon2 = (TextView) findViewById(R.id.tvIcon2);
        tvIcon3 = (TextView) findViewById(R.id.tvIcon3);

        tvIcon1.setTypeface(iconFont);
        tvIcon2.setTypeface(iconFont);
        tvIcon3.setTypeface(iconFont);
    }
}
