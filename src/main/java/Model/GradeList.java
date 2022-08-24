package Model;

import java.util.ArrayList;
import java.util.List;

public class GradeList {
    List<Grade> grades =new ArrayList<>();
    public int add(Grade d){
        grades.add(d);
        return 1;
    }
    public List<Grade> getAllGrade(){
        return grades;
    }
    public  Grade getOneGradeById(String maSv){
        for (Grade g: grades){
            if (g.getSv().getIdStudent().equalsIgnoreCase(maSv)){
                return g;
            }
        }
        return null;
    }
    public int updateGrade(Grade dNew){
        for (Grade d: grades){
            if (d.getSv().getIdStudent().equalsIgnoreCase(dNew.getSv().getIdStudent())){
                d.setMath(dNew.getMath());
                d.setPhysical(dNew.getPhysical());
                d.setChemistry(dNew.getChemistry());
                return 1;
            }
        }
        return -1;
    }
    public  int delGrade(String maSv){
       Grade d=getOneGradeById(maSv);
       if (d!=null){
           grades.remove(d);
           return  1;
       }
        return  -1;
    }
    public  Grade getPosition(int pos){
        return grades.get(pos);
    }
}
