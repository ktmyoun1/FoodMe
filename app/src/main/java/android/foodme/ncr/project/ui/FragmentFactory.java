package android.foodme.ncr.project.ui;

import android.app.Fragment;
import android.os.Bundle;

/**
 * Created by kitaemyoung on 7/10/15.
 */
public class FragmentFactory {

    public static Fragment GetFragment(FragmentNavigator destination, Bundle bundle) {
        switch (destination) {
            case Menu:
                return OrderMenuFragment.newInstance();
//            case CreateMessage:
//                return CreateMessageFragment.newInstance(whichfragment.ordinal());
//            case QRCOdeGENERATOR:
//                return QRCodeGeneratorFragment.newInstance(bundle, whichfragment.ordinal());
//
//            case SelectBackground:
//                return SelectBackgroundFragment.newInstance(bundle, whichfragment.ordinal());
        }
        return null;
    }
}