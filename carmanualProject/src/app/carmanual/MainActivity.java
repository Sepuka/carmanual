package app.carmanual;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.CheckBox;
import android.content.ContentValues;
import android.content.ContentResolver;
import android.net.Uri;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        //TODO: Получить список файлов из папки и выдать их списком для выбора
        TextView tv = new TextView(this);
        //ContentValues values = new ContentValues();
        //values.put("key", "my value");
        //ContentResolver cr = this.getContentResolver();
        //Uri newUri = cr.insert(Uri.parse("content://app.carmanual.testdb"), values);
        String string = "some text кириллица";
        tv.setText(string);
        CheckBox checkbox = new android.widget.CheckBox(this);
    }
}