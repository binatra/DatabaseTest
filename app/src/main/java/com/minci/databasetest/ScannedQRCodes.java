package com.minci.databasetest;

import com.raizlabs.android.dbflow.annotation.ForeignKey;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.annotation.Unique;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by Minci on 1/9/2017.
 */
@Table(database = AppDatabase.class)
public class ScannedQRCodes extends BaseModel {

    @PrimaryKey(autoincrement = true)
    int id;

    @ForeignKey
    Users users;

    @ForeignKey
    Products products;

    @Unique
    String uid;

    @Override
    public String toString() {
        return "ScannedQRCodes{" +
                "id=" + id +
                ", users=" + users +
                ", products=" + products +
                '}';
    }
}
