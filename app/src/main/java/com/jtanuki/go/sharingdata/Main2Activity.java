package com.jtanuki.go.sharingdata;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {



    private Button button2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        button2 = (Button) findViewById(R.id.button2);

        Bundle extras = getIntent().getExtras();

        if(extras != null){
            String message = extras.getString("hello");

            System.out.println(message);


        }


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //going back to the first activitiy

             Intent returnIntent = getIntent();
                returnIntent.putExtra("returnDATA","ok good to go");

                setResult(RESULT_OK, returnIntent);
                finish();

            }
        });




    }
}
