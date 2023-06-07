package day20statickeywordconstructors;

public class TekrarCarRunner {
    public static void main(String[] args) {
        TekrarCar arabam =new TekrarCar("Honda","Civic",2003,false);
        System.out.println(arabam);
        TekrarCar arabam2=new TekrarCar("Honda","Civic",2003);

        System.out.println(arabam2);


    }
}
