package android.foodme.ncr.project.main;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.foodme.ncr.project.R;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class OrderActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setInitialFragment();
    }

    private void setInitialFragment() {
        FragmentTransaction fragmenttransaction = getFragmentManager().beginTransaction();
        Fragment startFragment = FragmentFactory.GetFragment(FragmentNavigator.Site, null);
        fragmenttransaction.add(startFragment, FragmentNavigator.Site.toString());
        fragmenttransaction.replace(R.id.order_set_initial_fragment_container, startFragment);
        fragmenttransaction.addToBackStack(FragmentNavigator.Site.toString());
        fragmenttransaction.commit();
    }

    public void transfer(FragmentNavigator nextPage) {
        FragmentTransaction fragmenttransaction = getFragmentManager().beginTransaction();
        Fragment nextFragment = FragmentFactory.GetFragment(nextPage, null);
        fragmenttransaction.replace(R.id.order_set_initial_fragment_container, nextFragment);
        fragmenttransaction.addToBackStack(nextPage.toString());
        fragmenttransaction.commit();
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
}
