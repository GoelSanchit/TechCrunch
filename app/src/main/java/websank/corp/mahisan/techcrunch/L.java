package websank.corp.mahisan.techcrunch;

import android.content.Context
import android.util.Log;
import android.widget.Toast;

/**
 * Created by user on 02-03-2015.
 */
public class L {
    public static void m(String message)
    {
        Log.d("VIVZ", message);

    }
    public static void s(Context context , String message )
    {
        Toast.makeText(context, message,Toast.LENGTH_LONG).show();
    }
}
