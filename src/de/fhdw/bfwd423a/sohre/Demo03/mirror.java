package de.fhdw.bfwd423a.sohre.Demo03;

public class mirror {
    public static int[] mirrorB (int[] array){
        int[] result = new int[array.length];
        for (int i = array.length; i > 0 ; i--) {
            result[array.length-i] = array[i-1];
        }
        return result;
    }

    public static int[] mirrorA(int[] array){
        for (int i = 0; i < array.length/2; i++) {
            swap.swap(array, i,array.length-i-1);
        }
        return array;
    }

    public static int[] mirrorC (int[] array, int[]resultArray){
        for (int i = array.length; i > 0 ; i--) {
            resultArray[array.length-i] = array[i-1];
        }
        return resultArray;
    }
}