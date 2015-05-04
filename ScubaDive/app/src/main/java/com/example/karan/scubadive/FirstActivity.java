package com.example.karan.scubadive;
/*
DISCLAIMER:
  	Our system is just a PROTOTYPE	and cannot be used to plan real

*/
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;


public class FirstActivity extends Activity {

    private EditText mDepth;
    private EditText mBottom;
    protected TextView mPressureGroup;
    private Button mNextDive;
    protected Button mCheckGroup;
    String depth, bottom;

    /* the systems is a PROTYPE and cannot be used	to plan	*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
       // SQLiteDatabase sqdb;
       // Cursor resultSet = sqdb.rawQuery("Select * from TutorialsPoint", null);

        final DBAdapter2 db = new DBAdapter2(this);

        Log.d("Insert: ", "Inserting ..");
        db.insertRow(new Dive("35", "10", "A"));
        db.insertRow(new Dive("35", "19", "B"));
        db.insertRow(new Dive("35", "25", "C"));
        db.insertRow(new Dive("35", "29", "D"));
        db.insertRow(new Dive("35", "32", "E"));
        db.insertRow(new Dive("35", "36", "F"));
        db.insertRow(new Dive("35", "40", "G"));
        db.insertRow(new Dive("35", "44", "H"));
        db.insertRow(new Dive("35", "48", "I"));
        db.insertRow(new Dive("35", "52", "J"));
        db.insertRow(new Dive("35", "57", "K"));
        db.insertRow(new Dive("35", "62", "L"));
        db.insertRow(new Dive("35", "67", "M"));



        db.insertRow(new Dive("40", "09", "A"));
        db.insertRow(new Dive("40", "16", "B"));
        db.insertRow(new Dive("40", "22", "C"));
        db.insertRow(new Dive("40", "25", "D"));
        db.insertRow(new Dive("40", "27", "E"));
        db.insertRow(new Dive("40", "31", "F"));
        db.insertRow(new Dive("40", "34", "G"));
        db.insertRow(new Dive("40", "37", "H"));
        db.insertRow(new Dive("40", "40", "I"));
        db.insertRow(new Dive("40", "44", "J"));
        db.insertRow(new Dive("40", "48", "K"));


        db.insertRow(new Dive("50", "07", "A"));
        db.insertRow(new Dive("50", "13", "B"));
        db.insertRow(new Dive("50", "17", "C"));
        db.insertRow(new Dive("50", "19", "D"));
        db.insertRow(new Dive("50", "21", "E"));
        db.insertRow(new Dive("50", "24", "F"));
        db.insertRow(new Dive("50", "26", "G"));
        db.insertRow(new Dive("50", "28", "H"));
        db.insertRow(new Dive("50", "31", "I"));
        db.insertRow(new Dive("50", "33", "J"));
        db.insertRow(new Dive("50", "36", "K"));
        db.insertRow(new Dive("50", "39", "L"));

        db.insertRow(new Dive("60", "6", "A"));
        db.insertRow(new Dive("60", "11", "B"));
        db.insertRow(new Dive("60", "14", "C"));
        db.insertRow(new Dive("60", "16", "D"));
        db.insertRow(new Dive("60", "17", "E"));
        db.insertRow(new Dive("60", "19", "F"));
        db.insertRow(new Dive("60", "21", "G"));
        db.insertRow(new Dive("60", "23", "H"));
        db.insertRow(new Dive("60", "25", "I"));
        db.insertRow(new Dive("60", "27", "J"));
        db.insertRow(new Dive("60", "29", "K"));
        db.insertRow(new Dive("60", "31", "L"));

        db.insertRow(new Dive("70", "5", "A"));
        db.insertRow(new Dive("70", "9", "B"));
        db.insertRow(new Dive("70", "12", "C"));
        db.insertRow(new Dive("70", "13", "D"));
        db.insertRow(new Dive("70", "15", "E"));
        db.insertRow(new Dive("70", "16", "F"));
        db.insertRow(new Dive("70", "18", "G"));
        db.insertRow(new Dive("70", "19", "H"));
        db.insertRow(new Dive("70", "21", "I"));
        db.insertRow(new Dive("70", "22", "J"));
        db.insertRow(new Dive("70", "24", "K"));
        db.insertRow(new Dive("70", "26", "L"));

        db.insertRow(new Dive("80", "4", "A"));
        db.insertRow(new Dive("80", "8", "B"));
        db.insertRow(new Dive("80", "10", "C"));
        db.insertRow(new Dive("80", "11", "D"));
        db.insertRow(new Dive("80", "13", "E"));
        db.insertRow(new Dive("80", "14", "F"));
        db.insertRow(new Dive("80", "15", "G"));
        db.insertRow(new Dive("80", "17", "H"));
        db.insertRow(new Dive("80", "18", "I"));
        db.insertRow(new Dive("80", "19", "J"));
        db.insertRow(new Dive("80", "21", "K"));
        db.insertRow(new Dive("80", "22", "L"));

        db.insertRow(new Dive("90", "4", "A"));
        db.insertRow(new Dive("90", "7", "B"));
        db.insertRow(new Dive("90", "9", "C"));
        db.insertRow(new Dive("90", "10", "D"));
        db.insertRow(new Dive("90", "11", "E"));
        db.insertRow(new Dive("90", "12", "F"));
        db.insertRow(new Dive("90", "13", "G"));
        db.insertRow(new Dive("90", "15", "H"));
        db.insertRow(new Dive("90", "16", "I"));
        db.insertRow(new Dive("90", "17", "J"));
        db.insertRow(new Dive("90", "18", "K"));
        db.insertRow(new Dive("90", "19", "L"));

        db.insertRow(new Dive("100", "3", "A"));
        db.insertRow(new Dive("100", "6", "B"));
        db.insertRow(new Dive("100", "8", "C"));
        db.insertRow(new Dive("100", "9", "D"));
        db.insertRow(new Dive("100", "10", "E"));
        db.insertRow(new Dive("100", "11", "F"));
        db.insertRow(new Dive("100", "12", "G"));
        db.insertRow(new Dive("100", "13", "H"));
        db.insertRow(new Dive("100", "14", "I"));
        db.insertRow(new Dive("100", "15", "J"));
        db.insertRow(new Dive("100", "16", "K"));
        db.insertRow(new Dive("100", "17", "L"));



        // Reading all contacts
        Log.d("Reading: ", "Reading all DIVES..");
        ArrayList<Dive> dives = db.getAllRows();

     /*   for (Dive dn : dives) {
            String log = "Id: " + dn.getID() + " ,Depth: " + dn.getDepth() + " ,Time: "
                    + dn.getTime() + " ,Group: " + dn.getPressure();
            // Writing Contacts to log
            Log.d("Depth: ", log);
        } */

        mDepth = (EditText) findViewById(R.id.editDepth);
        mBottom = (EditText) findViewById(R.id.editBottom);
        mPressureGroup=(TextView) findViewById(R.id.viewGroup);
        /*mDepth = getResources().getStringArray(R.array.depth_arrays);
        //imgs = getResources().obtainTypedArray(R.array.countries_flag_list);

        //image = (ImageView) findViewById(R.id.country_image);
        spinner = (Spinner) findViewById(R.id.spDepth);

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, states);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

        spinner.setOnItemSelectedListener(new OnItemSelectedListener() { */


            mCheckGroup = (Button) findViewById(R.id.btn_group);
        /* the systems is a PROTYPE and cannot be used	to plan	*/
        mCheckGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                depth = mDepth.getText().toString();
                bottom = mBottom.getText().toString();
                Log.d("Values","|| depth = "+depth+"..bottom = "+bottom);

                setProgressBarIndeterminateVisibility(true);
                String put_group= db.getGroup(depth,bottom);
                CharSequence char_put_group=put_group;
                mPressureGroup.setText(char_put_group);

                //Intent intent = new Intent(FirstActivity.this, FirstActivity.class);
                //startActivity(intent);
            }
        });



        mNextDive = (Button) findViewById(R.id.btn_next);
        /* the systems is a PROTYPE and cannot be used	to plan	*/
        mNextDive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // on pressing check group button


                if (depth.isEmpty() || bottom.isEmpty()) {
                    AlertDialog.Builder builder = new AlertDialog.Builder((FirstActivity.this));

                    builder.setMessage("Please fill both fields");
                    //builder.setTitle(getString(R.string.login_error_title));
                    builder.setPositiveButton(android.R.string.ok, null);
                    AlertDialog dialog = builder.create();
                    dialog.show();
                } else {

                    setProgressBarIndeterminateVisibility(true);
                    /*ParseUser.logInInBackground(username,password,new LogInCallback() {
                        @Override
                        public void done(ParseUser parseUser, ParseException e)
                        {
                            setProgressBarIndeterminateVisibility(false);
                            if(e==null)
                            {  */

                    // now put pressure group value in pressure field


                    Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("mPressureGroup",mPressureGroup.getText().toString());
                    intent.putExtras(bundle);
                    startActivity(intent);


                }
            }
        });

    }

    /* public String matchData(String dep, String bot) {

    } */
/* the systems is a PROTYPE and cannot be used	to plan	*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_first, menu);
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