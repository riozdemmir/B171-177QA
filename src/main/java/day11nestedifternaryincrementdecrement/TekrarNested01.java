package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class TekrarNested01 {
    public static void main(String[] args) {

        /*
           Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra

           Eger calisan kadin ise;
            60 yasindan buyukse "Emekli Olabilir "yazdirin

           Eger calisan erkek ise;
            65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
        */
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz..");
        String gender = input.next();
        System.out.println("Lütfen yaşınızı giriniz..");
        int age = input.nextInt();
        if (age<0 || age>120){
            System.out.println("Lütfen 0-120 arasında bir değer giriniz..");

        } else if (gender.equalsIgnoreCase("Kadın")) {
            if (age>60){
                System.out.println("Emekli olabilir..");
            }else {
                System.out.println("Emekli olamaz..");
            }
        }else if (gender.equalsIgnoreCase("Erkek")) {
            if (age>65){
                System.out.println("Emekli olabilir..");
            }else {
                System.out.println("Emekli olamaz..");
            }
        }else {
            System.out.println("Tanımlı değil..");
        }


    }//Main
}//Class
