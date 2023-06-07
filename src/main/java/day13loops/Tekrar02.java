package day13loops;

public class Tekrar02 {
    public static void main(String[] args) {
        //Ornek 1: 21 den 180 e kadar hem 2 hemde 3 ile bolunebilen tamsayilari ekrana yazdiriniz
        for (int i = 21; i <181 ; i++) {
            if (i%2==0 && i%3==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        //Ornek 2: Size verilen kucuk harfle yazilmis String in index i cift sayi olan characterlerini
        // buyuk harfe donusturen kodu yaziniz
        //      manisa  ==> MNS

        String a = "manisa";


        for (int i = 0; i <a.length() ; i++) {
            String ch =a.substring(i,i+1);
            if (i%2==0){
                System.out.print(ch.toUpperCase());
            }

        }
        System.out.println();
        //Ornek 3: Verilen bir string de ilk a harfinden onceki tum characterleri console a yazdiriniz
        //   "I love Java"  ==> "I love J"
        String b = "Rıdvan Özdemir"; //Rıdv
        for (int i = 0; i < b.length(); i++) {
            char ch2=b.charAt(i);
            if (ch2=='a'){
               break;
            }
            System.out.print(ch2);
        }
        System.out.println();
        //Ornek 4: Verilen bir string te son 'a' dan sonraki tum characterleri ters sirada yazdiriniz
        //  "Germany"  ==>  yn
        String c = "Turkey";
        for (int i = c.length()-1; i>=0 ; i--) {

            if (c.charAt(i)=='k'){
                break;
            }

            System.out.print(c.charAt(i));
        }


    }
}
