/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entities.SanPham;
import Utils.XJDBC;
import java.awt.List;
import java.sql.*;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class SanPhamDao {
    private static final String insertSql = "INSERT INTO SANPHAM (MaDanhMuc, TenSanPham, MoTa, Gia, SoLuong, HinhAnh, NgayTao) VALUES (?, ?, ?, ?, ?, ?, ?)";
    private static final String updateSql = "UPDATE SANPHAM SET MaDanhMuc = ?, TenSanPham = ?, MoTa = ?, DonGia = ?, SoLuongTon = ?, HinhAnh = ?, NgayTao = ? WHERE MaSanPham = ?";
    private static final String deleteSql = "DELETE FROM SANPHAM WHERE MaSanPham = ?";
    private static final String selectByIdSql = "SELECT * FROM SANPHAM WHERE MaSanPham = ?";
    private static final String selectAllSql = "SELECT * FROM SANPHAM";

    public void insert(SanPham entity) {
        try {
            XJDBC.update(insertSql,
                entity.getMaDanhMuc(),
                entity.getTenSanPham(),
                entity.getMoTa(),
                entity.getGia(),
                entity.getSoLuong(),
                entity.getHinhAnh(),
                entity.getNgayTao()
            );
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void update(SanPham entity) {
        try {
            XJDBC.update(updateSql,
                entity.getMaDanhMuc(),
                entity.getTenSanPham(),
                entity.getMoTa(),
                entity.getGia(),
                entity.getSoLuong(),
                entity.getHinhAnh(),
                entity.getNgayTao(),
                entity.getMaSanPham()
            );
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void delete(Integer id) {
        try {
            XJDBC.update(deleteSql, id);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    
    public SanPham selectById(String id) {
        java.util.List<SanPham> list = this.selectBySql(selectByIdSql, id);
        return list.isEmpty() ? null : list.get(0);
    }

    public List<SanPham> selectAll() {
        return selectBySql(selectAllSql);
    }
}
