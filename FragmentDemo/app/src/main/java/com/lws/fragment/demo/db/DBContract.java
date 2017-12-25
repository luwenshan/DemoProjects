package com.lws.fragment.demo.db;

import android.net.Uri;
import android.provider.BaseColumns;

import com.lws.fragment.demo.config.GlobalContext;

/**
 * Created by lws on 2017/12/25.
 */

public final class DBContract {
    public static final String DB_NAME = "test.db";
    public static final String BASE_CONTENT_URI = "content://" + GlobalContext.getContext().getPackageName() + ".provider.DBProvider/";

    public static class Category implements BaseColumns {
        public static final String TABLE_NAME = "category";
        public static final String COLUM_NAME_ID = "id";
        public static final String COLUM_NAME_NAME = "name";
        public static final Uri CONTENT_URI = Uri.parse(BASE_CONTENT_URI + TABLE_NAME);
        public static final String ITEM_TYPE = "vnd.android.cursor.dir/vnd.com.lws.fragment.demo.category";
    }

    public static class Material implements BaseColumns {
        public static final String TABLE_NAME = "material";
        public static final String COLUM_NAME_CID = "cid";
        public static final String COLUM_NAME_NAME = "name";
        public static final String COLUM_NAME_DOWNLOADED = "downloaded";
        public static final Uri CONTENT_URI = Uri.parse(BASE_CONTENT_URI + TABLE_NAME);
        public static final Uri CONTENT_URI_DOWNLOADED = Uri.parse(BASE_CONTENT_URI + TABLE_NAME + "/downloaded");
        public static final String ITEM_TYPE = "vnd.android.cursor.dir/vnd.com.lws.fragment.demo.material";
    }
}
