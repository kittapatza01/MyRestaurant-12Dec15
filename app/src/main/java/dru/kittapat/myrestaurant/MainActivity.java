package dru.kittapat.myrestaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private ManageTABLE objManageTABLE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Connected Database
        objManageTABLE = new ManageTABLE(this);

        //Tester Add Value
        testerAddValue();

    }//Main Method

    private void testerAddValue() {

        objManageTABLE.addValueTOUser("user","pass", "กฤตณ์พัทธ์");
        objManageTABLE.addValueToFood("food","source","price");
    }
} //Main Class
