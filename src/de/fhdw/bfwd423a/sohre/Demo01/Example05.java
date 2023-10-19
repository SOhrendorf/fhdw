package de.fhdw.bfwd423a.sohre.Demo01;

public class Example05 {
    public static void main(String[] args) {
        square(4);
    }

    static void square(int size){
        if(size == 1){
            System.out.print("*");
            return;
        }
        printFrame(size);
        for (int i = size; i > 2 ; i--) {
            printMidle((size-2));
        }
        printFrame(size);
    }
    static void printMidle(int count){
        printStars(1);
        printBlanks(count);
        printStars(1);
        System.out.println();
    }

    static void  printFrame(int size){
        printStars(size);
        System.out.println();
    }

    static void  printBlanks(int nBlanks){
        for(int i = 1; i <= nBlanks; i++){
            System.out.print(" ");
        }
    }

    static void  printStars(int nStars){
        for (int i = 1; i <= nStars; i++){
            System.out.print("*");
        }
    }
}