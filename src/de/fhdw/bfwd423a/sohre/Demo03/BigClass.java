package de.fhdw.bfwd423a.sohre.Demo03;

import de.fhdw.bfwd423a.sohre.Demo03.contains;

import java.util.Arrays;

public class BigClass {
    public static void main(String[] args) {
        int[] intArray;
        int e = 5;

        intArray = new int[] {1,2,3,4,5,6,7};

        //System.out.println(contains.contains(intArray, e));
        //System.out.println(getFrequnecyOfElementInArray.getFrequnecyOfElementInArray(intArray, e));
        System.out.println(Arrays.toString(removeElementFromArray.removeElementFromArray(intArray, e)));
    }
}