package de.fhdw.bfwd423a.sohre.Demo03;

public class sameArray {

    public static boolean sameArray(int[] Array1, int[]Array2){
        boolean result;
        result = true;
        int i = 0;

        for(int e : Array1){
            if(e != Array2[i] || Array1.length != Array2.length){
                result = false;
                break;
            }
            i++;
        }
        return result;
    }
}
