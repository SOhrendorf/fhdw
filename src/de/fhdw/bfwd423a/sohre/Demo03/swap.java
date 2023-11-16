package de.fhdw.bfwd423a.sohre.Demo03;

public class swap {
    public static void swap(int[] array, int a, int b){
        int help;
        help = array[a];
        array[a] = array[b];
        array[b] = help;
    }
}
