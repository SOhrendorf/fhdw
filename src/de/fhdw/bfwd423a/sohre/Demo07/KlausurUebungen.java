package de.fhdw.bfwd423a.sohre.Demo07;

public class KlausurUebungen {
    public static void main(String[] args) {
        boolean[] boolArray;

        boolArray = new boolean[] {true, true, false, true};

        System.out.println(moreTrueThanFalse(boolArray));

    }

    static boolean moreTrueThanFalse(boolean[] boolArray){
        int trueCount;
        int falseCount;

        trueCount = 0;
        falseCount = 0;

        for(boolean e:boolArray) {
            if (e){
                trueCount++;
            }else{
                falseCount++;
            }
        }
        return trueCount >= falseCount;
    }
}
