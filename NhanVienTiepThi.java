/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huybhxtc00228_asm;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class NhanVienTiepThi extends NhanVien {
    private double doanhSo;
    private double tiLeHueHong;

    public NhanVienTiepThi() {
        super();
    }

    public NhanVienTiepThi(String ma, String hoTen, double luong, double doanhSo, double tiLeHueHong) {
        super(ma, hoTen, luong);
        this.doanhSo = doanhSo;
        this.tiLeHueHong = tiLeHueHong;
    }

    @Override
    public double getThuNhap() {
        return luong + doanhSo * tiLeHueHong;
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Nhap doanh so: ");
        doanhSo = sc.nextDouble();
        System.out.print("Nhap ti le hue hong: ");
        tiLeHueHong = sc.nextDouble();
        sc.nextLine(); // Xóa bộ đệm
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Doanh so: " + doanhSo + ", Ti le hue hong: " + tiLeHueHong);
    }
}
