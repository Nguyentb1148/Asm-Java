package Model;

import java.util.ArrayList;
import java.util.List;

public class SinhVienDAO {
        List<SinhVien> ls=new ArrayList<>();
        public int add(SinhVien sinhVien){
                ls.add(sinhVien);
                return  1;
        }
        public List<SinhVien> getAllSinhVien(){
                return ls;
        }
        public int deleteSinhVienById(String id){
                for (SinhVien sv:ls){
                        if (sv.getMaSv().equalsIgnoreCase(id)){
                                ls.remove(sv);
                                return  1;
                        }
                }
                return -1;
        }
        public  SinhVien getSinhVienById(String id){
                for (SinhVien sv:ls){
                        if (sv.getMaSv().equalsIgnoreCase(id)){
                                return sv;
                        }
                }
                return null;
        }
        public int updateStudentById(SinhVien sinhVien){
                 for (SinhVien sv:ls){
                         if (sv.getMaSv().equalsIgnoreCase(sinhVien.getMaSv())){
                                 sv.setTenSv(sinhVien.getTenSv());
                                 sv.setNgaySinh(sinhVien.getNgaySinh());
                                 sv.setGioiTinh(sinhVien.isGioiTinh());
                                 sv.setDiaChi(sinhVien.getDiaChi());
                                 return 1;
                         }
                 }
                return -1;
        }
}
