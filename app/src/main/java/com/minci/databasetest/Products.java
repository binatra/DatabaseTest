package com.minci.databasetest;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by Minci on 1/9/2017.
 */

@Table(database = AppDatabase.class)
public class Products extends BaseModel {

    @PrimaryKey(autoincrement = true)
    int product_id;

    @Column
    String name;

    @Column
    double price;


    @Override
    public String toString() {
        return "Products{" +
                "product_id=" + product_id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
