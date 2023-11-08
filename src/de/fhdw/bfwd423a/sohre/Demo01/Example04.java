package de.fhdw.bfwd423a.sohre.Demo01;

public class Example04 {

    public static void main(String[] args) {
        printTree(4);
    }

    static void printTree(int height){
        printTreeTop(height);
        printTrunk(height);
    }

    static void printTreeTop(int height){
        int nBlnaks;
        int nStars;
        nBlnaks = height-1;
        nStars = 1;
        for (int i = 1; i <= height; i++) {
            printBlankStars(nBlnaks, nStars);
            nBlnaks -= 1;
            nStars += 2;
        }
    }

    static void printTrunk(int height){
        printBlanksPipe(height-1);
        printBlanksPipe(height-1);
    }

    static void  printBlankStars(int nBlanks, int nStars){
        printBlanks(nBlanks);
        printStars(nStars);
        System.out.println();
    }

    static void printBlanksPipe(int nBlanks){
        printBlanks(nBlanks);
        System.out.println("|");
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