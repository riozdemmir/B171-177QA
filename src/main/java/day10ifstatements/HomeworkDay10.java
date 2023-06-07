package day10ifstatements;

import java.util.Scanner;

public class HomeworkDay10 {
    public static void main(String[] args) {
        /*
    Homework
    1)Kullanicidan alinan password "pwd123!" oldugunda verilen password un dogru olup olmadigini kontrol eden ve kullaniciya
    uygun mesaj veren kodu yaziniz

    2)Haftanin gun ismini verdiginizde kacinci gun oldugunu veren kodu yaziniz
    Pazar ==> 1. gun , Pazartes ==> 2. gun...

    3)Ay sayisini verdiginizde ay ismini veren kodu yaziniz
    1==>January , 2==> February
 */
        //Cevap 1:
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen Parolanızı giriniz..");
        String prl = input.nextLine();
        if (prl.equalsIgnoreCase("pwd123!")){
            System.out.println("Parolanız geçerli..");

        } else{
            System.out.println("Geçersiz parola..");
        }

        //Cevap 2:
        System.out.println("Lütfen bir gün ismi giriniz..");
        String dayName = input.nextLine();
        if (dayName.equalsIgnoreCase("Pazartesi")){
            System.out.println(1);
        } else if (dayName.equalsIgnoreCase("Salı")) {
            System.out.println(2);
        }else if (dayName.equalsIgnoreCase("Çarşamba")) {
            System.out.println(3);
        }else if (dayName.equalsIgnoreCase("Perşembe")) {
            System.out.println(4);
        }else if (dayName.equalsIgnoreCase("Cuma")) {
            System.out.println(5);
        }else if (dayName.equalsIgnoreCase("Cumartesi")) {
            System.out.println(6);
        }else if (dayName.equalsIgnoreCase("Pazar")) {
            System.out.println(7);
        }else {
            System.out.println("Geçersiz gün ismi girdiniz");
        }

        //Cevap 3:
        System.out.println("Lütfen kaçıncı ay olduğunu giriniz..");
        byte monthNumber= input.nextByte();
        if (monthNumber==1){
            System.out.println("Ocak");
        } else if (monthNumber==2) {
            System.out.println("Şubat");
        }else if (monthNumber==3) {
            System.out.println("Mart");
        }else if (monthNumber==4) {
            System.out.println("Nisan");
        }else if (monthNumber==5) {
            System.out.println("Mayıs");
        }else if (monthNumber==6) {
            System.out.println("Haziran");
        }else if (monthNumber==7) {
            System.out.println("Temmuz");
        }else if (monthNumber==8) {
            System.out.println("Ağustos");
        }else if (monthNumber==9) {
            System.out.println("Eylül");
        }else if (monthNumber==10) {
            System.out.println("Ekim");
        }else if (monthNumber==11) {
            System.out.println("Kasım");
        }else if (monthNumber==12) {
            System.out.println("Aralık");
        }else {
            System.out.println("Geçersiz ay sayısı girdiniz.!");
        }


    }//Main
}//Class
