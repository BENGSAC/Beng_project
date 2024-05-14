package com.example.BENGSAC;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class IntroActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000; // 인트로 화면이 보이는 시간 (밀리초 단위)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // 인트로 화면이 보이는 시간이 지난 후에 메인 액티비티로 이동
                Intent mainIntent = new Intent(IntroActivity.this, LoginActivity.class);
                startActivity(mainIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}

