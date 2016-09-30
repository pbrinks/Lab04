package com.example.plb7.lab04;
/** Paige Brinks, plb7
 * Lab 04
 *
 * Build an application with two activities
 * Main Activity
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * gotoAbout(), takes user to about activity
     */
    public void gotoAbout() {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

    /** onCreateOptionsMenu(Menu menu)
     * Create menu
     * @param menu, triple dot menu
     * @return true
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    /** onOptionsItemSelected(MenuItem item)
     * when user selects about option in menu, take them to the about Activity
     * @param item, the menu option selected, here the only option is about
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // when user selects about, go to about page
        switch (item.getItemId()) {
            case R.id.about:
                gotoAbout();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
