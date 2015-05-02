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


public class Toeic extends ActionBarActivity implements View.OnClickListener {

    Button button1;
    Button button2;
    Button button3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toeic);

        button1 = (Button) findViewById (R.id.button1);
        button1.setOnClickListener(this);
        button2= (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3= (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

    }

    public void onClick(View v){
        int id = v.getId();
        if (id == R.id.button1) {
            Intent intent = new Intent(this, choix.class);
            startActivity(intent);
        }
        else if (id == R.id.button2) {
            Intent intent = new Intent(this, session_rapide.class);
            startActivity(intent);
        }
        else if (id == R.id.button3) {
            Intent intent = new Intent(this, session_rapide.class);
            startActivity(intent);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_toeic, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.session_rapide) {
            Intent intent = new Intent(this, session_rapide.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
