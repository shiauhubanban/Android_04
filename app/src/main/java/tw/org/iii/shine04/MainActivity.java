package tw.org.iii.shine04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;

import static tw.org.iii.shine04.R.styleable.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("shine","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("shine","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("shine","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("shine","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("shine","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("shine","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("shine","onRestart");
    }

    public void test1(View view){


    }

}
