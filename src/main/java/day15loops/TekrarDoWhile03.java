package day15loops;

import java.util.Scanner;

public class TekrarDoWhile03 {
    public static void main(String[] args) {

         /*
        Gecerli Username="admin" ve Password="pwd123" dur.
        Kullanicidan username ve password'u alin.
        Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
        Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
        Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz
 */
        Scanner input= new Scanner(System.in);
        int counter=0;

        do {
            if (counter==3){
                System.out.println("Hesap bloke olmuştur..");
                break;
            }

            System.out.println("Lütfen username giriniz");
            String userName=input.next();
            System.out.println("Lütfen passwordunuzu giriniz..");
            String password=input.next();
            if (userName.equals("admin")&&password.equals("pwd123")){
                System.out.println("Hesabınıza hoşgeldiniz..");
                break;

            }
            counter++;

        }while (true);


    }
}
