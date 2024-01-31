package com.example.spatsapp.loginSession

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

private val dbName = "Accounts";
private val dbVersion = 1;
private val tableName = "localAccounts"
private val columnID = "accountID"
private val columnName = "sessionAccounts"
private val columnLoginStatus = "loginStatus"

class dbAccounts(var context: Context) : SQLiteOpenHelper(context, dbName, null, dbVersion){
    override fun onCreate(p0: SQLiteDatabase?) {
        val createTable = "CREATE TABLE " + tableName + " (" +
                columnID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                columnName + " VARCHAR(26))," +
                columnLoginStatus + " INTEGER)"

        p0?.execSQL(createTable);
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")

    }

    fun insertData(userAccount: userAccount){
        val db = this.writableDatabase
        var cv = ContentValues()
        cv.put(columnName, userAccount.username)
        var output = db.insert(dbName, null, cv)
        if(output == -1.toLong()){
            Toast.makeText( context, "Error creating table", Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText( context, "Login Successful", Toast.LENGTH_SHORT).show()
        }

    }

}
