package de.fhdw.bfwd423a.sohre.Klausurvorbereitung;

import java.util.Arrays;

public class Exercise12 {

    public static void main(String[] args) {

        int [] array = {0,1,2,3};
        System.out.println(Arrays.toString(copy(array)));
    }

    static int [] copy (int [ ] array){

        int [] copy = new int[array.length];

        for (int i = 0; i < array.length; i++){

            copy[i] = array[i];
        }
        return copy;
    }
}