package com.hotrepair.dexallhotrepair;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.hotrepair.dexallhotrepair.test.StudentClass;

public class MainActivity2 extends AppCompatActivity {

    Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mContext=this;
        Button button=(Button)this.findViewById(R.id.startActivity2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                startOtherActivity();
            }
        });
        StudentClass mStud=new StudentClass();
        mStud.setName("小美");
        Log.v("anzi","  "+mStud.getName());
    }

//    public void startOtherActivity(){
//
//        Intent intent = new Intent(Intent.ACTION_MAIN);
//        intent.addCategory(Intent.CATEGORY_LAUNCHER);
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED | Intent.FLAG_ACTIVITY_CLEAR_TOP) ;
//        ComponentName cn = new ComponentName("launcher.vez.so.set", "com.base.commonmodule.t16.AppListActivity");
//        intent.setComponent(cn);
//        startActivity(intent);
//    }
}
