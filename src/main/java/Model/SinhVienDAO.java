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
}
