package de.fhdw.bfwd423a.sohre.Demo01;

public class Example12 {
    public static void main(String[] args) {
        fibNumber(5);
    }

    public  static void fibNumber(int size){
        int fib;
        int i;
        int[] arrayFib;

        fib = 1;
        i = 0;
        arrayFib = new int[size];

        for (int j = 0; j < size ; j++) {
            arrayFib[j] = fib;
            fib = fib + i;
            i = fib-i;
        }

        for (int j = 0; j < size; j++) {
            System.out.print(arrayFib[j] + " ");
        }
    }
}