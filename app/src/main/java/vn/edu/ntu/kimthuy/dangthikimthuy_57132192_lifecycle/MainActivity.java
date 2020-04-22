package vn.edu.ntu.kimthuy.dangthikimthuy_57132192_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.Date;
public class MainActivity extends AppCompatActivity {
    TextView thoiGian;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Life cycle","onCreate called");
        Toast.makeText(getApplicationContext(), "onCreate called", Toast.LENGTH_SHORT).show();
        thoiGian = findViewById(R.id.txtTG);
        SimpleDateFormat Date = new SimpleDateFormat("HH:mm:ss");
        String date = Date.format(new Date());
        thoiGian.setText(date);;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Life cycle","onStart called");
        Toast.makeText(getApplicationContext(), "onStart called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Life cycle","onStop called");
        Toast.makeText(getApplicationContext(), "onStop called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Life cycle","onResume called");
        Toast.makeText(getApplicationContext(), "onResume called", Toast.LENGTH_SHORT).show();
        thoiGian = findViewById(R.id.txtTG);
        SimpleDateFormat Date = new SimpleDateFormat("HH:mm:ss");
        String date = Date.format(new Date());
        thoiGian.setText(date);;
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Life cycle","onRestart called");
        Toast.makeText(getApplicationContext(), "onRestart called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Life cycle","onPause called");
        Toast.makeText(getApplicationContext(), "onPause called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Life cycle","onDestroy called");
        Toast.makeText(getApplicationContext(), "onDestroy called", Toast.LENGTH_SHORT).show();
    }
}
