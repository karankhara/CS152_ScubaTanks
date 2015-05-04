package com.example.karan.scubadive;

//import android.support.v7.app.ActionBarActivity;
/*
DISCLAIMER:
  	Our system is just a PROTOTYPE	and cannot be used to plan real

*/

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;

//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

/* the systems is a PROTYPE and cannot be used	to plan	*/
public class SecondActivity extends Activity implements OnItemSelectedListener
{

    protected EditText mSurfaceTime;
    protected Button mNext, mBtnNewGroup;
    protected TextView mTextView4, mTextNewGroup;
    Spinner s1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        // 4. get bundle from intent
        Bundle bundle = intent.getExtras();
        String message = intent.getStringExtra("mPressureGroup");
        // 5. get status value from bundle
        String get_group = bundle.getString("mPressureGroup");

        mTextNewGroup =  (TextView)findViewById(R.id.textNewGroup);
        mTextView4 = (TextView)findViewById(R.id.textView4);
        (mTextView4).setText(get_group);

       // mSurfaceTime = (EditText)findViewById(R.id.editText);





        s1 = (Spinner)findViewById(R.id.spinner1);
        // s1.setOnItemSelectedListener(this);
        List<String> list = new ArrayList<String>();
        if (mTextView4.getText().toString().equals("A"))
        {
            list.add("--select surface interval--");
            list.add("0:00 - 3:00");

        }
        else if (mTextView4.getText().toString().equals("B"))
        {
            list.add("--select surface interval--");
            list.add("0:00 - 0:47");
            list.add("0:48 - 3:48");
        }
        else if (mTextView4.getText().toString().equals("C"))
        {
            list.add("--select surface interval--");
            list.add("0:00 - 0:21");
            list.add("0:22 - 1:09");
            list.add("1:10 - 4:10");
        }
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapter.notifyDataSetChanged();
        s1.setAdapter(dataAdapter);

        mBtnNewGroup=(Button)findViewById(R.id.btnNewGroup);
        mBtnNewGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String xyz = String.valueOf(s1.getSelectedItem());
                // String abc=xyz;
                //System.out.println(""mTextView4.getText().toString());
                if(mTextView4.getText().toString().equals("A") && xyz == "0:00 - 3:00" )
                {
                    mTextNewGroup.setText("A");
                }
                else if(mTextView4.getText().toString().equals("B") && xyz == "0:00 - 0:47" )
                {
                    mTextNewGroup.setText("B");
                }
                else if(mTextView4.getText().toString().equals("B") && xyz == "0:48 - 3:48" )
                {
                    mTextNewGroup.setText("A");
                }
                else if(mTextView4.getText().toString().equals("C") && xyz == "0:00 - 0:21" )
                {
                    mTextNewGroup.setText("C");
                }
                else if(mTextView4.getText().toString().equals("C") && xyz == "0:22 - 1:09" )
                {
                    mTextNewGroup.setText("B");
                }
                else if(mTextView4.getText().toString().equals("C") && xyz == "1:10 - 4:10" )
                {
                    mTextNewGroup.setText("A");
                }
            }
        });

        mNext=(Button)findViewById(R.id.btnNext);
        mNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                setProgressBarIndeterminateVisibility(true);
                Intent intent2 = new Intent(SecondActivity.this, ThirdActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("mTextNewGroup",mTextNewGroup.getText().toString());
                intent2.putExtras(bundle);
                startActivity(intent2);


            }
        });


    }

    /* the systems is a PROTYPE and cannot be used	to plan	*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);
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
    /* the systems is a PROTYPE and cannot be used	to plan	*/
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3)
    {
        // TODO Auto-generated method stub
        //String sp1 = String.valueOf(s1.getSelectedItem());
        //Toast.makeText(this, sp1, Toast.LENGTH_SHORT).show();

       //
    }
/* the systems is a PROTYPE and cannot be used	to plan	*/

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        //
    }
}