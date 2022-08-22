package Model;

import java.util.Date;

public class SinhVien {
    private String maSv;
    private String tenSv;
    private Date ngaySinh;
    private boolean gioiTinh;
    private  String diaChi;
    private String image;

    public SinhVien(String maSv, String tenSv, Date ngaySinh, boolean gioiTinh, String diaChi) {
        this.maSv = maSv;
        this.tenSv = tenSv;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }
    public SinhVien(){

    }
    public String getMaSv() {
        return maSv;
    }
    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }
    public String getTenSv() {
        return tenSv;
    }
    public void setTenSv(String tenSv) {
        this.tenSv = tenSv;
    }
    public Date getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public boolean isGioiTinh() {
        return gioiTinh;
    }
    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
}
