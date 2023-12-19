package de.fhdw.bfwd423a.sohre.Klausurvorbereitung;

public class Exercise05 {

    public static void main(String[] args) {

        alternatingSequence(5);

    }

    static void alternatingSequence(int n){

        for(int i = 1; i <= n; i++){

            int help = i * 2;

            if( i % 2 == 0){
                help *= -1;
            }

            System.out.print(help + " ");
        }
    }
}