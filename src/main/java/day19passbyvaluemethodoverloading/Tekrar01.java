package day19passbyvaluemethodoverloading;

public class Tekrar01 {
    public static void main(String[] args) {
        int gomlerFiyati=100;
        System.out.println(indirim("Engelli", gomlerFiyati));
        System.out.println(indirim("Yasli", gomlerFiyati));
        System.out.println(indirim("Engelli", gomlerFiyati));

        System.out.println(gomlerFiyati);


    }//Main
    public static int indirim(String type, int fiyat){
        switch (type){
            case "Ogrenci" :
                fiyat=fiyat-20;
                break;
            case "Yasli" :
                fiyat=fiyat-10;
                break;
            case "Engelli" :
                fiyat=fiyat-30;
                break;
            default:
                fiyat=fiyat;
        }
        return fiyat;


    }
}
