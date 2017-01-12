package com.minci.databasetest;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.annotation.Unique;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by Minci on 1/9/2017.
 */
@Table(database = AppDatabase.class)
public class Users extends BaseModel {

    @PrimaryKey(autoincrement = true)
    int id;

    @Column
    String name;

    @Column
    String email;

    @Column
    @Unique
    String username;

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
