package com.example.ahnsimsteak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class KoreanActivity extends AppCompatActivity {

    private ImageButton backbutton;
    private ArrayList<MainData> arrayList; // MaindData를 담은 배열 리스트인 arrayList를 선언
    private MainAdapter mainAdapter; // 인스턴스 mainAdapter를 선언
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager; // 레이아웃 관리자 선언
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korean);

        recyclerView = (RecyclerView) findViewById(R.id.rv);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager); // recyclerView를 통해 리사이클러뷰를 지정

        arrayList = new ArrayList<>();

        mainAdapter = new MainAdapter(arrayList); // 인스턴스 생성
        recyclerView.setAdapter(mainAdapter); // 어댑터를 mainAdapter로 설정

        backbutton = (ImageButton) findViewById(R.id.backbutton);

        itemadd();

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void itemadd() {
        MainData mainData;

        mainData = new MainData(R.drawable.buzzi, "부찌식당22", "부대찌개 전문점입니다.\n", "★★★★☆ (4.5)");
        arrayList.add(mainData);

        mainData = new MainData(R.drawable.gam, "오란비 감자탕", "45년 전통 감자탕 집입니다.\n", "★★★★★ (4.8)");
        arrayList.add(mainData);

        mainAdapter.notifyDataSetChanged(); // 새로고침
    }
}