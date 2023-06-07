package day20statickeywordconstructors;

public class TekrarStdRunner {
    public static void main(String[] args) {
        TekrarStudent.hobileri();
        System.out.println(TekrarStudent.ogrenciIsmi);
        TekrarStudent ogrenci=new TekrarStudent();
        System.out.println(ogrenci.yas);
        ogrenci.adresi();


    }//Main
}
