package com.example.leranskills;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.Toast;

import com.example.leranskills.ui.gallery.GalleryFragment;
import com.example.leranskills.ui.home.HomeFragment;
import com.example.leranskills.ui.slideshow.SlideshowFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    MenuItem menuItem;
    DrawerLayout dLayout;

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dLayout.openDrawer(Gravity.LEFT);
            }
        });
        setNavigationDrawer();
    }
    private void setNavigationDrawer(){
        dLayout=(DrawerLayout)findViewById(R.id.drawer_layout);
        NavigationView navView=(NavigationView)findViewById(R.id.navigation);


        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuitem) {
                Fragment frag=null;

                int itemld=menuItem.getItemId();
                if(itemld==R.id.courses){
                    frag=new CourseFragment();
                }else if(itemld==R.id.startpreparing){
                    frag=new GalleryFragment();
                }else if(itemld==R.id.olympaid) {
                    frag = new SlideshowFragment();
                } else if (itemld==R.id.nav_credits){
                    frag=new HomeFragment();
                }
                Toast.makeText(getApplicationContext(),menuItem.getTitle(),Toast.LENGTH_SHORT).show();
                if(frag!=null){
                    FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.fragment_container_view_tag,frag);
                    transaction.commit();
                    dLayout.closeDrawers();
                    return true;
                }
                return  false;
            }
        });
    }
}



