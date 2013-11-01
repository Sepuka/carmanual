package app.carmanual;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.CheckBox;
import app.carmanual.R;

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
        String string = "some text кириллица".concat(this.getString(R.string.app_name));
        tv.setText(string);
        CheckBox checkbox = new android.widget.CheckBox(this);
    }
}