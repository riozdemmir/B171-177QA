package day13loops;

public class Tekrar01 {
    public static void main(String[] args) {
        //Ornek 1: Ekrana 5 kere "Hi" yazdiriniz
        for (int i = 1; i <6 ; i++) {
            System.out.println("Hello");
        }

        //Ornek 2: 11 den 14 e kadar tum sayilari ekrana yazdiran kodu yaziniz
        for (int i = 11; i <15 ; i++) {
            System.out.println(i);
        }
        System.out.println();
        //Ornek 3: 40 dan 23 e kadar tum cift sayilari ekrana yazdiriniz.
        for (int i = 40; i >22 ; i--) {
            if (i%2==0)
                System.out.print(i+" ");
        }
        System.out.println();
        //Ornek 4: 18 den 56 ya kadar tum tek sayilari ekrana yazdiran kodu yaziniz.
        for (int i = 18; i <57 ; i++) {
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }




    }
}
