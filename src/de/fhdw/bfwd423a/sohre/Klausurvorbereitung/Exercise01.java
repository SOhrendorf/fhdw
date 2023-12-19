package de.fhdw.bfwd423a.sohre.Klausurvorbereitung;

public class Exercise01 {

    public static void main(String[] args) {

        System.out.println("Die Summe ist: " + arithmeticProgession(1.0, 3.0, 5.5));


    }

    public static double arithmeticProgession(double a, double d, double n){

        double term;
        double result = 0;

        System.out.print("Die Glieder sind: ");
        for(double i = 0 ; i < n; i++){

            term = a + (i * d);
            System.out.print(term + " ");
            result += term;

        }
        return result;

    }

}
