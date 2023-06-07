package day15loops;

public class TkrrWhileLoop01 {
    public static void main(String[] args) {
        //Ornek 1: 3 ten 6 ya kadar tam sayilari console a yazdiriniz
        for (int i = 3; i <7 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        //2.Yol While-loop ile çözüm

        int k=3;
        while (k<7){
            System.out.print(k+" ");
            k++;
        }
        System.out.println();
        //Ornek 2 : 23 den 12 ye kadar cift sayilari console a yazdiriniz
        int j =23;
        while (j>11){
            System.out.print(j+" ");
            j--;
        }
        System.out.println();
        //Ornek 3: 6 dan 19 a kadar tum tek sayilari console a yazdiriniz.
        int m =6;
        while (m<20){
            if (m%2!=0){
                System.out.print(m+" ");
            }
           m++;
        }



    }//Main
}
