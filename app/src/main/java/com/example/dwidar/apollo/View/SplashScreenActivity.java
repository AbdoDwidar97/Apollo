package com.example.dwidar.apollo.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import com.example.dwidar.apollo.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        this.getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);


        Thread thread = new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    sleep(4000);
                }catch (Exception e)
                {

                }
                finally
                {
                    Intent mainMenu = new Intent(SplashScreenActivity.this, MainActivity.class);
                    startActivity(mainMenu);
                }

            }
        };
        thread.start();
    }


    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
