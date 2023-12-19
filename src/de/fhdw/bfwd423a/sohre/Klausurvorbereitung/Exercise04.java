package de.fhdw.bfwd423a.sohre.Klausurvorbereitung;

public class Exercise04 {
    public static void main(String[] args){
        numbersInSquare(4);
    }

    public static void numbersInSquare(int n){
        for(int i = 1; i <= n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(i+j + " ");
            }
            System.out.println();
        }
    }
    public static void numbersInSquareRey(int n) {
        System.out.println("n = " + n + ":");

        // Iteration über die Zeilen
        for (int i = 1; i <= n; i++) {
            // Iteration über die Spalten
            for (int j = i; j <= i + n - 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();  // Neue Zeile für den nächsten Zeilenumbruch
        }
    }
}