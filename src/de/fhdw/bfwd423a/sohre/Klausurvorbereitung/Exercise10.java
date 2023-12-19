package de.fhdw.bfwd423a.sohre.Klausurvorbereitung;

public class Exercise10 {
    public static void main(String[] args){
        cross(3);
    }

    static void cross(int n){
        printUpperLowerBoddy(n);
        printMiddle(n);
        printUpperLowerBoddy(n);
    }

    static void printUpperLowerBoddy(int n){
        for(int i = 0; i < n; i++){
            printSpace(n);
            printVerticalLine(1);
            System.out.println();
        }
    }

    static void printMiddle(int n){
        printHorizontalLine(n);
        System.out.print("+");
        printHorizontalLine(n);
        System.out.println();
    }

    static void printHorizontalLine(int n){
        for(int i = 0; i < n; i++){
            System.out.print("-");
        }
    }

    static void printVerticalLine(int n){
        for(int i = 0; i < n; i++){
            System.out.print("|");
        }
    }

    static void printSpace(int n){
        for(int i = 0; i < n; i++){
            System.out.print(" ");
        }
    }
}
