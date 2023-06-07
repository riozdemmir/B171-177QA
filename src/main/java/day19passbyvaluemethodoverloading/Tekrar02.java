package day19passbyvaluemethodoverloading;

public class Tekrar02 {
    public static void main(String[] args) {
        String isim ="Ridvan Özdemir";
        System.out.println(unvanEkle("Dr", isim));
        System.out.println(isim);
        isim=unvanEkle("Dr",isim);
        System.out.println(isim);


    }//Main
    public static String unvanEkle(String unvan, String isim){
       isim= unvan+" "+isim;
       return isim;
    }



}
