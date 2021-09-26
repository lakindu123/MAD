package com.example.add_hospitals;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.lakindu.Doctor;


public class DBHandler extends SQLiteOpenHelper {
    public static final String DB_NAME ="User.db";
    public static final int DB_VERSION =1;
    public DBHandler(Context context){
        super(context,DB_NAME, factory null , DB_VERSION);
    }

}
    @Override
    public void onCreate(SQLiteDatabase db) {
        String Doctor_TABLE = "CREATE TABLE"+ User.Userdetails.TABLE_NAME+" { "+
                Doctor.Doctortails.COL_NAME+" String PRIMARY KEY,"+
                " User.Doctordetails.COL_Address+" String" )"
        User.Userdetails.COL_NUMBER+" INTEGER" )"
        super(context, name, factory, version);
        db.execSQL(USER_TABLE);

    }

    public boolean addOrder(String Name,int Contact_Number,String Address){
        SQLiteDatabase db= getWritableDatabase();
        ContentValues values= new ContentValues();

        values.put(Doctor.Doctordetails.COL_NAME,Name);
        values.put(Doctor.Doctordetails.COL_NUMBER,Contact_Number);
        values.put(Doctor.Doctordetails.COL_Specialization,Speialization;
        long id= db.insert(Doctor.Doctordetails.TABLE_NAME, null,values);
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public boolean deleteOrder(Doctor.Doctordetails){

        SQLiteDatabase db= this.getWritableDatabase();
        String queryString ="DELETE From" +  Doctor_TABLE + "WHERE"+ COL_Address+ " "+User{
            Cursor Cursor =db.rawQuery(queryString, selection args:null);

            if (cursor.moveTOFirst()) {
                return true;
            }
            else {
                return false;
            }

        }
    }
