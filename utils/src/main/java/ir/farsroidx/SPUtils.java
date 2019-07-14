package ir.farsroidx;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SPUtils {

    private Context context;
    @SuppressLint("StaticFieldLeak")
    private static SPUtils spUtils              = null;
    private SharedPreferences sharedPreferences = null;
    private SharedPreferences.Editor editor     = null;

    private SPUtils(Context context) {
        this.context = context;
    }

    public static SPUtils getInstance(Context context){
        if(spUtils == null){
            spUtils = new SPUtils(context);
        }
        return spUtils;
    }

    private SharedPreferences getPreferenceInstance() {
        if(sharedPreferences == null){
            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        }
        return sharedPreferences;
    }

    private SharedPreferences.Editor getPreferenceEditor() {
        if(editor == null){
            editor = getPreferenceInstance().edit();
        }
        return editor;
    }

    public String readString(String key, String alternative) {
        return getPreferenceInstance().getString(key, alternative);
    }

    public float readFloat(String key, float alternative) {
        return getPreferenceInstance().getFloat(key, alternative);
    }

    public long readLong(String key, long alternative) {
        return getPreferenceInstance().getLong(key, alternative);
    }

    public int readInteger(String key, int alternative) {
        return getPreferenceInstance().getInt(key, alternative);
    }

    public boolean readBoolean(String key, boolean alternative) {
        return getPreferenceInstance().getBoolean(key, alternative);
    }

    public void writeString(String key, String str) {
        SharedPreferences.Editor editor = getPreferenceEditor();
        editor.putString(key, str);
        editor.apply();
    }

    public void writeFloat(String key, float flt) {
        SharedPreferences.Editor editor = getPreferenceEditor();
        editor.putFloat(key , flt);
        editor.apply();
    }

    public void writeLong(String key, long lng) {
        SharedPreferences.Editor editor = getPreferenceEditor();
        editor.putLong(key,lng);
        editor.apply();
    }

    public void writeInteger(String key, int integer) {
        SharedPreferences.Editor editor = getPreferenceEditor();
        editor.putInt(key, integer);
        editor.apply();
    }

    public void writeBoolean(String key, boolean bln) {
        SharedPreferences.Editor editor = getPreferenceEditor();
        editor.putBoolean(key, bln);
        editor.apply();
    }

    public void remove(String key) {
        SharedPreferences.Editor editor = getPreferenceEditor();
        editor.remove(key);
        editor.apply();
    }

    public void clearAll() {
        SharedPreferences.Editor editor = getPreferenceEditor();
        editor.clear();
        editor.apply();
    }

}
