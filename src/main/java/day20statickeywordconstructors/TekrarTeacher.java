package day20statickeywordconstructors;

public class TekrarTeacher {
    String isim;

    String adres;

    int yas;


    public TekrarTeacher(String isim, String adres, int yas) {
        this.isim = isim;
        this.adres = adres;
        this.yas = yas;
    }
    public TekrarTeacher(String isim, int yas){
        this.isim=isim;
        this.yas=yas;
    }

    @Override
    public String toString() {
        return "TekrarTeacher{" +
                "isim='" + isim + '\'' +
                ", adres='" + adres + '\'' +
                ", yas=" + yas +
                '}';
    }
}
