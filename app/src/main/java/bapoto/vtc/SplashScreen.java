package bapoto.vtc;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Objects;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Objects.requireNonNull(getSupportActionBar()).hide();

        // rediriger vers page principale apres 3 secondes.
        Runnable runnable = () -> {
            Intent intent = new Intent(getApplicationContext(),Rappel.class);
            startActivity(intent);
            finish();

        };

        new Handler().postDelayed(runnable,3000);
    }
}