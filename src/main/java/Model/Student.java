package Model;

import java.util.Date;

public class Student {
    private String idStudent;
    private String nameStudent;
    private Date birthday;
    private boolean sex;
    private  String address;
    private String image;

    public Student(String idStudent, String nameStudent, Date birthday, boolean sex, String address) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
    }
    public Student(){
    }

    public Student(String idStudent, String nameStudent) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
    }

    public String getIdStudent() {
        return idStudent;
    }
    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }
    public String getNameStudent() {
        return nameStudent;
    }
    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public boolean isSex() {
        return sex;
    }
    public void setSex(boolean sex) {
        this.sex = sex;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
}
