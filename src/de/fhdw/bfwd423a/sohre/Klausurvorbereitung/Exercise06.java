package de.fhdw.bfwd423a.sohre.Klausurvorbereitung;

import java.util.Arrays;

public class Exercise06 {
    public static void main(String[] args){
        int n = 5;
        int[] resultArray = alternatingSequenceArray(n);
        System.out.println(Arrays.toString(resultArray));
    }

    static int[]  alternatingSequenceArray(int n){
        int[] resultArray = new int[n];
        int term = -3;

        for (int i = 0; i < n; i++) {
            resultArray[i] = term;

            if (i % 2 == 0) {
                term = (term * -1) + 1;
            } else {
                term = (term * -1) -2;
            }
        }

        return resultArray;
    }
}