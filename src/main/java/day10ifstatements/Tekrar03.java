package day10ifstatements;

import java.util.Scanner;

public class Tekrar03 {
    public static void main(String[] args) {
        //Example 1: Ay isimleri girilince kacinci ay oldugunu yazan kodu yaziniz.
        //January ==> 1...

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen bir ay ismi giriniz..");
        String ayIsmi = input.nextLine();

        if (ayIsmi.equalsIgnoreCase("Ocak")){
            System.out.println(1);

        }else if (ayIsmi.equalsIgnoreCase("Şubat")){
            System.out.println(2);
        }else if (ayIsmi.equalsIgnoreCase("Mart")){
            System.out.println(3);
        }else if (ayIsmi.equalsIgnoreCase("Nisan")){
            System.out.println(4);
        }else if (ayIsmi.equalsIgnoreCase("Mayıs")){
            System.out.println(5);
        }else if (ayIsmi.equalsIgnoreCase("Haziran")){
            System.out.println(6);
        }else if (ayIsmi.equalsIgnoreCase("Temmuz")){
            System.out.println(7);
        }else if (ayIsmi.equalsIgnoreCase("Ağustos")){
            System.out.println(8);
        }else if (ayIsmi.equalsIgnoreCase("Eylül")){
            System.out.println(9);
        }else if (ayIsmi.equalsIgnoreCase("Ekim")){
            System.out.println(10);
        }else if (ayIsmi.equalsIgnoreCase("Kasım")){
            System.out.println(11);
        }else if (ayIsmi.equalsIgnoreCase("Aralık")){
            System.out.println(12);
        }else {
            System.out.println("Lütfen geçerli ay ismi giriniz");
        }


    }
}
