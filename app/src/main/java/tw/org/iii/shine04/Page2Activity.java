package tw.org.iii.shine04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Page2Activity extends AppCompatActivity {
    private MainApp mainApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        mainApp = (MainApp)getApplication();
        Log.v("brad", "" + mainApp.a);
    }
}
