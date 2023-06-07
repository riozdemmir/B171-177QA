package day16arraysforeachloop;

public class Tekrar02 {
    public static void main(String[] args) {
        //Ornek 1 :  String array olusturun, icine 5 tane eleman ekleyin, ilk eleman ile
        // son elemanin icerdigi karakter sayilari toplamini ekrana yazdirin

        String arr []=new String[5];
        arr[0]="Türkçe";
        arr[1]="Matematik";
        arr[2]="Fen";
        arr[3]="Müzik";
        arr[4]="Beden";
        System.out.println(arr[3]);


        System.out.println(arr[0].length() + arr[arr.length - 1].length());


        //Ornek 2: String bir array olusturun, icine 5 tane eleman ekleyin,
        // tum elemanlarin icerdigi karakter sayilari toplamini ekrana yazdirin
        String bc []=new String[5];
        bc[0]="Manisa";
        bc[1]="Muş";
        bc[2]="Mardin";
        bc[3]="Edirne";
        bc[4]="Konya";

        int toplam=0;
        for (int i = 0; i <bc.length ; i++) {
          toplam=toplam+bc[i].length();
        }
        System.out.println(toplam);
        //2.Yol for each loop ile
        int sum=0;
        for (String  w : bc ){
            sum=sum+w.length();
        }

        System.out.println(sum);
        //Ornek 3: Notlar adında Integer bir Array olusturunuz içine 6 tabe not yerşetiriniz ve not
        // ortalamasını
        int notlar []=new int[6];
        notlar[0]=50;
        notlar[1]=20;
        notlar[2]=60;
        notlar[3]=80;
        notlar[4]=90;
        notlar[5]=70;

        int sum2 =0;
        for (int w :notlar ){

            sum2=w+sum2;
        }
        System.out.println(sum2/ notlar.length);




    }//Main
}
