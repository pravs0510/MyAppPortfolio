package com.example.praveena.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spofityStreamer();
        scoresApp();
        libraryApp();
        buildItBigger();
        xyzReader();
        capstone();/**/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
    private void spofityStreamer(){
        Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener( new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will launch Spotify streamer", Toast.LENGTH_LONG).show();
            }
        });

    }
    private void scoresApp(){
        Button btn1 = (Button) findViewById(R.id.button2);
        btn1.setOnClickListener( new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will launch Scores App", Toast.LENGTH_LONG).show();
            }
        });

    }private void libraryApp(){
        Button btn1 = (Button) findViewById(R.id.button3);
        btn1.setOnClickListener( new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will launch Library App", Toast.LENGTH_LONG).show();
            }
        });

    }private void buildItBigger(){
        Button btn1 = (Button) findViewById(R.id.button4);
        btn1.setOnClickListener( new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will launch build It Bigger App", Toast.LENGTH_LONG).show();
            }
        });

    }private void xyzReader(){
        Button btn1 = (Button) findViewById(R.id.button5);
        btn1.setOnClickListener( new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will launch XYZ Reader App", Toast.LENGTH_LONG).show();
            }
        });

    }private void capstone(){
        Button btn1 = (Button) findViewById(R.id.button6);
        btn1.setOnClickListener( new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will launch Capstone:My Own App", Toast.LENGTH_LONG).show();
            }
        });

    }
}
