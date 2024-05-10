/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.NhanVien;
import Service.InterfaceNhanVien;
import Util.DBconnect;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class NhanVienRepository implements InterfaceNhanVien {

    @Override
    public List<NhanVien> getAll() {
        List<NhanVien> lists = new ArrayList<>();
        String sql = "SELECT [IDNhanVien]\n"
                + "      ,[UserName]\n"
                + "      ,[PassWord]\n"
                + "      ,[TenNhanVien]\n"
                + "      ,[DiaChi]\n"
                + "      ,[GioiTinh]\n"
                + "      ,[NgaySinh]\n"
                + "      ,[CaLam]\n"
                + "      ,[Luong]\n"
                + "      ,[SDT]\n"
                + "      ,[ChucVu]\n"
                + "      ,[TrangThai]\n"
                + "  FROM [dbo].[NhanVien] WHERE TrangThai = 1 ";
        try (Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1); // Lấy giá trị từ cột đầu tiên (cột IDNhanVien)
                String userName = rs.getString(2); // Lấy giá trị từ cột thứ hai (cột UserName)
                String password = rs.getString(3); // Lấy giá trị từ cột thứ ba (cột PassWord)
                String tenNhanVien = rs.getString(4); // Lấy giá trị từ cột thứ tư (cột TenNhanVien)
                String diaChi = rs.getString(5); // Lấy giá trị từ cột thứ năm (cột DiaChi)
                boolean gioiTinh = rs.getBoolean(6); // Lấy giá trị từ cột thứ sáu (cột GioiTinh)
                Date ngaySinh = rs.getDate(7); // Lấy giá trị từ cột thứ bảy (cột NgaySinh)
                String caLam = rs.getString(8); // Lấy giá trị từ cột thứ tám (cột CaLam)
                double luong = rs.getDouble(9); // Lấy giá trị từ cột thứ chín (cột Luong)
                String sdt = rs.getString(10); // Lấy giá trị từ cột thứ mười (cột SDT)
                Boolean chucVu = rs.getBoolean(11); // Lấy giá trị từ cột thứ mười một (cột ChucVu)
                boolean trangThai = rs.getBoolean(12); // Lấy giá trị từ cột thứ mười hai (cột TrangThai)

                // Tạo đối tượng NhanVien từ dữ liệu lấy từ ResultSet
                NhanVien nv = new NhanVien(id, userName, password, tenNhanVien, diaChi, gioiTinh, ngaySinh, caLam, luong, sdt, chucVu, trangThai);
                lists.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lists;
    }
    
    public static void main(String[] args) {
       NhanVienRepository nhanVienRepository = new NhanVienRepository();
        System.out.println(nhanVienRepository.getAll().toString());
    }

}
