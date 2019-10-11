package com.sahil.wasteapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;

import java.util.Objects;


public class HomeActivity extends AppCompatActivity {

    SpaceNavigationView navigationView;
    Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        navigationView=findViewById(R.id.space);

        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);


        navigationView.initWithSaveInstanceState(savedInstanceState);
        navigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_home_black_24dp));
        navigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_share_black_24dp));
        navigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_favorite_black_24dp));
        navigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_add_black_24dp));


        navigationView.setSpaceOnClickListener(new SpaceOnClickListener() {
            @Override
            public void onCentreButtonClick() {
                Toast.makeText(HomeActivity.this,"onCentreButtonClick", Toast.LENGTH_SHORT).show();
                navigationView.setCentreButtonSelectable(true);

            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {
                //Toast.makeText(MainActivity.this, itemIndex + " " + itemName, Toast.LENGTH_SHORT).show();
                if(itemIndex==0)
                {
                    Toast.makeText(HomeActivity.this,  "Home", Toast.LENGTH_SHORT).show();
                    HomeFragment fragment1=new HomeFragment();
                    FragmentTransaction ft1=getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.container,fragment1,"");
                    ft1.commit();

                }
                else if(itemIndex==1)
                {
                    Toast.makeText(HomeActivity.this,  "Share", Toast.LENGTH_SHORT).show();
                }
                else if(itemIndex==2)
                {
                    Toast.makeText(HomeActivity.this,  "Favorite", Toast.LENGTH_SHORT).show();
                }
                else if(itemIndex==3)
                {
                    Toast.makeText(HomeActivity.this,  "Add", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(HomeActivity.this,AddPostActivity.class));
                    finish();

                }
            }

            @Override
            public void onItemReselected(int itemIndex, String itemName) {
               // Toast.makeText(MainActivity.this, itemIndex + " " + itemName, Toast.LENGTH_SHORT).show();
                if(itemIndex==0)
                {
                    Toast.makeText(HomeActivity.this,  "Home", Toast.LENGTH_SHORT).show();
                }
                else if(itemIndex==1)
                {
                    Toast.makeText(HomeActivity.this,  "Share", Toast.LENGTH_SHORT).show();
                }
                else if(itemIndex==2)
                {
                    Toast.makeText(HomeActivity.this,  "Favorite", Toast.LENGTH_SHORT).show();
                }
                else if(itemIndex==3)
                {
                    Toast.makeText(HomeActivity.this,  "Add", Toast.LENGTH_SHORT).show();
                }
            }


        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id=item.getItemId();
        switch(id){
            case R.id.settings_id:
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
                break;
            case R.id.users_id:
                Toast.makeText(this, "Users", Toast.LENGTH_SHORT).show();
                break;
            case R.id.aboutus_id:
                Toast.makeText(this, "About Us", Toast.LENGTH_SHORT).show();
                break;
            case R.id.user_id:
                startActivity(new Intent(HomeActivity.this, ProfileActivity.class));
                finish();
                break;
            case R.id.logout_id:
                FirebaseAuth.getInstance().signOut();
                finish();
                startActivity(new Intent(HomeActivity.this, MainActivity.class));
                break;
            case android.R.id.home:
                finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }


}
