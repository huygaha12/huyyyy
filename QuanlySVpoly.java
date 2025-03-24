/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package svpoly;

import huybhxtc00228_asm.NhanVien;
import huybhxtc00228_asm.NhanVienHanhChinh;
import huybhxtc00228_asm.NhanVienTiepThi;
import huybhxtc00228_asm.TruongPhong;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;
/**
 *
 * @author ASUS
 */
public class QuanlySVpoly {
       static ArrayList <SVPoly> list = new ArrayList <SVPoly>();
        static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        menu();
    }
    public static void menu () {
    while (true){
        Scanner sc = new Scanner(System.in);
        System.out.println("+---------------------------------------------------+");
        System.out.println("1. Nhap danh sach nhan vien tu ban phim");
        System.out.println("2. Xuat danh sach nhan vien ra man hinh");
        System.out.println("3. Tim va hien thi nhan vien theo ma nhap tu ban phim");
        System.out.println("4. Xoa nhan vien theo ma nhap tu ban phim");
        System.out.println("5. Cap nhat thong tin nhan vien theo ma nhap tu ban phim");
        System.out.println("6. Tim cac nhan vien theo khoang luong nhap tu ban phim");
        System.out.println("7. Sap xep nhan vien theo ho va ten");
        System.out.println("8. Sap xep nhan vien theo thu nhap");
        System.out.println("9. Xuat 5 nhan vien co thu nhap cao nhat");
        System.out.println("10. Thoat");
        System.out.println("+---------------------------------------------------+");
        System.out.print("Moi ban chon chuc nang: ");
        int chucnang=sc.nextInt();
        switch(chucnang){
            case 1:
                nhapds();
                break;
            case 2:
                xuatds();
                break;
            case 3:
                xuattheokhoangdiem();
                break;
            case 4:
                timtheoten();
                break;
                case 5:
                tim_sua_hoten();
                break;
                case 6:
               timNhanVienTheoKhoangDiem();
                break;
                case 7:
                sapXepTheoHoTen();
                break;
                case 8:
                sapXepTheoThuNhap();
                break;
                case 9:
               xuatTop5ThuNhapCaoNhat();
                break;
                case 10:
                    System.exit(0);
                    break;
        }
    }
}
    public static void nhapds() {
        while (true) {
            System.out.println("Chon loai nhan vien: 1. Hanh chinh, 2. Tiep thi, 3. Truong phong");
            int loaiNhanVien = sc.nextInt();
            sc.nextLine();
            NhanVien nv;
            switch (loaiNhanVien) {
                case 1:
                    nv = new NhanVienHanhChinh();
                    break;
                case 2:
                    nv = new NhanVienTiepThi();
                    break;
                case 3:
                    nv = new TruongPhong();
                    break;
                default:
                    System.out.println("Nhan vien khong hop le!");
                    continue;
            }
            nv.nhap(sc);
            dsNhanVien.add(nv);
            System.out.print("Nhap tiep? (Y/N): ");
            String tiep = sc.nextLine();
            if (tiep.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public static void xuatds() {
           Iterable<NhanVien> dsNhanVien = null;
        for (NhanVien nv : dsNhanVien) {
            nv.xuat();
        }
    }
    public static void xuattheokhoangdiem(){
    double min, max;
        System.out.print("nhap max: ");
       max = sc.nextDouble();
        System.out.print("nhap min: ");
        min = sc.nextDouble();
      for(SVPoly sv:list){
          if(sv.diemtb>=min && sv.diemtb<=max){
              sv.xuat();
        }
    }
}
    public static void timtheoten(){
        System.out.println("nhap ten can tim: ");
        String name = sc.nextLine();
        int dem=0;
       for(SVPoly sv: list){
           if(sv.hoten.contains(name)){
               sv.xuat();
           }
           dem++;
       }
       if(dem==0){
           System.out.println("khong co ho ten can tim trong Arr");
       }
    }
    public static void tim_sua_hoten(){
        System.out.println("nhap ten can tim: ");
        String name = sc.nextLine();
        int dem=0;
       for(SVPoly sv: list){
           if(sv.hoten.equalsIgnoreCase(name)){
               System.out.println("nhap diem moi: ");
               sv.diemtb = sc.nextDouble();
           }
           dem++;
       }
       if(dem==0){
           System.out.println("khong co ho ten can tim trong Arr");
       }
    }
 public static void sapXepTheoHoTen() {
        Collections.sort(list, new Comparator<SVPoly>() {
            @Override
            public int compare(SVPoly sv1, SVPoly sv2) {
                String[] hoTen1 = sv1.hoten.split(" ");
                String[] hoTen2 = sv2.hoten.split(" ");
                String ten1 = hoTen1[hoTen1.length - 1];
                String ten2 = hoTen2[hoTen2.length - 1];

                int compareTen = ten1.compareTo(ten2);
                if (compareTen != 0) {
                    return compareTen;
                } else {
                    return sv1.hoten.compareTo(sv2.hoten);
                }
            }
        });
        System.out.println("danh sach nhan vien sau khi sap xep theo ho va ten:");
        xuatds();
 }
   public static void sapXepTheoThuNhap() {
        Collections.sort(list, new Comparator<SVPoly>() {
            @Override
            public int compare(SVPoly sv1, SVPoly sv2) {
                // Descending order
                return Double.compare(sv2.diemtb, sv1.diemtb);
            }
        });
        System.out.println("Danh sach nhan vien sau khi sap xep theo thu nhap:");
        xuatds();
    }
    public static void timNhanVienTheoKhoangDiem() {
        System.out.print("Nhap diem thap nhat: ");
        double min = sc.nextDouble();
        System.out.print("Nhap diem cao nhat: ");
        double max = sc.nextDouble();
        sc.nextLine(); // clear the newline character from the input buffer
        boolean found = false;
        for (SVPoly sv : list) {
            if (sv.diemtb >= min && sv.diemtb <= max) {
                sv.xuat();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay nhan vien trong khoang diem " + min + " - " + max);
        }
    }
     public static void xuatTop5ThuNhapCaoNhat() {
        Collections.sort(list, new Comparator<SVPoly>() {
            @Override
            public int compare(SVPoly sv1, SVPoly sv2) {
                // Descending order
                return Double.compare(sv2.diemtb, sv1.diemtb);
            }
        });

        System.out.println("5 nhan vien co thu nhap cao nhat:");
        int count = 0;
        for (SVPoly sv : list) {
            sv.xuat();
            count++;
            if (count == 5) {
                break;
            }
        }
    }
}