package day14loops;

import java.util.Scanner;

public class TekrarNestedLoops02 {
    public static void main(String[] args) {
         /*
              Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                    X X X X X
                    X X X X X
                    X X X X X        */
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen satir sayısını gir");
        int satir=input.nextInt();
        System.out.println("sütun sayısını gir");
        int sutun=input.nextInt();
      for (int i=1;i<=satir ;i++){

          for (int k =1;k<=sutun;k++){
              System.out.print(" X");
          }
          System.out.println();

      }

    }
}
