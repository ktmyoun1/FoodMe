package android.foodme.ncr.project.main;

import android.app.Fragment;
import android.foodme.ncr.project.main.menu.MenuFragment;
import android.foodme.ncr.project.main.site.SiteFragment;
import android.os.Bundle;

/**
 * Created by kitaemyoung on 7/10/15.
 */
public class FragmentFactory {

    public static Fragment GetFragment(FragmentNavigator destination, Bundle bundle) {
        switch (destination) {
            case Site:
                return SiteFragment.newInstance();
            case Menu:
                return MenuFragment.newInstance();
        }
        return null;
    }
}