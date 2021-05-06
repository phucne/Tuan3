package com.example.myapplication;

public class ThongTin {
    private String tenSanPham;
    private String mau;
    private String cungCap;
    private String gia;

    public ThongTin(String tenSanPham, String mau, String cungCap, String gia, int view) {
        this.tenSanPham = tenSanPham;
        this.mau = mau;
        this.cungCap = cungCap;
        this.gia = gia;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getCungCap() {
        return cungCap;
    }

    public void setCungCap(String cungCap) {
        this.cungCap = cungCap;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }
}
