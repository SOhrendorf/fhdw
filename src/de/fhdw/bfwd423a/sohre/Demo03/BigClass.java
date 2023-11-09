package de.fhdw.bfwd423a.sohre.Demo03;

import de.fhdw.bfwd423a.sohre.Demo03.contains;

import java.util.Arrays;

public class BigClass {
    public static void main(String[] args) {
        int[] intArray;
        int[] intArray2;
        int e = 5;

        intArray = new int[] {1,2,3,4,5,6,7};
        intArray2 = new int[] {1,2,3,4,5,6,9};

        //System.out.println(contains.contains(intArray, e));
        //System.out.println(getFrequnecyOfElementInArray.getFrequnecyOfElementInArray(intArray, e));
        //System.out.println(Arrays.toString(removeElementFromArray.removeElementFromArray(intArray, e)));
        System.out.println(sameArray.sameArray(intArray, intArray2));
    }
}