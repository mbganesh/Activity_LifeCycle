package mb.ganesh.activity_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends Activity {

    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.text1);
        textView.setText("onCreated");

        Log.d(TAG , "***OnCreated***");
    }

    @Override
    protected void onStart() {
        super.onStart();
        TextView textView = (TextView) findViewById(R.id.text1);
        textView.setText("onStarted");

        Log.d(TAG , "***onStarted***");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        TextView textView = (TextView) findViewById(R.id.text1);
        textView.setText("onRestarted");
    }

    @Override
    protected void onPause() {
        super.onPause();
        TextView textView = (TextView) findViewById(R.id.text1);
        textView.setText("onPaused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        TextView textView = (TextView) findViewById(R.id.text1);
        textView.setText("onStopped");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        TextView textView = (TextView) findViewById(R.id.text1);
        textView.setText("onResumed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        TextView textView = (TextView) findViewById(R.id.text1);
        textView.setText("onDestroyed");
    }
}
