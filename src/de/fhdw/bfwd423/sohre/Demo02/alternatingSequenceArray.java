package de.fhdw.bfwd423.sohre.Demo02;

public class alternatingSequenceArray {

    public static void main(String[] args) {
        alternatingSequence(3);
    }

    public static void alternatingSequence(int size) {
        int z;
        int[] sequenceArray;

        z = 3;
        sequenceArray = new int[size];

        for (int i = 0; i < size; i++) {
            if(z %3 == 0){
                sequenceArray[i] = z*-1;
                z++;
            }else{
                sequenceArray[i] = z;
                z = z + 2;
            }
        }

        for(int k = 0; k < size; k++){
            System.out.println(sequenceArray[k]);
        }
    }
}
