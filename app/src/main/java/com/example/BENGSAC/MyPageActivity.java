package com.example.BENGSAC;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MyPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.baseline_arrow_back_ios_new_24);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // '홈' 화면으로 이동
                Intent intent = new Intent(MyPageActivity.this, HomeActivity.class);
                startActivity(intent);
                finish(); // 이전 화면으로 돌아간 후 현재 화면을 종료
            }
        });

        toolbar.inflateMenu(R.menu.mypage_menu);
        toolbar.setOnMenuItemClickListener(item -> {
            if (item.getItemId() == R.id.action_settings) {
                // 설정 버튼 클릭 시 'setting' 화면으로 이동
                Intent intent = new Intent(MyPageActivity.this, SettingActivity.class);
                startActivity(intent);
                return true;
            } else {
                return false;
            }
        });
    }
}
