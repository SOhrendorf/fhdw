package de.fhdw.bfwd423a.sohre.Demo01;

public class Example08 {
    public static void main(String[] args) {

        System.out.print(Integer.toString(factorial( -5.0)));
        char c = '⮴';
        System.out.print("\n" + c);
        System.out.print(" Das ist ein String");
        System.out.print("(⌐■_■)");
    }

    static int factorial(double number){
        return factorial((int) number);
    }

    static int factorial(int number){
        if(number >= 0 && (true)){
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
