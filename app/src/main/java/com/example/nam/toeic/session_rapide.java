package com.example.nam.toeic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.SystemClock;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class session_rapide extends ActionBarActivity implements AdapterView.OnItemClickListener {

    ListView myList;
    List<String> valuesList;
    ArrayAdapter<String> adapter;
    TextView textView1;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session_rapide);

        Button button = (Button) findViewById(R.id.button8);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(session_rapide.this, session_rapide2.class);
                startActivity(intent);
            }
        });

        valuesList= new ArrayList<String>();
        valuesList.add("(A) would decrease");
        valuesList.add("(B) decreased");
        valuesList.add("(C) is decreasing");
        valuesList.add("(D) was decreasing");

        System.out.println("");

        Log.v("Tag_1", "valuesList = " + valuesList.toString());


        ListView myList = (ListView) findViewById(R.id.list2);
        myList.setBackgroundColor( -7829368);
        adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                valuesList
        );
        myList.setAdapter(adapter);
        myList.setOnItemClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_session_rapide, menu);
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

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


        if (position == 0) {
            Toast toast = Toast.makeText(this, "Bravo : (A) would decrease", Toast.LENGTH_SHORT);
            TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
            v.setTextColor(-16711936);
            toast.show();



        }
        else if (position ==1)
        {
            Toast toast = Toast.makeText(this, "Faux! Réponse correcte : (A) would decrease", Toast.LENGTH_SHORT);
            TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
            v.setTextColor(-16711681);
            toast.show();


        }
        else if (position == 2)
        {
            Toast toast = Toast.makeText(this, "Faux! Réponse correcte : (A) would decrease", Toast.LENGTH_SHORT);
            TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
            v.setTextColor(-16711681);
            toast.show();



        }
        else if (position == 3)
        {
            Toast toast = Toast.makeText(this, "Faux! Réponse correcte : (A) would decrease", Toast.LENGTH_SHORT);
            TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
            v.setTextColor(-16711681);
            toast.show();

        }

        Intent intent = new Intent(this, session_rapide.class);
        startActivity(intent);

    }
}
