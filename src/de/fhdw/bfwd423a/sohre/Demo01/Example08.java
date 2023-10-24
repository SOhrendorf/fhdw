package de.fhdw.bfwd423a.sohre.Demo01;

public class Example08 {
    public static void main(String[] args) {
        System.out.println(factorial( 6.6));
    }

    static double factorial(double number){
        if(number >= 0 & (number %1 == 0)){
            int result;
            result = 1;
            for (int i = 1; i < number; i++){
                result *= i+1;
            }
            return result;
        }
        else {
            System.out.println("Die Eingabe ist keine natürliche Zahl");
            return number;
        }
    }
}
