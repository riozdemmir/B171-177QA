package day15loops;

import java.util.Scanner;

public class TkrrWhileLoop02 {
    public static void main(String[] args) {

        //Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
/*            3 ==> 3x1=3
                    3x2=6
                    3x3=9
                    3x4=12 ...
                    3x10=30
                    */
        Scanner input=new Scanner(System.in);
        System.out.println("sayı gir");
       int num= input.nextInt();
        int i=1;
        while (i<11){
            System.out.println(num+" x "+i+" = "+num*i);
            i++;
        }


    }
}
