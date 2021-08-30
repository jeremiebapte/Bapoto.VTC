package bapoto.vtc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import java.util.Objects;

public class Rappel extends AppCompatActivity {

    private Button buttonOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rappel);
        Objects.requireNonNull(getSupportActionBar()).hide();

        this.buttonOk =  findViewById(R.id.buttonOk);

        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(otherActivity);
                finish();
            }
        });
    }




}