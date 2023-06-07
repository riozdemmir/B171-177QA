package day14loops;

import java.util.Scanner;

public class Tekrar03 {
    public static void main(String[] args) {
          /*   Example 1: Kullanicidan baslangic ve bitis degerlerini alin.
             Baslangic degerinden baslayip bitis degerine kadar aradaki tum cift tamsayilari ekrana yazdiriniz
             9 - 14 ==> 10  12  14     */
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen başangıç değerini giriniz..");
        int start=input.nextInt();
        System.out.println("bitiş değerini gininiz..");
        int end=input.nextInt();
        if (start>end){
            System.out.println("Başlangıç değeri bitiş değerinden biyik olamaz.");
        }else {
            for (int i = start; i <=end ; i++) {
                if (i%2==0){
                    System.out.print(i+" ");
                }

            }
        }

        //Ornek 2 : Hic sayi kullanmadan 1 den 100 e kadar olan sayilari console a yazdiriniz
        for (int i = 'd'/'d'; i <='d' ; i++) {
            System.out.print(i+" ");
        }


    }
}
