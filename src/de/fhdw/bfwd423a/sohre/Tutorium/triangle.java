package de.fhdw.bfwd423a.sohre.Tutorium;

public class triangle {
    public static void main(String[] args) {
        printTriangle(5);
    }

    static void printTriangle(int n){
        if (n == 0){
            System.out.println();
        } else if (n == 1) {
            System.out.println("*");
        }else if (n == 2){
            printTop();
            System.out.println();
            printBottom(n);
        }else {
            printTop();
            System.out.println();
            for (int i = 1; i < n-1; i++) {
                printMiddle(i+i);
                System.out.println();
            }
            printBottom(n);
        }
    }

    static void printTop(){
        printStars(1);
    }

    static void printMiddle(int n){
            printStars(1);
            printBlank(n);
            printStars(1);
    }

    static void printBottom(int n){
        printStars(n+n-1);
    }

    static void printStars(int n){
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    static void printBlank(int n){
        for (int j = 0; j < n; j++) {
            System.out.print(" ");
        }
    }
}
