package Model;

public class Grade {
    private int id;
    private  SinhVien sv;
    private  double anhVan,tinHoc,Gdtc;

    public Grade() {

    }

    public Grade(int id, SinhVien sv, double anhVan, double tinHoc, double gdtc) {
        this.id = id;
        this.sv = sv;
        this.anhVan = anhVan;
        this.tinHoc = tinHoc;
        Gdtc = gdtc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SinhVien getSv() {
        return sv;
    }

    public void setSv(SinhVien sv) {
        this.sv = sv;
    }

    public double getAnhVan() {
        return anhVan;
    }

    public void setAnhVan(double anhVan) {
        this.anhVan = anhVan;
    }

    public double getTinHoc() {
        return tinHoc;
    }

    public void setTinHoc(double tinHoc) {
        this.tinHoc = tinHoc;
    }

    public double getGdtc() {
        return Gdtc;
    }

    public void setGdtc(double gdtc) {
        Gdtc = gdtc;
    }

    public double getTbc() {
        return (getAnhVan()+getTinHoc()+getGdtc())/3;
    }
    public String getXepLoai(){
        String string="";
        double tbc=getTbc();
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
