package ir.farsroidx.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ir.farsroidx.SPUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SPUtils utils = SPUtils.getInstance(this);

        // Write To Preference
        utils.writeString  ("key" , "text");
        utils.writeBoolean ("key" , true);
        utils.writeFloat   ("key" , 1.85F);
        utils.writeInteger ("key" , 85);
        utils.writeLong    ("key" , 85L);

        // Read From Preference
        String   s  = utils.readString  ("key" , "alternative" );
        boolean b  = utils.readBoolean ("key" , false);
        float   f  = utils.readFloat   ("key" , 1.02F);
        int     i  = utils.readInteger ("key" , 0);
        long    l  = utils.readLong    ("key" , 85L);
    }
}
