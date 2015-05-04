package com.example.karan.scubadive;


/*
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class AndroidSQLiteActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   setContentView(R.layout.main);

        DBAdapter db = new DBAdapter(this);

        Log.d("Insert: ", "Inserting ..");
        db.insertRow(new Dive("35","10","A"));
        db.insertRow(new Dive("35","19","B"));
        db.insertRow(new Dive("35","25","C"));
        db.insertRow(new Dive("35","29","D"));

        db.insertRow(new Dive("40","09","A"));
        db.insertRow(new Dive("40","16","B"));
        db.insertRow(new Dive("40","22","C"));
        db.insertRow(new Dive("40","25","D"));

        db.insertRow(new Dive("50","07","A"));
        db.insertRow(new Dive("50","13","B"));
        db.insertRow(new Dive("50","17","C"));
        db.insertRow(new Dive("50","19","D"));

        // Reading all contacts
        Log.d("Reading: ", "Reading all DIVES..");
        List<Dive> dives = db.getAllRows();

        for (Dive dn : dives) {
            String log = "Id: "+dn.getID()+" ,Depth: " + dn.getDepth() + " ,Time: " + dn.getTime() + " ,Group: " + dn.getPressure();
            // Writing Contacts to log
            Log.d("Depth: ", log);
        }
    }
}

*/