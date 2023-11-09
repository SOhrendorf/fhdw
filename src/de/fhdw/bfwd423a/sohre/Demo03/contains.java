package de.fhdw.bfwd423a.sohre.Demo03;

public class contains {

    public static boolean contains(int[] intArray, int e){

        for (int k: intArray) {
            if (k == e){
                return true;
            }
        }
        return false;
    }
}