package com.example.add_hospitals;

import android.provider.BaseColumns;

public class Doctor {
    Private Doctor() {

    }

    public static final class Doctordetails implements BaseColumns {
        public static final String TABLE_NAME = "Doctor";
        public static final String COL_NAME = "Name";
        public static final String COL_NUMBER = "Contact Number";
        public static final String COL_Specialization = "Specialization";
    }
}
}