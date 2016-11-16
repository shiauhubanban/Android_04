package tw.org.iii.shine04;

import android.app.Application;


public class MainApp extends Application {
    int a = 10;
    public MainApp(){
        a = 100;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        a= 1000;
    }
}
