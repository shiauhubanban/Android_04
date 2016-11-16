package tw.org.iii.shine04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button test1, test2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("shine","onCreate");

        test1 = (Button)findViewById(R.id.test1);
        test2 = (Button)findViewById(R.id.test2);

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
    protected void onRestart() {
        super.onRestart();
        Log.v("shine","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("shine","onDestroy");
    }

    public void test1(View view){
        if (view == test1) {
            Intent it = new Intent(this, Page2Activity.class);
            startActivity(it);
            Log.v("brad", "test1 return");
        }else if (view == test2){
            finish();
        }
    }

    public void test3(View view){
        Intent it = new Intent(this, Page3Activity.class);
        it.putExtra("name","shine");
        it.putExtra("level",4);
        it.putExtra("sound",true);
        startActivity(it);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        String key1 = data.getStringExtra("key1");
        Log.v("shine", "onActivityResult:"+requestCode+":"+resultCode+":"+key1);
    }

    public void test4(View view){
        Intent it = new Intent(this, Page3Activity.class);
        it.putExtra("name","shine");
        it.putExtra("level",4);
        it.putExtra("sound",true);
        startActivityForResult(it,123); //requestCode => 123

    }

}
