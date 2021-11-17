package com.example.lotus_spa.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.lotus_spa.R;
import com.example.lotus_spa.Utilits.ActionDB.ActionCustomer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == R.id.action_settings){
            if(DeleteLogin())
            {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                overridePendingTransition( R.anim.slide_in_left,R.anim.slide_out_right);
                finish();
            }
        }
        if(id == R.id.our_products_menu){
            Intent intent = new Intent(MainActivity.this, PurshaseActivity.class);
            startActivity(intent);
            overridePendingTransition( R.anim.slide_in_right,R.anim.slide_out_left);
        }
        return super.onOptionsItemSelected(item);
    }

    public Boolean DeleteLogin(){
        ActionCustomer deletar = new ActionCustomer(this);
        if(deletar.DeleteLogin())
            return true;
        else
            return false;
    }
}