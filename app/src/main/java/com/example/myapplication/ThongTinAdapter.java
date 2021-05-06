package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ThongTinAdapter extends BaseAdapter {
    Context ctx;
    int layoutItem;
    ArrayList<ThongTin> arrayList;

    public ThongTinAdapter(Context ctx, int layoutItem, ArrayList<ThongTin> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(ctx).inflate(layoutItem,viewGroup,false);
        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvMau = view.findViewById(R.id.tvMau);
        TextView tvCungCap = view.findViewById(R.id.tvCungCap);
        TextView tvGia = view.findViewById(R.id.tvGia);
        //
        tvName.setText(arrayList.get(i).getTenSanPham());
        tvMau.setText(arrayList.get(i).getMau());
        tvCungCap.setText(arrayList.get(i).getCungCap());
        tvGia.setText(arrayList.get(i).getGia());
        return view;
    }
}
