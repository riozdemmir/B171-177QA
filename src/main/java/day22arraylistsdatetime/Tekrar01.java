package day22arraylistsdatetime;

import java.util.List;

public class Tekrar01 {
    public static void main(String[] args) {
        //Ornek 1: Bir listteki tekrarsiz elemanlari console a yazdiran kodu yaziniz
        List<Double> fiyatlar=List.of(3.5,4.5,2.5,1.5,3.5,1.5);
        for (double w:fiyatlar) {
            if (fiyatlar.indexOf(w)==fiyatlar.lastIndexOf(w)){
                System.out.println(w);
            }
        }

        //Ornek 2: Bir listte tekrarli eleman olup olmadigini bulan kodu yaziniz
        List<Integer> heights = List.of(3, 13, 33);

        int sayac=0;
        for (Integer w:heights) {
            if (heights.indexOf(w)!=heights.lastIndexOf(w)){
                sayac++;
                break;
            }
        }
        if (sayac==0){
            System.out.println("Bu listte tekralı eleman yoktur");
        }else {
            System.out.println("Bu listte tekrarlı eleman vardır..");
        }







    }
}
