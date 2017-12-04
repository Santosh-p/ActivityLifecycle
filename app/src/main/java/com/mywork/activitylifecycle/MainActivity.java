package com.mywork.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView tvState;
    Button btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvState=(TextView)findViewById(R.id.text_state);
        btnNext=(Button)findViewById(R.id.btn_next_view);
        Log.i("ActivityLifecycle State","onCreate()");
        tvState.setText("onCreate()");
        Toast.makeText(getApplicationContext(),"onCreate()",Toast.LENGTH_SHORT).show();

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(intent);
            }
        });
    }


    @Override
    protected void onStart() {
        Log.i("ActivityLifecycle State","onStart()");
        tvState.setText("onStart()");
        Toast.makeText(getApplicationContext(),"onStart()",Toast.LENGTH_SHORT).show();
        super.onStart();
    }
    @Override
    protected void onPause() {
        Log.i("ActivityLifecycle State","onPause()");
        tvState.setText("onPause()");
        Toast.makeText(getApplicationContext(),"onPause()",Toast.LENGTH_SHORT).show();

        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.i("ActivityLifecycle State","onResume()");
        tvState.setText("onResume()");
        Toast.makeText(getApplicationContext(),"onResume()",Toast.LENGTH_SHORT).show();

        super.onResume();
    }

    @Override
    protected void onStop() {
        Log.i("ActivityLifecycle State","onStop()");
        tvState.setText("onStop()");
        Toast.makeText(getApplicationContext(),"onStop()",Toast.LENGTH_SHORT).show();

        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i("ActivityLifecycle State","onDestroy()");
        tvState.setText("onDestroy()");
        Toast.makeText(getApplicationContext(),"onDestroy()",Toast.LENGTH_SHORT).show();

        super.onDestroy();
    }


}
