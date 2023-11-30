package de.fhdw.bfwd423a.sohre.Demo03;

import java.util.Arrays;

public class BigClass {
    public static void main(String[] args) {
        int[] intArray;
        int[] intArray2;
        int[] intArray3;
        double simon[];
        int e = 5;

        int arrayTest[] = {1,2,3,4};
        intArray = new int[] {1,2,3,4,5,6};
        intArray2 = new int[] {1,2,3,4,5,6,9};
        intArray3 = new int[intArray.length];

        System.out.println(Arrays.toString(intArray));
        //System.out.println(contains.contains(intArray, e));
        //System.out.println(getFrequnecyOfElementInArray.getFrequnecyOfElementInArray(intArray, e));
        //System.out.println(Arrays.toString(removeElementFromArray.removeElementFromArray(intArray, e)));
        //System.out.println(sameArray.sameArray(intArray, intArray2));
        //System.out.println(Arrays.toString(mirror.mirrorB(intArray)));
        //System.out.println(Arrays.toString(mirror.mirrorA(intArray)));
        System.out.println(Arrays.toString(mirror.mirrorC(intArray,intArray3)));
        //swap.swap(intArray,1,2);
    }
}