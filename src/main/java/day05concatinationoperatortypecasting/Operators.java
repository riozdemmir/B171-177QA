package day05concatinationoperatortypecasting;

public class Operators {
    /*
    1) +, -, *, / işlemleri matematikte kullanıldıgı gibi kullanılır.
       Note 1: int / int ==> int olur
       Note 2: double + int ==> double olur.
       Cunku java da matematiksel işlemlerde farklı dta type ları kullanılırsa sonuc her zaman buyuk data type ında olur.

    2) java da "Logical Operator"lar vardır. AND ve OR işlemleri "Logical Operator" lardır.
       i)AND (&&) işleminden true alabilmek için herşey true olmalıdır.
       AND işlemi "perfectionist"tir.
       AND işleminde bir tane false sonucu false yapar.

      ii) OR(||) işleminde bir tane true sonucu true yapmaya yeterlidir.
          OR işleminde sonucun false olması için herşey false olmalıdır.
          OR işlemi "polyanna" gibidir.

      iii) NOT operator (!) true olanı false, false olanı true yapar.
          !true => false
          !false => true
          !!true => true


    3) Comparison (karşılaştırma) Operators
    <, > <=, >= ==, !=
    Note: Karşılaştırma operatorlerini kullandıgınızda KESİNLİKLE boolean (true veya false) alırsınız.
    Note: Biz AND işlemi için && kullanırız. & kullanım da geçerlidir.
    "&&" kullanım ilk ifade "false" olduğunda diğerlerini kontrol etmez, dolayısıyla hızlı çalışır.
    cunku and işleminde ilk ifade false ise diğerlerinin ne olduğunun bir önemi yoktur. sonuç false olur.
    "&" kullanım ilk ifade ne olursa olsun diğerlerini kontrol eder, dolayısıyla yavaş çalışır.
    Biz hep "&&" kullanırız.
     */

    public static void main(String[] args) {

        boolean first = 3<5;
        boolean second = 2+3!=5;
        boolean third = 2+3*5>=19;
        System.out.println(first + "-"+ second+"-"+third);//true-false-false

        System.out.println(first&&second);//false
        System.out.println(first||second||third);//true







    }
}
