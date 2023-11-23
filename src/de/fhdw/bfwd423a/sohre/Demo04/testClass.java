package de.fhdw.bfwd423a.sohre.Demo04;

public class testClass {
    public static void main(String[] args) {
        String string1;
        String[] string2;
        string1 = "Simon";
        string2 = new String[] {"Wir", "lieben", "Programmieren"};

        string1 = "Otto";

        //System.out.println(stringUtils.sIna(string1, string2));
        //System.out.println(stringUtils.numberOfVocals(string1));
        //System.out.println((stringUtils.palindrom(string1)));
        System.out.println(stringUtils.repeatString(string1, 3));

    }
}
