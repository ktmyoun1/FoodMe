package android.foodme.ncr.project.main.cart;

import android.foodme.ncr.project.main.menu.data.MenuItem;

import java.util.ArrayList;

/**
 * Created by kitaemyoung on 7/24/15.
 */
public class Cart {

    private ArrayList<MenuItem> items;

    public Cart() {
        items = new ArrayList<MenuItem>();
    }

    public ArrayList<MenuItem> getItems(){
        return items;
    }

    public void addItem(MenuItem menuItem){
        items.add(menuItem);
    }

    public void addItems(ArrayList<MenuItem> menuItems){
        for(MenuItem item : menuItems){
            addItem(item);
        }
    }

    @Override
    public String toString(){
        StringBuilder st = new StringBuilder();

        for(MenuItem item : items){
            st.append(item.toString());
            st.append("\n");
        }

        return st.toString();
    }
}
