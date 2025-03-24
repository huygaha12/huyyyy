package huybhxtc00228_asm;

import java.util.Scanner;

public abstract class NhanVien {
    protected String ma;
    protected String hoTen;
    protected double luong;

    public NhanVien() {}

    public NhanVien(String ma, String hoTen, double luong) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public abstract double getThuNhap();

    public double getThueThuNhap() {
        double thuNhap = getThuNhap();
        if (thuNhap < 9000000) {
            return 0;
        } else if (thuNhap <= 15000000) {
            return thuNhap * 0.1;
        } else {
            return thuNhap * 0.12;
        }
    }

    public void nhap(Scanner sc) {
        System.out.print("Nhap ma nhan vien: ");
        ma = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap luong: ");
        luong = sc.nextDouble();
        sc.nextLine(); // Xóa bộ đệm
    }

    public void xuat() {
        System.out.println("Ma: " + ma + ", Ho ten: " + hoTen + ", Luong: " + luong + ", Thu nhap: " + getThuNhap() + ", Thue thu nhap: " + getThueThuNhap());
    }
}

