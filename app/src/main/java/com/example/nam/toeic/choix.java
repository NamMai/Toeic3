package com.example.nam.toeic;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class choix extends ActionBarActivity implements View.OnClickListener{

    Button button4;
    Button button5;
    Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix);
        button4 = (Button) findViewById (R.id.button4);
        button4.setOnClickListener(this);
        button5= (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);
        button6= (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);
    }

    public void onClick(View v){
        int id = v.getId();
        if (id == R.id.button4) {
            Intent intent = new Intent(this, session_rapide.class);
            startActivity(intent);
        }
        else if (id == R.id.button5) {
            Intent intent = new Intent(this, session_rapide.class);
            startActivity(intent);
        }
        else if (id == R.id.button6) {
            Intent intent = new Intent(this, session_rapide.class);
            startActivity(intent);
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_choix, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
