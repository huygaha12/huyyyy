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
public class TruongPhong extends NhanVien {
    private double luongTrachNhiem;

    public TruongPhong() {
        super();
    }

    public TruongPhong(String ma, String hoTen, double luong, double luongTrachNhiem) {
        super(ma, hoTen, luong);
        this.luongTrachNhiem = luongTrachNhiem;
    }

    @Override
    public double getThuNhap() {
        return luong + luongTrachNhiem;
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Nhap luong trach nhiem: ");
        luongTrachNhiem = sc.nextDouble();
        sc.nextLine(); // Xóa bộ đệm
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Luong trach nhiem: " + luongTrachNhiem);
    }
}