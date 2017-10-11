package com.jtanuki.go.sharingdata;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private static   final int REQUEST_CODE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = (Button) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("hello","hi!");
                intent.putExtra("SecondMessage", "Hello Again");
                intent.putExtra("int",123);


               startActivityForResult(intent, REQUEST_CODE);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if(requestCode == REQUEST_CODE){
            if(resultCode == RESULT_OK){

                String results = data.getStringExtra("returnDATA");

                Toast.makeText(MainActivity.this, results, Toast.LENGTH_LONG).show();

            }

        }




    }
}
