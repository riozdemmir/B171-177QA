package day04scannerwrapper;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {

        //homework
        //1) Kullanicidan aldiginiz 3 tane sayinin ortalamasini bulan kodu yaziniz
        //ornegin => 3,5,7 icin ortalama (3+5+7)/3=5

        //2) Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz
        // ornegin => 312 icin 3+1+2=6

        Scanner input = new Scanner(System.in);
        System.out.println(" 3 adet sayı giriniz");

        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();
        double thirdNumber = input.nextDouble();
        System.out.println((firstNumber+secondNumber+thirdNumber)/3);

        System.out.println("Lütfen 3 basamaklısayı giriniz");

        int number = input.nextInt();

        int birlerBasamagi = number%10;
        number = number/10;

        int onlarBasamagi = number%10;
        number = number/10;

        int yuzlerBasamagi = number%10;


        System.out.println(birlerBasamagi+onlarBasamagi+yuzlerBasamagi);




    }
}
