package day08stringmanipulationmemoryusageifstatement;

public class Tekrar02 {
    public static void main(String[] args) {
        //Ornek 1:  Bir string in belirli bir karakterinden baslayarak belirli bir karaktere kadar dynamic olarak aliniz
        //      abc@gmail.com   ===> gmail
        String r = "ridvanozdemmir@hotmail.com";
        int basIdx = r.indexOf('@')+1;
        int sonIdx = r.indexOf('.');
        String companyName = r.substring(basIdx,sonIdx);
        System.out.println("companyName = " + companyName);

        //Ornek 2:Verilen iki string in birbirinin aynisi olup olmadigini kontrol eden kodu yaziniz
        String b = "riDvan OzdEmiR";
        String c = "Ridvan Ozdemir";
        boolean result = b.equals(c);
        System.out.println(result);

        //Verilen iki stringin aynı olup olmadıgını kontrol eden kodu yaz
        String d = "riDVan";
        String f = "Ridvan";
        boolean kontrol = d.equalsIgnoreCase(f);
        System.out.println(kontrol);



    }
}
