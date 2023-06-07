package day14loops;

public class TekrarLoops01 {
    public static void main(String[] args) {
        // Verilen bir string i ters ceviren kodu yaziniz
        //"Java" ==> "avaJ"
        String a="Rıdvan";
        String ters="";

        for (int i = a.length()-1; i>=0 ; i--) {
            ters =ters+a.substring(i,i+1);
        }
        System.out.print(ters);
        System.out.println();
        //ornek 2: size verilen bir string in "Palindrome" olup olmadigini kontrol eden kodu yaziniz
        //  nalan, ey edip adanada pide ye, 404

        //Logic : String i ters cevir sonrada duz hali ile ters halini karsilastir, ayni ise "Palindrome"
        String s="EY EDİP ADANADA PİDE YE";
        String ters2="";
        for ( int i=s.length()-1; i>=0 ;i-- ){
            ters2=ters2+s.substring(i,i+1);
        }
        if (s.equalsIgnoreCase(ters2)){
            System.out.println(ters2+" Polindrone");
        }else {
            System.out.println(s+" Polindrone değil..");
        }


    }//Main
}
