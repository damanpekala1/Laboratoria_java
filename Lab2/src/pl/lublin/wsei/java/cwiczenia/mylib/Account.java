package pl.lublin.wsei.java.cwiczenia.mylib;
import org.apache.commons.lang3.StringUtils;

import java.util.Locale;

public class Account {
    public String name;
    private static String ukrAlphabet = "абвгдеєжзиіїйклмнопрстуфхцчшщьюя";
    private static String translitRepl[] = {"a","b","v","g","d","e","je","zh","z","y","i","ji", "j",
            "k","l","m","n","o","p","r","s","t","u","f","h","c",
            "ch","sh","shh","'","ju","ja"};
    public String getName() {
        return name;
    }
    public static String capitalize(String aStr)
    {
        String[] tokens = StringUtils.split(aStr);
        for(int i = 0; i < tokens.length; i++)
            tokens[i] = StringUtils.capitalize(tokens[i]);
        return StringUtils.join(tokens,' ');
    }
    public void setName(String name) {
        this.name = capitalize(name);
    }
public String translit (String arg){
        String argl=arg.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<=argl.length()-1; i++ ) {
            int position = ukrAlphabet.indexOf(argl.charAt(i));
            if (position < 0) {
                sb.append(argl.charAt(i));
            }
                else {
                    sb.append(translitRepl[i]);
                }
            }
            return sb.toString();
        }
}


