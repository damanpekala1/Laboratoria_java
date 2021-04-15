package pl.lublin.wsei.java.cwiczenia;

public class Main {

    public static void main(String[] args) {
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
    }
}
