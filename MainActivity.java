package com.example.innu.menues;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       /* menu.add("Home");
        menu.add("settings");
        menu.add("profile");
*/

        //Defining Option Menus Programmatically
        //menu.add("Home");
        //menu.add("Clients");
        //menu.add("About");
        //menu.add("Settings");


        //Inflating Menu file using MenuInflater
        getMenuInflater().inflate(R.menu.mainmenu,menu);

        return true;


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getTitle().toString())
        {
            case "Item1":
                Toast.makeText(MainActivity.this,"item1",Toast.LENGTH_LONG).show();

            case "Item2":
                Toast.makeText(MainActivity.this,"item2",Toast.LENGTH_LONG).show();
            case "Item3":
                Toast.makeText(MainActivity.this,"item3",Toast.LENGTH_LONG).show();
            case "Item4":
                Toast.makeText(MainActivity.this,"item4",Toast.LENGTH_LONG).show();
        }

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
}
