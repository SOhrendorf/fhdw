package de.fhdw.bfwd423a.sohre.Tutorium;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] unsortedArray;
        unsortedArray = new int[] {5,1,4,2,8};
        Bubbelsort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
    }

    static void Bubbelsort(int[] unsortedArray){
        boolean switched = false;
        int laengeDesArrays = unsortedArray.length;
        do{
            switched = false;
            for(int i = 0; i < laengeDesArrays - 1; i++){
                if(unsortedArray[i] > unsortedArray[i+1]){
                    int KopieZuVergleichendeZahl = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[i+1];
                    unsortedArray[i+1] = KopieZuVergleichendeZahl;
                    switched = true;
                }
            }
            laengeDesArrays = laengeDesArrays -1;
        }while(switched == true);
    }
}