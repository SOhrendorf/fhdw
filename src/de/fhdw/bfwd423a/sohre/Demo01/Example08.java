package de.fhdw.bfwd423a.sohre.Demo01;

public class Example08 {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    static int factorial(int number){
        int result;
        result = 1;
        for (int i = 1; i < number; i++){
            result *= i+1;
        }
        return result;
    }
}
