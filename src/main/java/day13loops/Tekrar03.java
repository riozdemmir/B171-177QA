package day13loops;

public class Tekrar03 {
    public static void main(String[] args) {
        //Ornek: Verilen bir String de kucuk harfleri console a yazmayiniz
        // "Pwd12?Ab"  ==> P12?A
        String a = "Pwd12?Ab";
        for (int i = 0; i <a.length() ; i++) {
            char ch=a.charAt(i);
            if (ch>='a' && ch<='z'){
                continue;
            }else {
                System.out.print(ch);
            }

        }


    }
}
