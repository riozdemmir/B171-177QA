package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Tekrar03 {
    public static void main(String[] args) {
        //Example 1: Kulanicidan iki sayi ve yapilacak islemi alan
        // ve +, -, *, /, % islemlerini yapan kodu yaziniz
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen ilk sayıyı giriniz..");
        double say1=input.nextDouble();
        System.out.println("Lütfen ikinci sayıyı giriniz..");
        double say2=input.nextDouble();
        System.out.println("Yapilacak islemi giriniz.  +, -, *, /, %  dan birini seciniz..");
        char opr = input.next().charAt(0);
        switch (opr){
            case '+' :
                System.out.println(say1 +" + " +say2+ " = " + (say1 + say2));
                break;
            case '*' :
                System.out.println(say1 +" * " +say2+ " = " + (say1 * say2));
                break;
            case '/':
                System.out.println(say1 +" / " +say2+ " = " + (say1 / say2));
                break;
            case '-' :
                System.out.println(say1 +" - " +say2+ " = " + (say1 - say2));
                break;
            case '%':
                System.out.println(say1 +" % " +say2+ " = " + (say1 * say2/100));
                break;
            default:
                System.out.println("Geçerli bir işlem giriniz..");
        }



    }//Main
}
