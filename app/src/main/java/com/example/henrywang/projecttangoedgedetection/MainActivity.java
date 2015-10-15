package com.example.henrywang.projecttangoedgedetection;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.atap.tangoservice.Tango;


public class MainActivity extends ActionBarActivity {
    //Tango mTango;
    private Button bStart;
    private Button bHelp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        //mTango = new Tango(this);
        bStart = (Button) findViewById(R.id.buttonStart);
        bHelp = (Button) findViewById(R.id.buttonHelp);
        bStart.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){

                    }
                }
        );

        bHelp.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){

                    }
                }
        );

    }
    /*Opens Help Menu*/
    public void openHelp(View view){
        //TODO:
        Intent intent = new Intent(this, HelpActivity.class);
    }
    public void makeFullScreen(){

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//       // getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
