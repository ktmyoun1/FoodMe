package android.foodme.ncr.project.main.cart;

import android.foodme.ncr.project.main.menu.data.MenuItem;

import java.util.ArrayList;

/**
 * Created by kitaemyoung on 7/24/15.
 */
public class CartManager {
    private static CartManager _instance;
    private Cart cart;

    private CartManager(){
        cart = new Cart();
    }

    public static CartManager getInstance(){
        if (_instance == null) {
            _instance = new CartManager();
        }
        return _instance;
    }

    public void addItems(ArrayList<MenuItem> items)
    {
        cart.addItems(items);
    }

    public void addItem(MenuItem item)
    {
        cart.addItem(item);
    }

    public ArrayList<MenuItem> getItems(){
        return cart.getItems();
    }

}
