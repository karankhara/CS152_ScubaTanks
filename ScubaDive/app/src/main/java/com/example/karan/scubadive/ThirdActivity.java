package com.example.karan.scubadive;

//import android.support.v7.app.ActionBarActivity;
/*
DISCLAIMER:
  	Our system is just a PROTOTYPE	and cannot be used to plan real

*/
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/* the systems is a PROTYPE and cannot be used	to plan	*/
public class ThirdActivity extends Activity {
    protected TextView mTextView3, mTextView5;


    Spinner s3;
    String get_group2="";
    /* the systems is a PROTYPE and cannot be used	to plan	*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent intent = getIntent();
        // 4. get bundle from intent
        Bundle bundle = intent.getExtras();
        String message = intent.getStringExtra("mTextNewGroup");
        // 5. get status value from bundle
        get_group2 = bundle.getString("mTextNewGroup");

        // mTextNewGroup =  (TextView)findViewById(R.id.textNewGroup);
        mTextView3= (TextView)findViewById(R.id.textView3);
        (mTextView3).setText(get_group2);

        mTextView5= (TextView)findViewById(R.id.textView5);

        s3 = (Spinner)findViewById(R.id.spinner3);

        List<String> listDepth = new ArrayList<>();
        listDepth.add("35");
        listDepth.add("40");
        listDepth.add("50");
        listDepth.add("60");
        listDepth.add("70");
        listDepth.add("80");
        listDepth.add("90");
        listDepth.add("100");
        listDepth.add("1100");
        listDepth.add("120");
        listDepth.add("130");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, listDepth);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapter.notifyDataSetChanged();
        s3.setAdapter(dataAdapter);
        s3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String depthValue = String.valueOf(s3.getSelectedItem());

                if (depthValue.contentEquals("35") && get_group2.contentEquals("A")) {
                    //Toast.makeText(getApplicationContext(), "Your Max Underwater time is 185 minutes", Toast.LENGTH_SHORT).show();
                    (mTextView5).setText("Your Max Underwater time is 185 minutes");
                } else if (depthValue.contentEquals("40") && get_group2.contentEquals("A")) {
                    //Toast.makeText(getApplicationContext(), "Your Max Underwater time is 122 minutes", Toast.LENGTH_SHORT).show();
                    (mTextView5).setText("Your Max Underwater time is 122 minutes");
                } else if (depthValue.contentEquals("50") && get_group2.contentEquals("A")) {
                    //Toast.makeText(getApplicationContext(), "Your Max Underwater time is 66 minutes", Toast.LENGTH_SHORT).show();
                    (mTextView5).setText("Your Max Underwater time is 66 minutes");
                } else if (depthValue.contentEquals("35") && get_group2.contentEquals("B")) {
                    //Toast.makeText(getApplicationContext(), "Your Max Underwater time is 167 minutes", Toast.LENGTH_SHORT).show();
                    (mTextView5).setText("Your Max Underwater time is 167 minutes");
                } else if (depthValue.contentEquals("40") && get_group2.contentEquals("B")) {
                    //Toast.makeText(getApplicationContext(), "Your Max Underwater time is 108 minutes", Toast.LENGTH_SHORT).show();
                    (mTextView5).setText("Your Max Underwater time is 108 minutes");
                } else if (depthValue.contentEquals("50") && get_group2.contentEquals("B")) {
                    //Toast.makeText(getApplicationContext(), "Your Max Underwater time is 54 minutes", Toast.LENGTH_SHORT).show();
                    (mTextView5).setText("Your Max Underwater time is 54 minutes");
                }
                else if (depthValue.contentEquals("35") && get_group2.contentEquals("C")) {
                    //Toast.makeText(getApplicationContext(), "Your Max Underwater time is 54 minutes", Toast.LENGTH_SHORT).show();
                    (mTextView5).setText("Your Max Underwater time is 155 minutes");
                }
                else if (depthValue.contentEquals("40") && get_group2.contentEquals("C")) {
                    //Toast.makeText(getApplicationContext(), "Your Max Underwater time is 54 minutes", Toast.LENGTH_SHORT).show();
                    (mTextView5).setText("Your Max Underwater time is 96 minutes");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });


    }
/* the systems is a PROTYPE and cannot be used	to plan	*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_third, menu);
        return true;
    }
    /* the systems is a PROTYPE and cannot be used	to plan	*/
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}