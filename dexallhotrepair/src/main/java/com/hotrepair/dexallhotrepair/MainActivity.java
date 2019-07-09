package com.hotrepair.dexallhotrepair;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.hotrepair.dexallhotrepair.test.DexChange;

public class MainActivity extends AppCompatActivity {

    Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext=this;
        Button button=(Button)this.findViewById(R.id.startActivity);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startOtherActivity();
            }
        });

        Button button2=(Button)this.findViewById(R.id.xiufu);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DexChange mDexChange=new DexChange();

                String string=mDexChange.inject("/mnt/sdcard/user.dex",mContext);
                Log.v("anzi",string);
            }
        });

    }

    public void startOtherActivity(){

        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED | Intent.FLAG_ACTIVITY_CLEAR_TOP) ;
        intent.setClass(mContext, MainActivity2.class);
//        intent.addCategory(Intent.CATEGORY_LAUNCHER);
//        ComponentName cn = new ComponentName("launcher.vez.so.set", "com.base.commonmodule.t16.AppListActivity");
//        intent.setComponent(cn);
        startActivity(intent);
        this.finish();
    }
}
