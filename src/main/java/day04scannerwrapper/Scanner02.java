package day04scannerwrapper;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        //Ornek : kullanıcıdan adresini alınız ve ekrana yazdırınız..

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen adresinizi giriniz");

        //nextLine() methodu kullanıcıdan ok kelimeli string almak için kullanılır.
        String address = input.nextLine();

        System.out.println(address);

    }
}
