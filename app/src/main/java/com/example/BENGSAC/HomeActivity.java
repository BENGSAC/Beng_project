package com.example.BENGSAC;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // 버튼 객체 참조
        Button btnStart = findViewById(R.id.btn_start);

        // 버튼 클릭 이벤트 처리
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // CheckMapActivity로 화면 전환
                Intent intent = new Intent(HomeActivity.this, CheckMapActivity.class);
                startActivity(intent);
            }
        });

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.navigation_community) {
                    startActivity(new Intent(HomeActivity.this, CommunityActivity.class));
                    finish();
                    return true;
                } else if (item.getItemId() == R.id.navigation_home) {
                    // 이미 홈 화면이 활성화되어 있는 경우 아무 동작도 하지 않음
//                    if (!item.isChecked()) {
//                        // 홈 화면으로 이동
//                        startActivity(new Intent(HomeActivity.this, HomeActivity.class));
//                        finish();
//                    }
//                    return true;
                } else if (item.getItemId() == R.id.navigation_mypage) {
                    startActivity(new Intent(HomeActivity.this, MyPageActivity.class));
                    finish();
                    return true;
                }
                return false;
            }
        });
    }
}
