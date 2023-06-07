package day05concatinationoperatortypecasting;

public class Practic05TypeCasting {
    public static void main(String[] args) {


        //byte data type ini int data type ina ceviriniz
        byte a = 12;
        int aInt = a;//AutoWedding denir bu işleme.

        //int data type ini short data typeina ceviriniz
        int s = 200;
        short Shorts = (short) s;// Bu işlemin adı da Explicit Narrowing dir.

        //int data type ini float data typina cevirinz
        int nufus = 7500;
        float nufusFloat = nufus;
        System.out.println(nufusFloat);

        //double data type ini short data type ina ceviriniz
        double doubleF = 12.99;
        System.out.println(doubleF);//12.99
        short shortF = (short) doubleF;
        System.out.println(shortF);//12 yazdırır.

        //Ornek
        short num = 260;
        System.out.println(num);//260
        byte numByt = (byte) num;
        System.out.println(numByt);// 260 ayısı -127 ila +127 sınırları içerisinde olmadığı için java verilen sayı ile mod işlemi
                                   // yapar sonucu yazdırır. 260/256 kalan 4 o yüzden 4 yazdırır.

    }
}
