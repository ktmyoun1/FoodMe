package android.foodme.ncr.project.main.site;

import android.app.Fragment;
import android.foodme.ncr.project.R;
import android.foodme.ncr.project.main.site.adapter.SiteAdaptor;
import android.foodme.ncr.project.main.site.data.Site;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

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
