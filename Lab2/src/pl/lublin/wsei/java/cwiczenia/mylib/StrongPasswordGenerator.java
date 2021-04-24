package pl.lublin.wsei.java.cwiczenia.mylib;

import org.w3c.dom.CharacterData;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StrongPasswordGenerator {
    private int dlugosc;
    private boolean maleLitery;
    private boolean wielkieLitery;
    private boolean cyfry;
    private boolean znakiSpecjalne;
    private char[] dozwoloneZnakiSpecjalne;

    public StrongPasswordGenerator() {
        this.dlugosc = 12;
        this.maleLitery = false;
        this.wielkieLitery = false;
        this.cyfry = false;
        this.znakiSpecjalne = false;
    }

    public StrongPasswordGenerator(int dlugosc, boolean maleLitery, boolean wielkieLitery, boolean cyfry, boolean znakiSpecjalne) {
        this.dlugosc = dlugosc;
        this.maleLitery = maleLitery;
        this.wielkieLitery = wielkieLitery;
        this.cyfry = cyfry;
        this.znakiSpecjalne = znakiSpecjalne;
    }

    public StrongPasswordGenerator(boolean maleLitery, boolean wielkieLitery, boolean cyfry, boolean znakiSpecjalne) {
        this.dlugosc = 12;
        this.maleLitery = maleLitery;
        this.wielkieLitery = wielkieLitery;
        this.cyfry = cyfry;
        this.znakiSpecjalne = znakiSpecjalne;
    }

    public StrongPasswordGenerator(int dlugosc, boolean maleLitery, boolean wielkieLitery, boolean cyfry, boolean znakiSpecjalne, String dozwoloneZnakiSpecjalne) {
        this.dlugosc = dlugosc;
        this.maleLitery = maleLitery;
        this.wielkieLitery = wielkieLitery;
        this.cyfry = cyfry;
        this.znakiSpecjalne = znakiSpecjalne;
        this.dozwoloneZnakiSpecjalne = dozwoloneZnakiSpecjalne.toCharArray();
    }

    public int getDlugosc() {
        return dlugosc;
    }

    public boolean getMaleLitery() {
        return maleLitery;
    }

    public boolean getWielkieLitery() {
        return wielkieLitery;
    }

    public boolean getZnakiSpecjalne() {
        return znakiSpecjalne;
    }

    public boolean getCyfry() {
        return cyfry;
    }

    public char[] getDozwoloneZnakiSpecjalne() {
        return dozwoloneZnakiSpecjalne;
    }

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    public void setMaleLitery(boolean maleLitery) {
        this.maleLitery = maleLitery;
    }

    public void setWielkieLitery(boolean wielkieLitery) {
        this.wielkieLitery = wielkieLitery;
    }

    public void setCyfry(boolean cyfry) {
        this.cyfry = cyfry;
    }

    public void setZnakiSpecjalne(boolean znakiSpecjalne) {
        this.znakiSpecjalne = znakiSpecjalne;
    }

    public void setDozwoloneZnakiSpecjalne(String dozwoloneZnakiSpecjalne) {
        this.dozwoloneZnakiSpecjalne = dozwoloneZnakiSpecjalne.toCharArray();
    }

    public String generate() {
        Random rnd = new Random();
        String maleLitery = "abcdefghijklmnopqrstuvwxyz";
        String duzeLitery = "ABCDEFGHIJKLMOPRQSTUVWXYZ";
        String liczby = "1234567890";
        String znakiSpecjalne = "!@#$%^&*()";

        StringBuilder passwordBulider = new StringBuilder();
        List<String> passwordDataBase= new ArrayList<String>();

        if(this.maleLitery) {
            for(int x =0 ; x < maleLitery.length();x++){
                passwordDataBase.add(String.valueOf(maleLitery.charAt(x)));
            }
        }
        if(this.wielkieLitery){
            for(int x =0 ; x < duzeLitery.length();x++){
                passwordDataBase.add(String.valueOf(duzeLitery.charAt(x)));
            }
        }
        if(this.znakiSpecjalne){
            for(int x =0 ; x < znakiSpecjalne.length();x++){
                passwordDataBase.add(String.valueOf(znakiSpecjalne.charAt(x)));
            }
        }
        if(this.cyfry){
            for(int x =0 ; x < liczby.length();x++){
                passwordDataBase.add(String.valueOf(liczby.charAt(x)));
            }
        }
        for(int i = 1 ; i<= this.dlugosc; i++){
            passwordBulider.append(passwordDataBase.get(rnd.nextInt(passwordDataBase.size())));
        }
        return passwordBulider.toString();
    }

}

