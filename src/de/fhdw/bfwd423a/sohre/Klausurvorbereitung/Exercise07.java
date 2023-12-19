package de.fhdw.bfwd423a.sohre.Klausurvorbereitung;

public class Exercise07 {

    public static void main(String[] args) {

        pairsOfNaturalNumbers(4);

    }

    static void pairsOfNaturalNumbers(int n){

        for (int i = 1; i <= n; i++ ){
            for (int j = 1; j <= n; j++){

                System.out.println(i + "," + j);
            }
        }
    }
}