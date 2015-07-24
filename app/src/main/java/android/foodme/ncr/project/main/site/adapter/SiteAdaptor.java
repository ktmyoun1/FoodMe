package android.foodme.ncr.project.main.site.adapter;

import android.content.Context;
import android.foodme.ncr.project.R;
import android.foodme.ncr.project.main.site.data.Site;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kitaemyoung on 7/24/15.
 */
public class SiteAdaptor extends BaseAdapter {

    private ArrayList<Site> _sites;
    private LayoutInflater _inflater;

    public SiteAdaptor(Context activity, ArrayList<Site> sites) {
        _sites = sites;
        _inflater  = LayoutInflater.from(activity);
    }

    @Override
    public int getCount() {
        return _sites.size();
    }

    @Override
    public Object getItem(int position) {
        return _sites.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            convertView = _inflater.inflate(R.layout.contact_item, null);
            holder = new ViewHolder();
            holder.siteName = (TextView) convertView.findViewById(R.id.menu_item_name);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Site itemAtPosition = _sites.get(position);
        holder.siteName.setText(itemAtPosition.getName());

        return convertView;
    }

    static class ViewHolder{
        TextView siteName;
    }
}
