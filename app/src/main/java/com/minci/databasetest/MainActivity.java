package com.minci.databasetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.raizlabs.android.dbflow.sql.language.Select;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.productName)
    EditText productName;

    @BindView(R.id.productPrice)
    EditText productPrice;

    @BindView(R.id.user1)
    TextView userOne;

    @BindView(R.id.user2)
    TextView userTwo;

    @BindView(R.id.qrscan)
    EditText qrScan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.save)
    public void onClickSave(View view){
        Products products = new Products();
        Users users = new Users();
        Users users1 = new Users();
        if(!isUserCreated()){

            users.name = "Hilmi Kari";
            users.email = "hilmi@kari.com";
            users.username = "HK";
            users.save();
        }
        if(!isMoreUserCreated()){
            users1.name = "Hamdi Pidhi";
            users1.email = "hamdi@pidhi.net";
            users1.username = "HaPi";
            users1.save();
        }

        products.name = productName.getText().toString();
        products.price = Double.parseDouble(productPrice.getText().toString());
        userOne.setText(users.toString());
        userTwo.setText(users1.toString());
        products.save();

    }

    public boolean isUserCreated(){
        if(new Select().from(Users.class).count() == 0){
            return false;
        }else return true;
    }

    public boolean isMoreUserCreated(){
        if(new Select().from(Users.class).count() <= 1){
            return false;
        }else return true;
    }


}
