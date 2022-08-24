package Model;

public class Grade {
    private int id;
    private Student sv;
    private  double math, physical, chemistry;

    public Grade() {

    }

    public Grade(int id, Student sv, double math, double physical, double chemistry) {
        this.id = id;
        this.sv = sv;
        this.math = math;
        this.physical = physical;
        this.chemistry = chemistry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getSv() {
        return sv;
    }

    public void setSv(Student sv) {
        this.sv = sv;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhysical() {
        return physical;
    }

    public void setPhysical(double physical) {
        this.physical = physical;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public double getAverage() {
        return (getMath()+ getPhysical()+ getChemistry())/3;
    }
    public String getRank(){
        String string="";
        double tbc= getAverage();
        if (tbc>8){
            string="very good";
        } else if (tbc>=7) {
            string=" good";
        } else if (tbc>=5) {
            string="average";
        }else {
            string="fail";
        }
        return string;
    }
}
