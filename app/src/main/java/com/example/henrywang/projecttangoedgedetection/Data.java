package com.example.henrywang.projecttangoedgedetection;

import android.provider.BaseColumns;

/**
 * Created by henrywang on 9/22/15.
 */
public class Data {
    public Data(){

    }

    public static abstract class DataEntry implements BaseColumns{
        public static final String TABLE_NAME = "db";
        public static final String COLUMN_NAME_ID = "dataID";
        public static final String COLUMN_TITLE = "title";
    }
}
