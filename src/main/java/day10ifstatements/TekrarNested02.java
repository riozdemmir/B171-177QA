package day10ifstatements;

import java.util.Scanner;

public class TekrarNested02 {
    public static void main(String[] args) {
        /*
          Example 2:Kullanicidan bir ucgenin kenar uzunluklarini aliniz
                    Uc kenari birbirine esit ise "Eskenar Ucgen " yazdiriniz
                    Sadece iki kenar uzunlugu biribirine esit ise "Ikizkenar ucgen"
                    Tum kenarlari birbirinden farkli ise "Cesitkenar Ucgen" yazdiriniz
        */
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen üç kenar uzunluğu giriniz..");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();


        boolean ucgenMii= a+b>c && c>Math.abs(a-b) &&
                b+c>a && a>Math.abs(b-c) && a+c>b && b>Math.abs(a-c);
if (a<=0 || b<=0 || c<=0){
    System.out.println("Lütfen geçerli kenar uzunluğu gir");

}else if (ucgenMii){
            if (a==b && b==c && a==c){
                System.out.println("Eşkenar üçgen");
            } else if (a==b || b==c || a==c) {
                System.out.println("Ikizkenar üçgen");
            }else {
                System.out.println("Çeşitkenar üçgensin");
            }

        } else {
            System.out.println("Üçgen değilsin..");

        }


    }
}
