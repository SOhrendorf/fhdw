package de.fhdw.bfwd423a.sohre.Demo01;

public class Example09 {
    public static void main(String[] args) {
        numbersInSquare(5);
    }

    static void numbersInSquare(int n) {
        for (int i = 0; i < n; i++) {
            printLine(i+1, n);
        }
    }

    static void printLine(int startValue, int size){
        for(int i = 0; i < size; i++){
            System.out.print(startValue);
            System.out.print(' ');
            startValue++;
        }
        System.out.println();
    }
}
