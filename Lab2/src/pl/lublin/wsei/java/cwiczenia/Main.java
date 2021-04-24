package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;
import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;
import pl.lublin.wsei.java.cwiczenia.mylib.StrongPasswordGenerator;

public class Main {

    public static void main(String[] args) {
        Account acc = new Account();
        acc.setName("Piotr Gołabek");
        acc.name="piotr Gołąbek";
        System.out.println(acc.getName());
        System.out.printf("%s%n",Account.capitalize("stanisŁaw maruSARz"));
        System.out.printf("%s%n",Account.translit(("даміан")));
        System.out.printf("%s%n",Account.translit(("пęкала")));
        System.out.printf("%s%n",Account.translit(("абвгдеєжзиіїйклмнопрстуфхцчшщьюя")));
        System.out.printf("%s%n", StringFun.anarchize(("No pAsSaRaNt")));
        System.out.printf("%s%n", StringFun.camelize(("KRÓTKA zabawna Funkcja")));
        System.out.printf("%s%n", StringFun.decamelize(("krótkaZabawnaFunkcja")));
        System.out.printf("%s%n", StringFun.decamelize2(("krótkaLeniwszaFunkcja")));
        System.out.printf("%s%n", StringFun.isPalindrome(("Kobyła ma mały bok")));
        System.out.printf("%s%n", StringFun.isPalindrome(("Madam Im Adam")));
        System.out.printf("%s%n", StringFun.shuffled(("damian")));
        StrongPasswordGenerator strongPasswordGenerator = new StrongPasswordGenerator(8,
                true
                , true
                ,  true,
                true);
        System.out.println(strongPasswordGenerator.generate());


    }
}