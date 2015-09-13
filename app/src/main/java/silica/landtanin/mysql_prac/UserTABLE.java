package silica.landtanin.mysql_prac;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by landtanin on 9/13/15 AD.
 */
public class UserTABLE {

    // Explicit
    private MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public UserTABLE(Context context) {

        objMyOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = objMyOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMyOpenHelper.getReadableDatabase();

    } // Constructor
} // Main Class
