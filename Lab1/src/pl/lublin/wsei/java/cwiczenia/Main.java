package pl.lublin.wsei.java.cwiczenia;

import org.w3c.dom.Text;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
/*
    private static String leftPad(String aText,char aChar, int aWidth){
        String res = aText;
        for (int i = 0; i < aWidth - aText.length(); i++){
            res = aChar+ res;
        }
        return res;
    }

 */

    public static void main(String[] args) {



        /*
        // 4
        System.out.println("Hello Java world\n");
        // 7a
        System.out.print("Ala");
        System.out.print("ma");
        System.out.print("kota");
        // 7b
        System.out.println("Ala");
        System.out.println("ma");
        System.out.println("kota");
        //7c
        System.out.print("Ala\n");
        System.out.print("ma\n");
        System.out.print("kota\n");
        //7e
        int a = 3;
        double b = 4.21;
        String s = "jakiś tekst";

        System.out.printf("a = %d, b = %.2f, s=%20s %n", a, b, s);
        //7g
        System.out.print("Nazywaliśmy to \"witaminą B3\"\n");
        //7gg
        System.out.printf("alfa\tsin(alfa)\n");
        for (int i = 0; i < 370; i += 10){
            System.out.printf("%d\t%f\t\n", i, Math.sin(i / 360.0 * 2 * Math.PI));
        }
        //7h
        System.out.printf("\narg\tlog2(arg)\tsum(arg)\n");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%f\t%f\n", i, Math.log(2) / Math.log (i), Math.pow(2,i) + Math.pow(2, i+1) );
        }
         */
        //8
       /* Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.print("Podaj pierwszą liczbę:");
        num1 = input.nextInt();
        System.out.print("Podaj drugą liczbę:");
        num2 = input.nextInt();
        System.out.printf("Wynik dodawania %d + %d = %d%n",num1,num2,num1+num2); */

        //9
        /*
        Scanner input = new Scanner (System.in);
        int num1 =0, num2 =0;
        do {
            System.out.print("Podaj liczbę, które mam dodać:");
            num1 = input.nextInt();
            num2 = input.nextInt();
            if((num1 == 0)|| (num2 == 0)) break;
            System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);
        }   while (true);
**
         */

        //10
        /*
        Scanner input = new Scanner (System.in);
        int dec = 0;
        do {
            System.out.print("Podaj liczbę do zamiany:");
           dec = input.nextInt();
           String hex = Integer.toHexString(dec);
           String bin = Integer.toBinaryString(dec);
            if (dec == 0) break;
            System.out.printf("System 10: %d \nSystem 2: %s \nSystem 16: %s \n", dec, leftPad(bin, '0', 7), leftPad(hex.toUpperCase(),'0', 4));
        }   while (true);

         */
        //11
        int[] liczby = new int[30];
        Random rnd = new Random();

        for(int i = 0; i < 30; i++)
            liczby[i] = rnd.nextInt();
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        long avg = 0;
        for(int l : liczby) {
            System.out.println(l);
            if(l < mn) mn = l;
            if(l > mx) mx = l;
            avg += 1;
        }
        System.out.printf("MIN = %d, MAX = %d, AVG = %f", mn,mx,(float)avg/liczby.length);
    }
}
