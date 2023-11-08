package de.fhdw.bfwd423a.sohre.Demo02;

import java.util.Arrays;

public class miniSort {
    public static void main(String[] args) {
        int[] help = {4,3,2};

        miniSort(help);
        //for (int e : help){
        //    System.out.println(e);
        //}
        System.out.println(Arrays.toString(help));
    }

    public static void miniSort(int[] pArray){
        for (int k = 0; k < pArray.length-1; k++) {
            for (int i = 0; i < pArray.length - 1; i++) {
                if (pArray[i] > pArray[i + 1]) {
                    int help = pArray[i];
                    pArray[i] = pArray[i + 1];
                    pArray[i + 1] = help;
                }
            }
        }
    }
}
