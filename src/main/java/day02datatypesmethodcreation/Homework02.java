package day02datatypesmethodcreation;

public class Homework02 {
    public static void main(String[] args) {
        int alanHesabi = dikdortgenAlan(12,6);
        System.out.println(alanHesabi);

        int cevreHesabi = dikdortgenCevre(12,6);
        System.out.println(cevreHesabi);

        // Day02 Tekrar
        int toplamaSonucu = (toplamaYap(45, 100));
        System.out.println(toplamaSonucu);

        int carpmaSonucu = carpmaYap(45,12);
        System.out.println(carpmaSonucu);

        int islemSonucu = (matematikselIslem(4,6,8));
        System.out.println(islemSonucu);
    }

    /*
    1) Dikdortgenin alanını hesaplayan yöntemi oluşturduğunuz ve kullandığınız
    2) Dikdortgenin cevresini hesaplayan yöntemi olusturun ve kullaniniz.

     */
    public static int dikdortgenAlan(int a, int b) {

     return a*b;
    }
    public static int dikdortgenCevre(int a, int b ){
        return 2*(a+b);
    }
    /*
    <<<<Day02 Tekrar>>>
    Ornek 1: Toplama islemi yapan bir method olusturup yazdırınız.
    */
    public static int toplamaYap(int x, int y){
        return x+y;
    }
    //Ornek 2: 2 sayiyi carpma islemi yapan bir method olusturunuz
    public static int carpmaYap(int a, int b){
        return a*b;
    }
    //Ornek 3:  carpma ve bölme islemi yapan bir method olusturup yazdiriniz.
    public static int matematikselIslem(int x, int y, int z){
        return (x*y)/z;
    }



}
