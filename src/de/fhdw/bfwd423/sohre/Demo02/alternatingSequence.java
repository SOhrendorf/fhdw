package de.fhdw.bfwd423.sohre.Demo02;

public class alternatingSequence {
    public static void main(String[] args) {
        alternatingSequence(5);
    }

    public static void alternatingSequence(int size) {
        int z;
        z = 2;
        for (int i = size; i >= 1; i--) {
            if(z %4 == 0){
                System.out.println(z*-1);
            }else{
                System.out.println(z);
            }
            z = z + 2;
        }
    }
}