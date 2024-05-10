/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;

public class NhanVien {
    private int IDNhanVien;
    private String userName;
    private String passWord;
    private String tenNhanVien;
    private String diaChi;
    private boolean gioiTinh;
    private Date ngaySinh;
    private String caLam;
    private double luong;
    private String sdt;
    private boolean chucVu;
    private boolean trangThai;

    // Constructor
    public NhanVien(int IDNhanVien, String userName, String passWord, String tenNhanVien, String diaChi, boolean gioiTinh, Date ngaySinh, String caLam, double luong, String sdt, boolean chucVu, boolean trangThai) {
        this.IDNhanVien = IDNhanVien;
        this.userName = userName;
        this.passWord = passWord;
        this.tenNhanVien = tenNhanVien;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.caLam = caLam;
        this.luong = luong;
        this.sdt = sdt;
        this.chucVu = chucVu;
        this.trangThai = trangThai;
    }

    // Getters and Setters
    public int getIDNhanVien() {
        return IDNhanVien;
    }

    public void setIDNhanVien(int IDNhanVien) {
        this.IDNhanVien = IDNhanVien;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getCaLam() {
        return caLam;
    }

    public void setCaLam(String caLam) {
        this.caLam = caLam;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public boolean isChucVu() {
        return chucVu;
    }

    public void setChucVu(boolean chucVu) {
        this.chucVu = chucVu;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "IDNhanVien=" + IDNhanVien +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", tenNhanVien='" + tenNhanVien + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", ngaySinh=" + ngaySinh +
                ", caLam='" + caLam + '\'' +
                ", luong=" + luong +
                ", sdt='" + sdt + '\'' +
                ", chucVu=" + chucVu +
                ", trangThai=" + trangThai +
                '}';
    }
}

