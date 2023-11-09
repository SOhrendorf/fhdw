package de.fhdw.bfwd423a.sohre.Demo03;

public class getFrequnecyOfElementInArray {
    public static int getFrequnecyOfElementInArray(int[] intArray, int e){
        int result = 0;
        for (int k : intArray) {
            if(k == e){
                result++;
            }
        }
        return result;
    }
}
