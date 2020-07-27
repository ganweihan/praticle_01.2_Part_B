package com.example.praticle_2_part_a;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private int mCount=0;
private int zero=0;
private TextView mShowCount;
private Button mreset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        mreset = (Button) findViewById(R.id.button_zero);
    }

    public void showToast(View view){
       Toast toast=Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT );
       toast.show();
    }
    @RequiresApi(api = Build.VERSION_CODES.M)

    public void countUp(View view){
        ++mCount;

if (mShowCount !=null)
    mShowCount.setText(Integer.toString(mCount));
        mreset.setBackgroundColor(getColor(R.color.pink));
    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    public void reset(View view){
      mShowCount.setText("0");
        mreset.setBackgroundColor(getColor(R.color.gray));
    }

    public void next(View view) {

        Intent intent=new Intent(this,next_page.class);
        intent.putExtra("hello","hello");
        intent.putExtra("count",mShowCount.getText().toString());
        startActivity(intent);
    }
}
