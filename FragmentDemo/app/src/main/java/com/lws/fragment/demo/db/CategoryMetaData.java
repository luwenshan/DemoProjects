package com.lws.fragment.demo.db;

import android.database.Cursor;

/**
 * Created by lws on 2017/12/25.
 */

public final class CategoryMetaData {
    public int id;
    public String name;

    public CategoryMetaData(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static CategoryMetaData load(Cursor cursor) {
        int id = cursor.getInt(cursor.getColumnIndex(DBContract.Category.COLUM_NAME_ID));
        String name = cursor.getString(cursor.getColumnIndex(DBContract.Category.COLUM_NAME_NAME));
        return new CategoryMetaData(id, name);
    }

    @Override
    public String toString() {
        return "[" + id + "," + "name" + "]";
//        return String.format("[%d,%s]", id, name);
    }
}
