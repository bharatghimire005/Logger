package project.com.logger;
import project.com.logger.BuildConfig;
import project.com.logger.loggerinterface.LogFunction;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Bharat Ghimire on 3/2/16.
 */
public class Logger  {


    private static final boolean DEBUG = true;
    private static boolean LogEnable= BuildConfig.L0G_ENABLED;
    private static int JSON_INDENT=4;
    private Logger() {
    }
    /*
     Print error log in console
     */
    public static void e(String tag, String msg) {

        if (LogEnable && msg != null) {
            Log.e(tag, msg);
        }
    }

    /*
    Print Debug log in console
     */
    public static void d(String tag, String msg) {
        if (LogEnable && msg != null)
            Log.d(tag, msg);
    }

    public static void v(String tag, String msg) {
        if (LogEnable && msg != null)
            Log.d(tag, msg);
    }
    /*
Print Information log in console
 */
    public static void i(String tag, String msg) {
        if (LogEnable && msg != null)
            Log.i(tag, msg);
    }



public static void json(String tag,String msg){
    if(msg.length() > 4000) {
        jsonLogger(tag, msg.substring(0, 4000));
        json(tag, msg.substring(4000));
    } else
        jsonLogger(tag,msg);
}

    public static void jsonLogger(String tag, String msg) {
        if (LogEnable) {
            if (TextUtils.isEmpty(msg)) {
                Log.e("JSON", "Empty json content");
                return;
            }
            try {
                if (msg.startsWith("{")) {
                    JSONObject jsonObject = new JSONObject(msg);
                    String message = jsonObject.toString(JSON_INDENT);
                    Log.e("JSON", message);
                    return;
                }
                if (msg.startsWith("[")) {
                    JSONArray jsonArray = new JSONArray(msg);
                    String message = jsonArray.toString(JSON_INDENT);
                    Log.i("JSON", message);
                }
            } catch (JSONException e) {
                Log.e("JSONException", e.getCause().getMessage() + "\n" + msg);
            }

        }
    }

    private static void header(){

    }


}
