package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;

public class Main {

    public static void main(String[] args) {
        Account acc = new Account();
//        acc.setName("Piotr Gołabek");
        acc.name="piotr Gołąbek";
        System.out.println(acc.getName());
        System.out.printf("%s%n",Account.capitalize("stanisŁaw maruSARz"));
        System.out.printf("%s%n",Account.translit(("даміан")));
        System.out.printf("%s%n",Account.translit(("пęкала")));
        System.out.printf("%s%n",Account.translit(("абвгдеєжзиіїйклмнопрстуфхцчшщьюя")));

    }

}
