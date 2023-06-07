package day20statickeywordconstructors;

public class TekrarCar {
    String yapim ="Honda";

    String model="Civic";

    int yil=2003;

    boolean hybrid =false;

    public TekrarCar(String yapim, String model, int yil, boolean hybrid) {
        this.yapim = yapim;
        this.model = model;
        this.yil = yil;
        this.hybrid = hybrid;
    }

    @Override
    public String toString() {
        return "TekrarCar{" +
                "yapim='" + yapim + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", hybrid=" + hybrid +
                '}';
    }

    public TekrarCar(String yapim, String model, int yil) {
        this.yapim = yapim;
        this.model = model;
        this.yil = yil;
    }
}
