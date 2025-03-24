/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huybhxtc00228_asm;

/**
 *
 * @author ASUS
 */
public class NhanVienHanhChinh extends NhanVien {
    public NhanVienHanhChinh() {
        super();
    }

    public NhanVienHanhChinh(String ma, String hoTen, double luong) {
        super(ma, hoTen, luong);
    }

    @Override
    public double getThuNhap() {
        return luong;
    }
}
