package Model;

import java.util.ArrayList;
import java.util.List;

public class GradeDAO {
    List<Grade>ls=new ArrayList<>();
    public int add(Grade d){
        ls.add(d);
        return 1;
    }
    public List<Grade> getAllGrade(){
        return  ls;
    }
    public  Grade getOneGradeById(String maSv){
        for (Grade g:ls){
            if (g.getSv().getMaSv().equalsIgnoreCase(maSv)){
                return g;
            }
        }
        return null;
    }
    public int updateGrade(Grade dNew){
        for (Grade d:ls){
            if (d.getSv().getMaSv().equalsIgnoreCase(dNew.getSv().getMaSv())){
                d.setAnhVan(dNew.getAnhVan());
                d.setTinHoc(dNew.getTinHoc());
                d.setGdtc(dNew.getGdtc());
                return 1;
            }
        }
        return -1;
    }
    public  int delGrade(String maSv){
       Grade d=getOneGradeById(maSv);
       if (d!=null){
           ls.remove(d);
           return  1;
       }
        return  -1;
    }
}
