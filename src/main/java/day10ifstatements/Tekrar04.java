package day10ifstatements;

import java.util.Scanner;

public class Tekrar04 {
    public static void main(String[] args) {
              /*
             Example 1:Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
                       asagidaki tabloya gore yazdiran kodu olusturunuz
                       0-4 ==> bebek
                       5-12 ==> cocuk
                       13-20 ==> genc
                       21-30 ==> yetiskin
                       30 ustu ==> Tanimlanmamis
                       Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz         */

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen bir yaş giriniz");
        int yas = input.nextInt();
        if (yas<0){
            System.out.println("Lütfen geçerli bir yaş giriniz");
        } else if (yas<5) {
            System.out.println("Bebek");
        }else if (yas<13) {
            System.out.println("Çocuk");
        }else if (yas<21) {
            System.out.println("Genç");
        }else if (yas<31) {
            System.out.println("Yetişkin");
        }else {
            System.out.println("Tanımlanmamış yaş girdiniz..");
        }




    }
}
