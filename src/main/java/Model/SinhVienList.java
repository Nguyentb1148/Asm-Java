package Model;

import java.util.ArrayList;
import java.util.List;

public class SinhVienList {
        public static List<Student> students =new ArrayList<>();
        public int add(Student student){
                students.add(student);
                return  1;
        }
        public List<Student> getAllSinhVien(){
                return students;
        }
        public int deleteSinhVienById(String id){
                for (Student sv: students){
                        if (sv.getIdStudent().equalsIgnoreCase(id)){
                                students.remove(sv);
                                return  1;
                        }
                }
                return -1;
        }
        public Student getSinhVienById(String id){
                for (Student sv: students){
                        if (sv.getIdStudent().equalsIgnoreCase(id)){
                                return sv;
                        }
                }
                return null;
        }
        public int updateStudentById(Student student){
                 for (Student sv: students){
                         if (sv.getIdStudent().equalsIgnoreCase(student.getIdStudent())){
                                 sv.setNameStudent(student.getNameStudent());
                                 sv.setBirthday(student.getBirthday());
                                 sv.setSex(student.isSex());
                                 sv.setAddress(student.getAddress());
                                 return 1;
                         }
                 }
                return -1;
        }
}
