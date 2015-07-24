package android.foodme.ncr.project.main.menu.adapter;

import android.content.Context;
import android.foodme.ncr.project.R;
import android.foodme.ncr.project.main.menu.data.MenuItem;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by kitaemyoung on 7/24/15.
 */
public class MenuAdapter extends BaseAdapter{

    private Context _activity;
    private ArrayList<MenuItem> _menuItems;
    private LayoutInflater _inflater;

    public MenuAdapter(Context activity, ArrayList<MenuItem> menuItems) {
        _activity = activity;
        _menuItems = menuItems;
        _inflater  = LayoutInflater.from(activity);
    }

    @Override
    public int getCount() {
        return _menuItems.size();
    }

    @Override
    public Object getItem(int position) {
        return _menuItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            convertView = _inflater.inflate(R.layout.menu_item, null);
            holder = new ViewHolder();
            holder.menuName = (TextView) convertView.findViewById(R.id.menu_item_name);
            holder.addToCart = (Button)  convertView.findViewById(R.id.menu_item_button_add_cart);
            holder.addToCart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(_activity, String.format("AddItem button in menu item %d is selected", v.getId()), Toast.LENGTH_SHORT).show();
                }
            });

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        MenuItem itemAtPosition = _menuItems.get(position);
        holder.menuName.setText(itemAtPosition.getName());

        return convertView;
    }

    static class ViewHolder{
        TextView menuName;
        Button addToCart;
    }
}
