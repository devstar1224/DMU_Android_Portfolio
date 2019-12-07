package com.example.myportfolio;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ProjectActivity extends AppCompatActivity {
    private ListViewItem data;
    private ArrayList<ListViewItem> arrays;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.project_main);
        Intent it = getIntent();
        ListView listview = null;
        ListViewAdapter adapter;
        arrays = new ArrayList<ListViewItem>();

        initialData();
        listview = (ListView)findViewById(R.id.listview1);
        adapter = new ListViewAdapter(arrays);
        listview = (ListView) findViewById(R.id.listview1);
        listview.setAdapter(adapter);
    }

    private void initialData() {
        data = new ListViewItem();
        data.setData(getResources().getDrawable(R.drawable.main_icon),"디스코드 뮤직봇","Node.JS, FFMPEG, MYSQL 등의 각종 라이브러리와 언어들을 사용하여 디스코드 뮤직봇'팝콘'봇을 개발","Yesan-gun","2018.10","https://github.com/devstar1224/Popcon_discord.git");
        arrays.add(data);

        data = new ListViewItem();
        data.setData(getResources().getDrawable(R.drawable.optimize),"최적화 프로그램","2014년에 VB6.0으로 제작한 최적화 프로그램 당시 나이에 서버란것을 처음 접해보는 프로젝트였음.","Yesan-gun","2014.04", "https://github.com/devstar1224/KOI_2014.git");
        arrays.add(data);

        data = new ListViewItem();
        data.setData(getResources().getDrawable(R.drawable.music),"MSK_PROJECT","이 프로젝트는 공모한 프로젝트중 가장 큰 프로젝트였고, 첫 협업프로젝트였음. 이 프로그램은 음악의 장르분석을 하는 프로그램이였음.","Hongsung-gun","2015.06", "https://github.com/devstar1224/KOI_2015.git");
        arrays.add(data);

        data = new ListViewItem();
        data.setData(getResources().getDrawable(R.drawable.facereg),"자동절전프로그램","이 프로젝트는 사용자가 등록한 얼굴을 인식하여 컴퓨터가 자동으로 잠금해제하는 프로그램이였음.","Yesan-gun","2016.06", null);
        arrays.add(data);
    }
}
