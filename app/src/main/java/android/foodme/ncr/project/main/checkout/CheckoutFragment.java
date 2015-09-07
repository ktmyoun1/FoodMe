package android.foodme.ncr.project.main.checkout;

import android.app.Fragment;
import android.foodme.ncr.project.R;
import android.foodme.ncr.project.main.FragmentNavigator;
import android.foodme.ncr.project.main.OrderActivity;
import android.foodme.ncr.project.main.site.adapter.SiteAdaptor;
import android.foodme.ncr.project.main.site.data.Site;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by kitaemyoung on 7/24/15.
 */
public class CheckoutFragment extends Fragment {

    public CheckoutFragment() {
    }

    public static CheckoutFragment newInstance() {
        return new CheckoutFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_checkout, container, false);

        //need to show cart items

        return rootView;
    }
}
