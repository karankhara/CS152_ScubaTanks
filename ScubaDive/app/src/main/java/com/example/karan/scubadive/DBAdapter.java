//package com.example.karan.scubadive;
//
//
//import android.content.ContentValues;
//import android.content.Context;
//import android.database.Cursor;
//import android.database.DatabaseUtils;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//import android.util.Log;
//
//import java.util.ArrayList;
//import java.util.List;
//
////Search for "TODO", and make the appropriate changes.
//public class DBAdapter {
//
//    public static final String DATABASE_NAME = "scubaDB.db";
//    public static final String DATABASE_TABLE = "first_table";
//    public static final int DATABASE_VERSION = 1;
//
//    public static final String KEY_COLUMN_ID = "id";
//    public static final String KEY_DEPTH = "depth";
//    public static final String KEY_BOTTOM_TIME = "bot_time";
//    public static final String KEY_PRESSURE_GROUP = "pr_group";
////
//    public static final int COLUMN_ROW_ID = 0;
//    public static final int COLUMN_DEPTH = 1;
//    public static final int COLUMN_BOTTOM_TIME = 2;
//    public static final int COLUMN_PRESSURE_GROUP = 3;
//
//
//
////    public static final String COLUMN_DEPTH = "depth";
////    public static final String COLUMN_BOTTOM = "bot_time";
////    public static final String COLUMN_GROUP = "pr_group";
//
////    public static final String[] ALL_KEYS = new String[] {KEY_COLUMN_ID, KEY_DEPTH, KEY_BOTTOM_TIME,KEY_PRESSURE_GROUP};
//
//
//	/*private static final String DATABASE_CREATE_SQL =
//			"create table " + DATABASE_TABLE
//			+ " (" + COLUMN_ROWID + " integer primary key autoincrement, "
//            +COLUMN_BOTTOM+ "string not null, "
//            +COLUMN_DEPTH+ "string not null"
//            +COLUMN_GROUP+ "string not null"
//
//			// Rest  of creation:
//			+ ");";
//
//	// Context of application who uses us.
//*/	private final Context context;
//
//	private DatabaseHelper myDBHelper;
//	private SQLiteDatabase db;
//
//
//    public DBAdapter(Context context) {
////        super(context, DATABASE_NAME, null, DATABASE_VERSION);
//        this.context = context;
//        myDBHelper = new DatabaseHelper(context);
//
//    }
//
//    // Open the database connection.
//	/*public DBAdapter open() {
//		db = myDBHelper.getWritableDatabase();
//		return this;
//	}
//
//	// Close the database connection.
//	public void close() {
//		myDBHelper.close();
//	}
//*/
//
//    // creating tables
//    @Override
//    public void onCreate(SQLiteDatabase db)
//    {
//        String DATABASE_CREATE_SQL = "CREATE TABLE " + DATABASE_TABLE
//                + "(" + KEY_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
//
//                + KEY_DEPTH + "integer not null ,"
//                + KEY_BOTTOM_TIME + "integer not null, "
//                + KEY_PRESSURE_GROUP + "text not null"
//
//                +")";
//        db.execSQL(DATABASE_CREATE_SQL);
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        db.execSQL("DROP TABLE IF EXISTS "+DATABASE_TABLE);
//        onCreate(db);
//    }
//
//
//   // void insertRow(Dive dive) {
//   public boolean insertRow(Dive dive) {
//        SQLiteDatabase db = this.getWritableDatabase();
//
//        ContentValues values = new ContentValues();
//        values.put(KEY_BOTTOM_TIME, dive.getTime());
//        values.put(KEY_DEPTH, dive.getDepth());
//        values.put(KEY_PRESSURE_GROUP, dive.getPressure());
//        // Inserting Row
//        db.insert(DATABASE_TABLE, null, values);
//        //db.close(); // Closing database connection
//        return true;
//    }
//
//    public Cursor getData(int id)
//    {
//        SQLiteDatabase db = this.getReadableDatabase();
//        Cursor res = db.rawQuery("select * from  first_table where id="+id+"",null );
//        Log.d("res::::: ", String.valueOf(res));
//        return res;
//    }
//
//    public int numberOfRows()
//    {
//        SQLiteDatabase db = this.getReadableDatabase();
//        int numRows = (int) DatabaseUtils.queryNumEntries(db, DATABASE_TABLE);
//        return numRows;
//    }
//
//    // Delete a row from the database, by rowId (primary key)
//    public boolean deleteRow(long rowId) {
//        SQLiteDatabase db = this.getWritableDatabase();
//        String where = COLUMN_ROW_ID + "=" + rowId;
//        return db.delete(DATABASE_TABLE, where, null) != 0;
//    }
//
//	/*public void deleteAll() {
//		Cursor c = getAllRows();
//		long rowId = c.getColumnIndexOrThrow(COLUMN_ID);
//		if (c.moveToFirst()) {
//			do {
//				deleteRow(c.getLong((int) rowId));
//			} while (c.moveToNext());
//		}
//		c.close();
//	}*/
//
//    // Return all data in the database.
//	/*public Cursor getAllRows() {
//        SQLiteDatabase db = this.getWritableDatabase();
//		String where = null;
//		Cursor c = 	db.query(true, DATABASE_TABLE, ALL_KEYS,
//							where, null, null, null, null, null);
//		if (c != null) {
//			c.moveToFirst();
//		}
//		return c;
//	}  */
//    public List<Dive> getAllRows() {
//        List<Dive> diveList = new ArrayList<Dive>();
//        // Select All Query
//        String selectQuery = "SELECT  * FROM " + DATABASE_TABLE;
//
//        SQLiteDatabase db = this.getWritableDatabase();
//        Cursor cursor = db.rawQuery(selectQuery, null);
//
//        // looping through all rows and adding to list
//        if (cursor.moveToFirst()) {
//            do {
//                Dive dive = new Dive();
//                dive.setID(Integer.parseInt(cursor.getString(0)));
//                dive.set_depth(cursor.getString(1));
//                dive.setTime(cursor.getString(2));
//                dive.setPressure(cursor.getString(3));
//                // Adding dive to list
//                diveList.add(dive);
//            } while (cursor.moveToNext());
//        }
//
//        // return contact list
//        return diveList;
//    }
//
//    // Get a specific row (by rowId)
//	/*public Cursor getRow(long rowId) {
//        SQLiteDatabase db = this.getWritableDatabase();
//		String where = COLUMN_ID + "=" + rowId;
//		Cursor c = 	db.query(true, DATABASE_TABLE, ALL_KEYS,
//						where, null, null, null, null, null);
//		if (c != null) {
//			c.moveToFirst();
//		}
//		return c;
//	} */
//
//    // Change an existing row to be equal to new data.
//	/*public boolean updateRow(long rowId, String name, String email, String phoneNumber, String fb_profile, String template_id) {
//		String where = COLUMN_ROWID + "=" + rowId;
//
//		/*
//		 * CHANGE 4:
//		 */
//    // TODO: Update data in the row with new fields.
//    // TODO: Also change the function's arguments to be what you need!
//    // Create row's data:
//		/*ContentValues newValues = new ContentValues();
//		newValues.put(COLUMN_NAME, name);
//		newValues.put(COLUMN_EMAIL, email);
//		newValues.put(COLUMN_PHONE_NUMBER, phoneNumber);
//		if (fb_profile == null)
//			newValues.put(COLUMN_FB_PROFILE, "");
//		else
//			newValues.put(COLUMN_FB_PROFILE, fb_profile);
//
//		if (template_id != null)
//			newValues.put(COLUMN_TEMPLATE_ID, template_id);
//		else
//			newValues.put(COLUMN_TEMPLATE_ID, "0");
//
//		// Insert it into the database.
//		return db.update(DATABASE_TABLE, newValues, where, null) != 0;
//	}
//	*/
//
//
//    /////////////////////////////////////////////////////////////////////
//    //	Private Helper Classes:
//    /////////////////////////////////////////////////////////////////////
//
//    /**
//     * Private class which handles database creation and upgrading.
//     * Used to handle low-level database access.
//     */
//	/*private static class DatabaseHelper extends SQLiteOpenHelper
//	{
//		DatabaseHelper(Context context) {
//			super(context, DATABASE_NAME, null, DATABASE_VERSION);
//		}
//
//		@Override
//		public void onCreate(SQLiteDatabase _db)
//        {
//			_db.execSQL(DATABASE_CREATE_SQL);
//		}
//
//		@Override
//		public void onUpgrade(SQLiteDatabase _db, int oldVersion, int newVersion) {
//			//Log.w(TAG, "Upgrading application's database from version " + oldVersion
//					//+ " to " + newVersion + ", which will destroy all old data!");
//
//			// Destroy old database:
//			_db.execSQL("DROP TABLE IF EXISTS " + DATABASE_TABLE);
//
//			// Recreate new database:
//			onCreate(_db);
//		}
//	}*/
//}
