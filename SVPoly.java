/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package svpoly;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SVPoly{
    public String hoten;
    public double diemtb;
    public SVPoly(){} //hàm tạo ko tham số

    public SVPoly(String hoten, double diemtb) {
        this.hoten = hoten;
        this.diemtb = diemtb;//hàm tạo có tham số
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getDiemtb() {
        return diemtb;
    }

    public void setDiemtb(double diemtb) {
        this.diemtb = diemtb;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ho ten: ");
        this.hoten = sc.nextLine();
        System.out.println("nhap diem: ");
        this.diemtb = sc.nextDouble();
    }
    public void xuat(){
        System.out.println("ho ten: "+hoten);
        System.out.println("diem trung binh: "+diemtb);
    }
    public static void main(String[] args) {
        
        
    }
}

