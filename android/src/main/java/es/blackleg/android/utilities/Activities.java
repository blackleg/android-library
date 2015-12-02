package es.blackleg.android.utilities;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;

/**
 * Created by hector on 13/11/14.
 */
public class Activities {

    public static void launchActivity(Activity activity, Class<?> cls) {
        Intent intent = new Intent(activity, cls);
        activity.startActivity(intent);
    }

    public static void launchActivityWithParcelable(Activity activity, Class<?> cls, String nameInExtra,Parcelable parcelable) {
        Intent intent = new Intent(activity, cls);
        intent.putExtra(nameInExtra, parcelable);
        activity.startActivity(intent);
    }

    public static void launchActivityForResult(Activity activity, Class<?> cls, int code) {
        Intent intent = new Intent(activity, cls);
        activity.startActivityForResult(intent, code);
    }

    public static void launchActivityForResultWithParcelable(Activity activity, Class<?> cls, String nameInExtra, Parcelable parcelable, int code) {
        Intent intent = new Intent(activity, cls);
        intent.putExtra(nameInExtra, parcelable);
        activity.startActivityForResult(intent, code);
    }

    public static Parcelable getParcelableFromActivity(Activity activity, String nameInExtras) {
        return activity.getIntent().getExtras().getBundle(nameInExtras);
    }


}
