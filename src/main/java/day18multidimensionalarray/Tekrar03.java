package day18multidimensionalarray;

import java.util.Arrays;

public class Tekrar03 {
    public static void main(String[] args) {
        //Ornek : Iki boyutlu bir arrayi tek boyutlu bir array e ceviriniz
         int numbers[][] = {{5, 4}, {2, 3, 2}};//==> {5,4,2,3,2}
        System.out.println(Arrays.deepToString(numbers));
       int topEleman=0;
        for (int[] w:numbers) {

            topEleman+=w.length;
        }
        System.out.println(topEleman);

        int yeniArr[]=new int[topEleman];
        System.out.println(Arrays.toString(yeniArr));

        int idx=yeniArr.length-1;
        for (int[] w:numbers) {

            for (int k:w ) {

                yeniArr[idx]=k;
                idx--;
            }

        }
        System.out.println(Arrays.toString(yeniArr));

    }
}
