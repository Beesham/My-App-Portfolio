package com.beesham.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class PorfolioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_porfolio);
    }

    public void onButtonClicked(View view){
        switch(view.getId()){
            case R.id.popular_movies:
                Toast.makeText(this, getString(R.string.toast_message, getString(R.string.popular_movies)), Toast.LENGTH_SHORT).show();
                break;

            case R.id.stock_hawk:
                Toast.makeText(this, getString(R.string.toast_message, getString(R.string.stock_hawk)), Toast.LENGTH_SHORT).show();
                break;

            case R.id.build_it_bigger:
                Toast.makeText(this, getString(R.string.toast_message, getString(R.string.build_it_bigger)), Toast.LENGTH_SHORT).show();
                break;

            case R.id.make_your_app_material:
                Toast.makeText(this, getString(R.string.toast_message, getString(R.string.make_your_app_material)), Toast.LENGTH_SHORT).show();
                break;

            case R.id.go_ubiquitious:
                Toast.makeText(this, getString(R.string.toast_message, getString(R.string.go_ubiquitious)), Toast.LENGTH_SHORT).show();
                break;

            case R.id.capstone:
                Toast.makeText(this, getString(R.string.toast_message, getString(R.string.capstone)), Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
