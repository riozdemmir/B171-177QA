package day17arrays;

import java.util.Arrays;

public class Tekrar05 {
    public static void main(String[] args) {
        //Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz  [2, 3, 12, 0, 0, 0]
        int arr[]={0,2,3,0,12,0};
        int brr[]=new int[arr.length];
        System.out.println(Arrays.toString(brr));
int idx=0;
        for (int w:arr) {
            if (w!=0){
                brr[idx]=w;
                idx++;
            }
        }

        System.out.println(Arrays.toString(brr));


    }
}
