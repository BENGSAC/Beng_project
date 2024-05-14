package com.example.BENGSAC;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class CheckMapActivity extends AppCompatActivity {

    private ImageButton gujwa_map_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkmap);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.baseline_arrow_back_ios_new_24);


        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // '홈' 화면으로 이동하는 코드를 작성하세요
                Intent intent = new Intent(CheckMapActivity.this, HomeActivity.class);
                startActivity(intent);
                finish(); // 이전 화면으로 돌아간 후 현재 화면 종료
            }
        });

        gujwa_map_button = findViewById(R.id.gujwa_map_button);

        gujwa_map_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 이미지 버튼 누르면 일어날 일 정의
                //Intent intent = new Intent(CheckMapActivity.this, EnterMapActivity.class);
                //startActivity(intent);
                //finish();
                showCustomDialog();
            }
        });
    }


    // 커스텀 다이얼로그 표시 메서드
    private void showCustomDialog() {
        // 다이얼로그 빌더 생성
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        // 커스텀 다이얼로그 xml 파일 설정
        View dialogView = getLayoutInflater().inflate(R.layout.dialog_enter_gujwa, null);
        builder.setView(dialogView);

        // 다이얼로그 생성
        AlertDialog dialog = builder.create();

        // 확인 버튼 클릭 이벤트 처리
        Button yesButton = dialogView.findViewById(R.id.yesButton);
        yesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 확인 버튼 클릭 시 prefer dialog 띄움
                showPreferDialog();
                dialog.dismiss(); // 다이얼로그 닫기
            }
        });

        // 취소 버튼 클릭 이벤트 처리
        Button noButton = dialogView.findViewById(R.id.noButton);
        noButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 취소 버튼 클릭 시
                dialog.dismiss(); // 다이얼로그 닫기
            }
        });

        // 다이얼로그 표시
        dialog.show();

    }

    // 선호 다이얼로그 표시 메서드
    private void showPreferDialog() {
        // 다이얼로그 빌더 생성
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        // 커스텀 다이얼로그 xml 파일 설정
        View dialogView = getLayoutInflater().inflate(R.layout.dialog_prefer, null);
        builder.setView(dialogView);

        // 다이얼로그 생성
        AlertDialog dialog = builder.create();

        // 확인 버튼 클릭 이벤트 처리
        Button startButton = dialogView.findViewById(R.id.plogging_start_btn);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // start 버튼 클릭 시 처리할 코드 작성
                // 예를 들어 다른 동작 추가 가능
                Intent intent = new Intent(CheckMapActivity.this, PloggingMapActivity.class);
                startActivity(intent);
                finish();
                dialog.dismiss(); // 현재 다이얼로그 닫기
            }
        });

        // 다이얼로그 표시
        dialog.show();
    }
}
