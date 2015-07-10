package android.foodme.ncr.project.ui;

import android.app.Fragment;
import android.foodme.ncr.project.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by kitaemyoung on 7/10/15.
 */
public class OrderMenuFragment extends Fragment {

    public OrderMenuFragment() {
    }

    public static OrderMenuFragment newInstance()
    {
        OrderMenuFragment orderMenuFragment = new OrderMenuFragment();
        Bundle bundle = new Bundle();
        orderMenuFragment.setArguments(bundle);
        return orderMenuFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        return inflater.inflate(R.layout.fragment_main, container, false);
    }


}
