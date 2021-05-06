package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {


    ListView lsThongTin;
    ThongTinAdapter adt;
    ArrayList<ThongTin> arrayList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        lsThongTin.findViewById(R.id.view);
        arrayList = new ArrayList<>();

        arrayList.add(new ThongTin("Điện Thoại Vsmart Joy 3\n" +
                "Hàng chính hãng","Màu đỏ","TiKi Trandding","1.790.000 đ",R.drawable.view));
        adt = new ThongTinAdapter(this,R.layout.activity_main3,arrayList);

        lsThongTin.setAdapter(adt);
    }
}