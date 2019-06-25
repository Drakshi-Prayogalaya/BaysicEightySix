package com.grape.basic8086;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.navigation.NavigationView;
import com.grape.basic8086.fragment.HomeFragment;
import com.grape.basic8086.fragment.ProgramsListFragment;
import com.grape.basic8086.fragment.AboutUsFragment;

import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Fragment fragment = new HomeFragment();
        setFragment(fragment);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ////Adbuddiz.setPublisherKey(AdKey.//AdbuddizKey);
        ////Adbuddiz.cacheAds(this);
        // FragmentManager fmm = this.getSupportFragmentManager().getFragments();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START))
        {
            drawer.closeDrawer(GravityCompat.START);
        }
        if (this.getSupportFragmentManager().getBackStackEntryCount() > 0)
        {
            Log.i("Stack greater than 0", "Stack > 0");
            this.getSupportFragmentManager().popBackStack();
        }
        else
        {
            //Fragment ff = new HomeFragment();
            //setFragment(ff);

            Log.d("Tag", "###########################");
            FragmentManager fragmentManager = this.getSupportFragmentManager();
            List<Fragment> fragments = fragmentManager.getFragments();
            if (fragments != null)
            {
                for (Fragment frag : fragments)
                {
                    if (frag != null)
                    {
                        Log.d("tag1", "FragmentManager.getFragments: " + frag.getTag() + ": " + frag.getClass().getSimpleName());
                        if(frag.getClass().getSimpleName().equals("AboutUsFragment") ||
                                frag.getClass().getSimpleName().equals("ProgramsListFragment"))
                        {
                            Fragment homeFragment = new HomeFragment();
                            setFragment(homeFragment);

                            Random rand = new Random();

                            // Generate random integers in range 0 to 999
                            int rand_int1 = rand.nextInt(1000);
                            if(rand_int1 % 10 != 0)
                            {
                                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                                builder.setMessage("Your rating and review means a lot to us. It motivates us to develop more apps. Please give us 5 stars.")
                                        .setTitle("Please rate the App")
                                        .setPositiveButton("Rate Now", new DialogInterface.OnClickListener()
                                        {
                                            @Override
                                            public void onClick(DialogInterface dialogInterface, int i)
                                            {
                                                Intent intent = new Intent(Intent.ACTION_VIEW);
                                                intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.grape.basic8086"));
                                                startActivity(intent);
                                                //dialogInterface.cancel();
                                            }
                                        })
                                        .setNegativeButton("Later", new DialogInterface.OnClickListener()
                                        {
                                            @Override
                                            public void onClick(DialogInterface dialogInterface, int i)
                                            {
                                                dialogInterface.cancel();
                                            }
                                        });
                                AlertDialog dialog = builder.create();
                                dialog.show();
                            }
                        }
                        else
                        {
                            super.onBackPressed();
                        }
                    }
                    else
                    {
                        Log.d("tag2", "FragmentManager.getFragments: null");
                    }
                }
            }
            else
            {
                Log.d("Tag 3", "No fragments");
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item)
    {
        //Adbuddiz.cacheAds(this);
        // Handle navigation view item clicks here.
        Fragment fragment = null;
        String title = "";

        int id = item.getItemId();

        if (id == R.id.menu_main_home)
        {
            closeDrawerLayout();
            setTimeDelay(200);
            fragment = new HomeFragment();
            title = "Home";
        }
        else if (id == R.id.menu_programs_list)
        {
            closeDrawerLayout();
            setTimeDelay(200);
            fragment = new ProgramsListFragment();
            title = "Programs";
        }
        else if(id == R.id.menu_instructions)
        {
            closeDrawerLayout();
            setTimeDelay(200);
            Intent i = new Intent(MainActivity.this,InstructionsList.class);
            startActivity(i);
        }
        else if(id == R.id.menu_pinout)
        {
            closeDrawerLayout();
            setTimeDelay(200);
            Intent i = new Intent(MainActivity.this,PinListActivity.class);
            startActivity(i);
            ////Adbuddiz.showAd(this);
        }
        else if (id == R.id.menu_about_us)
        {
            closeDrawerLayout();
            setTimeDelay(200);
            fragment = new AboutUsFragment();
            title = "About Us";
        }
        else if (id == R.id.menu_share)
        {
            closeDrawerLayout();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, "Hello friends!!! Check out this application in play store. \"Basic 8086\" - https://play.google.com/store/apps/details?id=com.grape.basic8086");
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        else if (id == R.id.menu_facebook)
        {
            closeDrawerLayout();
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.facebook.com/GrapeEmbeddedSolutions"));
            startActivity(intent);
        }
        else if (id == R.id.menu_more_apps)
        {
            closeDrawerLayout();
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://play.google.com/store/apps/developer?id=Grape+Labs"));
            startActivity(intent);
        }
        else if (id == R.id.menu_rate_the_app)
        {
            closeDrawerLayout();
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.grape.basic8086"));
            startActivity(intent);
        }
        else if (id == R.id.menu_visit_our_site)
        {
            closeDrawerLayout();
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://www.grape-labs.com"));
            startActivity(intent);
        }
        else if(id == R.id.menu_twitter)
        {
            closeDrawerLayout();
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://twitter.com/Grape_Labs"));
            startActivity(intent);
        }

        if (fragment != null)
        {
            setFragment(fragment);

            // set the toolbar title
            //getSupportActionBar().setTitle(title);
        }

        return true;
    }

    public void setFragment(Fragment fragment)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_content, fragment);
        fragmentTransaction.commit();
    }

    public void setTimeDelay(int milliseconds)
    {
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

            }
        }, milliseconds);
    }

    public void closeDrawerLayout()
    {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }
}
