package com.example.BENGSAC;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class PloggingMapActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plogging_map);


        BottomNavigationView MapBottomNavigationView = findViewById(R.id.MapBottomNavigationView);
        MapBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.navigation_community) {
                    startActivity(new Intent(PloggingMapActivity.this, CommunityActivity.class));
                    finish();
                    return true;
                } else if (item.getItemId() == R.id.navigation_camera) {

                        // 카메라 화면으로 전환
//                        startActivity(new Intent(PloggingMapActivity.this, CommunityActivity.class));
//                        finish();
//                        return true;

                } else if (item.getItemId() == R.id.navigation_pause) {

                    // 일시정지 다이얼로그 띄움
//                    startActivity(new Intent(PloggingMapActivity.this, MyPageActivity.class));
//                    finish();
//                    return true;
                }
                return false;
            }
        });
    }
}
