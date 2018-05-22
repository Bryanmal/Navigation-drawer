package com.example.deloitte.navigationdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String title=item.getTitle().toString();
        if (title.equalsIgnoreCase("share"))
        {
            Toast.makeText(this, "sharing clicked", Toast.LENGTH_SHORT).show();
        }
        else if (title.equalsIgnoreCase("Location"))
        {
            Toast.makeText(this, "location clicked", Toast.LENGTH_SHORT).show();
        }
        else if (title.equalsIgnoreCase("email"))
        {
            Toast.makeText(this, "email clicked", Toast.LENGTH_SHORT).show();
        }
        else if (title.equalsIgnoreCase("phone"))
        {
            Toast.makeText(this, "phone clicked", Toast.LENGTH_SHORT).show();
        }





        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        String title= item.getTitle().toString();
        if (title.equalsIgnoreCase("Computers"))
        {
            Intent x=new Intent(this,ComputersActivity.class);
            startActivity(x);
        }
        else if (title.equalsIgnoreCase("Accesories"))
        {
            Intent x=new Intent(this,AccesoriesActivity.class);
            startActivity(x);
        }
        else if (title.equalsIgnoreCase("programs"))
        {
            Intent x=new Intent(this,ProgramsActivity.class);
            startActivity(x);
        }
        else if (title.equalsIgnoreCase("systems"))
        {
            Intent x=new Intent(this,SystemsActivity.class);
            startActivity(x);
        }




        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
