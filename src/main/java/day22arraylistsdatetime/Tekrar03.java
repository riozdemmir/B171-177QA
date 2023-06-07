package day22arraylistsdatetime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tekrar03 {
    public static void main(String[] args) {
         /*
   Example 1: Kullanicinin girdigi harf list'te var ise o harfi "Buldum!" a cevirin, yok ise o harfi list'e ekleyin

   String class kullanmak tercih edilir cunku string class method acisindan cok zengindir
    */
        List<String> myList=new ArrayList<>();
        myList.add("D");
        myList.add("B");
        myList.add("Z");
        Scanner input=new Scanner(System.in);

        int counter=0;
      do {if (counter==3){
          System.out.println("Oyun bittii..");
          break;
      }
          System.out.println("Lütfen bir harf giriniz");
          String harf=input.next().toUpperCase().substring(0,1);
          if (myList.contains(harf)){
              System.out.println(myList.set(myList.indexOf(harf),"Buldumm!"));
          }else {
              myList.add(harf);
          }
          System.out.println(myList);

        counter++;
      }while (true);




    }
}
