package day15loops;

public class TekrarDoWhile01 {
    public static void main(String[] args) {
        //Ornek 1: 5  den 3 e kadar tamsayilari console a yazdiriniz
        int i=5;
        while (i>2){
            System.out.println(i);
            i--;
        }
        System.out.println();
        //***********************************************************************

        int k= 5;
        do {
            System.out.print(k+" ");
            k--;
        }while (k>2);

    }//Main
}
