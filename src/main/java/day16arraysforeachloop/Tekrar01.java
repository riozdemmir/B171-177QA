package day16arraysforeachloop;

import java.util.Arrays;

public class Tekrar01 {
    public static void main(String[] args) {

        String ogrenciIsmi []=new String[3];

        ogrenciIsmi[0]="Ridvan";
        ogrenciIsmi[1]="Ali";
        ogrenciIsmi[2]="Adem";
        System.out.println(Arrays.toString(ogrenciIsmi));
        System.out.println(ogrenciIsmi[2]);

        //Ornek 1: Arraydeki her elemanin sonuna "!" isareti koyarak ekrana yazdiriniz.
        // length() string lerde method (parantezli), arraylerde ise parantezsiz yazilir(method degil)
        //  0       1       2
        //[Ridvan, Ali, Adem]
        for (int i = 0; i <ogrenciIsmi.length ; i++) {
            System.out.println(ogrenciIsmi[i]+" !");

        }



    }
}
