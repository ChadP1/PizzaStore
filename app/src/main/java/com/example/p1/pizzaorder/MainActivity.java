package com.example.p1.pizzaorder;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "The address to deliver to os:  ";
    protected RadioButton oneRad;
    protected RadioButton twoRad;
    protected RadioButton threeRad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        oneRad = (RadioButton)findViewById(R.id.one);
        twoRad = (RadioButton)findViewById(R.id.two);
        threeRad = (RadioButton)findViewById(R.id.three);
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

    public void buttonPress(View v){

        String address = "None";

        if (oneRad.isChecked()){
            address = "55624 Hogwarts Room 802";
        }

        if(twoRad.isChecked()){
            address = "Death Star, Throne Room";
        }
        if(threeRad.isChecked()){
            address = "Gondor, Stewards Office";
        }

        //total.setText(Double.toString(sum));


        intent.putExtra(EXTRA_MESSAGE, sum);
        startActivity(intent);

    }

}
