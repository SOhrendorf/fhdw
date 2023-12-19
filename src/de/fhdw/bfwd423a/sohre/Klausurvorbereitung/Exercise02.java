package de.fhdw.bfwd423a.sohre.Klausurvorbereitung;

public class Exercise02 {

    public static void main(String[] args){
        paarsOfNumber(5);
    }

    static void paarsOfNumber(int n ){
        for(int i = 0; i <= n; i++){

            int help;
            help = n-i;

            System.out.println("(" + i + "," + help +")");
        }
    }
}
