package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Tekrar04 {
    public static void main(String[] args) {
         /*
             Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
            Type code to print abbreviation(Kisaltma) of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"

            kullanicidan bir ulke ismi aliniz. Alinan ulke adina gore kisaltmalari yazdiriniz.
         */
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen bir ülke ismi giriniz..");
        String countryName = input.nextLine();
        switch (countryName.toLowerCase()){
            case "america":
                System.out.println("US");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "turkey":
                System.out.println("TR");
                break;
            case "peru":
                System.out.println("PE");
                break;
            case "fransa":
                System.out.println("FR");
                break;
            default:
                System.out.println("Lütfen tanımlı bir ülke ismi giriniz..");
        }

    }//Main
}
