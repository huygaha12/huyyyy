/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class SanPham {
    private String maSanPham;
    private String maDanhMuc;
    private String tenSanPham;
    private Date ngayTao;
    private double gia;
    private int soLuong;
    private String moTa;
    private String hinhAnh;

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getMaDanhMuc() {
        return maDanhMuc;
    }

    public void setMaDanhMuc(String maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public SanPham() {
    }

    public SanPham(String maSanPham, String maDanhMuc, String tenSanPham, Date ngayTao, double gia, int soLuong, String moTa, String hinhAnh) {
        this.maSanPham = maSanPham;
        this.maDanhMuc = maDanhMuc;
        this.tenSanPham = tenSanPham;
        this.ngayTao = ngayTao;
        this.gia = gia;
        this.soLuong = soLuong;
        this.moTa = moTa;
        this.hinhAnh = hinhAnh;
    }
    
    
}
