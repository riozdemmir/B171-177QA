package day16arraysforeachloop;

import java.util.Arrays;

public class Tekrar03 {
    public static void main(String[] args) {

        //Ornek 1: Integer bir array olusturunuz, icine 6 tane eleman yerlestiriniz.
        // Bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz
        int asd []=new int[6];
        asd[0]=12;
        asd[1]=58;
        asd[2]=27;
        asd[3]=96;
        asd[4]=47;
        asd[5]=68;
        System.out.println(Arrays.toString(asd));
        //1.Yol
        Arrays.sort(asd);
        System.out.println(Arrays.toString(asd));
        System.out.println(asd[0] + asd[asd.length - 1]);

        //2.yol

        int minimum =asd[0];
        int maximum =asd[0];
                //[12, 58, 27, 96, 47, 68]

        for (int w:asd){

            minimum=Math.min(minimum,w);
            maximum=Math.max(maximum,w);

        }
        System.out.println(minimum);
        System.out.println(maximum);
        System.out.println(minimum + maximum);

        //Ornek 2: String bir array olusturunuz 6 eleman ekleyiniz, sarı dan onceki elemanlari yaziriniz

        String renkler []=new String[6];
        renkler[0]="Mor";
        renkler[1]="Sarı";
        renkler[2]="Yeşil";
        renkler[3]="Kırmızı";
        renkler[4]="Mavi";
        renkler[5]="Beyaz";
        System.out.println(Arrays.toString(renkler));
        for (String w :renkler  ) {
            if (w.equals("Sarı")){
                break;
            }
            System.out.println(w);
        }

    }
}
