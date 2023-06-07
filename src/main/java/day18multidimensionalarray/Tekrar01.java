package day18multidimensionalarray;

import java.util.Arrays;

public class Tekrar01 {
    public static void main(String[] args) {
        //Multidimensional Array nasil olusturulur?
    int arr[][]=new int[3][2];
        System.out.println(Arrays.deepToString(arr));
        //MultiDimensional Array lere eleman nasil eklenir?
        arr[0][0]=13;
        arr[0][1]=45;
        arr[1][0]=67;
        arr[1][1]=20;
        arr[2][0]=10;
        arr[2][1]=8;
        System.out.println(Arrays.deepToString(arr));//[[13, 45], [67, 20], [10, 8]]
        //Multidimensional Array icinden specific bir eleman nasil yazdirilir.
        System.out.println(arr[0][1]);
        //Multidimensional Array icindeki array nasil yazdirilir?
        System.out.println(Arrays.toString(arr[2]));
        //Kisa yoldan Multidimensional array nasil olusturulur?
        String cc[][]={{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};
        System.out.println(Arrays.deepToString(cc));

        //Ornek 1: Yukaridaki students arrayinde toplam kac tane isim oldugun bulunuz
        System.out.println(cc.length);
        int sum=0;
        for (String[] w:cc) {
            sum+=w.length;

        }
        System.out.println(sum);

    }//Main
}
