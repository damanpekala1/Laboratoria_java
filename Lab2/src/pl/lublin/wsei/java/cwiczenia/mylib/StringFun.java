package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.List;

public class StringFun {
    public static String anarchize(String word) {
        char[] charWord = word.toCharArray();
        for (int i = 0; i < Array.getLength(charWord); i++) {
            if (Character.isUpperCase(charWord[i])) {
                charWord[i] = Character.toLowerCase(charWord[i]);
            } else {
                charWord[i] = Character.toUpperCase(charWord[i]);
            }
        }
        return String.valueOf(charWord);
    }


    public static String camelize(String word) {
        String[] wordTab = StringUtils.split(word);
        String phrase;
        for (int i = 0; i < Array.getLength(wordTab); i++) {
            if (i != 0) {
                wordTab[i] = wordTab[i].toLowerCase();
                wordTab[i] = StringUtils.capitalize(wordTab[i]);
            } else {
                wordTab[i] = wordTab[i].toLowerCase();
            }
        }
        phrase = String.join(",", wordTab);
        phrase = phrase.replaceAll(",", "");
        return phrase;
    }

    public static String decamelize(String word) {

        StringBuffer words = new StringBuffer();
        words.append(Character.toLowerCase(word.charAt(0)));
        for (int i = 1; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                words.append(" ");
            }
            words.append(Character.toLowerCase(word.charAt(i)));
        }
        return words.toString();
    }

    public static String decamelize2(String word) {
        String[] arr = StringUtils.splitByCharacterTypeCamelCase(word);
        String phrase;
        phrase = String.join(",", arr);
        phrase = phrase.replaceAll(",", " ");
        return phrase;
    }

    public static boolean isPalindrome(String word) {
        word = word.replaceAll("\\s", "");
        word = word.toUpperCase();
        int len = word.length();
        for (int i = 0; i < len / 2; ++i) {
            if (word.charAt(i) != word.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static String shuffled(String word) {
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder();
        List<Character> lista = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            lista.add(word.charAt(i));
        }

        while (lista.size() > 0) {
            int znak = rnd.nextInt(lista.size());
            char ch = lista.get(znak);
            sb.append(ch);
            lista.remove(znak);
        }

        return sb.toString();
    }
}


