package android.foodme.ncr.project.main.site;

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
public class SiteFragment extends Fragment {

    public SiteFragment() {
    }

    public static SiteFragment newInstance()
    {
        return new SiteFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_site, container, false);

        ArrayList<Site> sites = GetSites();
        ListView siteListView = (ListView)rootView.findViewById(R.id.site_listView_container);
        siteListView.setAdapter(new SiteAdaptor(getActivity(), sites));
        siteListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(),String.format("SiteFragment %d is selected", position+1),Toast.LENGTH_SHORT).show();
                //need to call GetMenu(SiteId);
                //if successful then go to menu page
                ((OrderActivity)getActivity()).transfer(FragmentNavigator.Menu);
            }
        });

        return rootView;
    }

    private ArrayList<Site> GetSites() {

        ArrayList<Site> sites = new ArrayList<Site>();

        Site site = new Site();
        site.setId(0);
        site.setName("Site 1");
        sites.add(site);

        site = new Site();
        site.setId(1);
        site.setName("Site 2");
        sites.add(site);

        site = new Site();
        site.setId(2);
        site.setName("Site 3");
        sites.add(site);

        return sites;
    }

}
