package de.fhdw.bfwd423a.sohre.Demo02;

public class cross {
    public static void main(String[] args) {
        cross(6);
    }

    public static void cross(int size){
        printFrame(size);
        printMidle(size);
        printFrame(size);
    }

    static void printMidle(int count){
        printHorizontalLine(count);
        printCross(1);
        printHorizontalLine(count);
        System.out.println();
    }

    static void  printFrame(int size){
        printVerticalLineCentered(size);
    }

    private static void printHorizontalLine(int count) {
        for (int i = 0; i < count; i++){
            System.out.print("-");
        }
    }

    private static void printCross(int size) {
        for (int i = 0; i < size; i++){
            System.out.print("+");
        }
    }

    private static void printVerticalLineCentered(int size) {
        for (int i = 0; i <size; i++){
            printBlanks(size);
            System.out.println("|");
        }
    }

    static void  printBlanks(int nBlanks){
        for(int i = 1; i <= nBlanks; i++){
            System.out.print(" ");
        }
    }
}
