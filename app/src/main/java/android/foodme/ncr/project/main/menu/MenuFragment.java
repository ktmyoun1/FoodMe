package android.foodme.ncr.project.main.menu;

import android.app.Fragment;
import android.foodme.ncr.project.R;
import android.foodme.ncr.project.main.menu.adapter.MenuAdapter;
import android.foodme.ncr.project.main.menu.data.MenuItem;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by kitaemyoung on 7/10/15.
 */
public class MenuFragment extends Fragment {

    public MenuFragment() {
    }

    public static MenuFragment newInstance()
    {
        return new MenuFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_menu, container, false);

        ArrayList<MenuItem> menuItems = GetMenuItems();
        ListView menuListView = (ListView)rootView.findViewById(R.id.menu_listView_container);
        menuListView.setAdapter(new MenuAdapter(getActivity(), menuItems));

        return rootView;
    }

    private ArrayList<MenuItem> GetMenuItems() {

        ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();

        MenuItem menuItem = new MenuItem();
        menuItem.setId(0);
        menuItem.setName("Burger");
        menuItems.add(menuItem);

        menuItem = new MenuItem();
        menuItem.setId(1);
        menuItem.setName("Burrito");
        menuItems.add(menuItem);

        menuItem = new MenuItem();
        menuItem.setId(2);
        menuItem.setName("Sandwich");
        menuItems.add(menuItem);

        return menuItems;
    }


}
