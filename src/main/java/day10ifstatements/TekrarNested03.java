package day10ifstatements;

import java.util.Scanner;

public class TekrarNested03 {
    public static void main(String[] args) {
         /*
                Password'un ilk harfi buyuk harf ise

                    'A' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    Adana ==> Gecerli

                Passwordun ilk harfi kucuk harf ise

                    'z' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    zehirli ==> Gecerli
        */

        //Note: Eger bir methodu tekrar tekrar kullanmak istiyorsaniz onu bir variable a atayarak kullanmak daha makuldur.

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen parola giriniz");
        String prl = input.nextLine();
        char r1= prl.charAt(0);
        if (r1>='A' && r1<='Z'){
            if (r1=='A'){
                System.out.println("Geçerli parola girdiniz..");
            }else {
                System.out.println("Geçersiz parola girdiniz.. ");
            }
        } else if (r1>='a' && r1<='z') {
            if (r1=='a'){
                System.out.println("Geçerli parola girdiniz..");
            }else {
                System.out.println("Geçersiz parola girdiniz..");
            }

        }else {
            System.out.println("Lütfen ilk karakter harf olsun");
        }

    }//main
}//class
