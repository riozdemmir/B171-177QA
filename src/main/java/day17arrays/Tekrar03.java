package day17arrays;

import java.util.Arrays;

public class Tekrar03 {
    public static void main(String[] args) {
        //Specific bir elemanin array de olup olmadigini anlamak icin gereken kodu yaziniz.
        String names[] = {"K", "C", "R", "A", "S"};
        String el = "R";

        int sayac=0;
        for (String w:names) {
            if (w.equals(el)){
                sayac++;
                break;
            }
        }
        if (sayac>0){
            System.out.println("Array has "+el);
        }else {
            System.out.println("Array does not have "+el);
        }
        //2.Way
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        int result =Arrays.binarySearch(names,el);
        if (result<0){
            System.out.println("Array does not have "+el);

        }else {
            System.out.println("Array has "+el);
        }
        System.out.println(Arrays.binarySearch(names, "A"));
        System.out.println(Arrays.binarySearch(names, "B"));
        System.out.println(Arrays.binarySearch(names, "K"));


    }//Main
}
