package de.fhdw.bfwd423a.sohre.Demo01;

public class Example06 {
    public static void main(String[] args) {
        System.out.println(arithmeticProgression(5,2, 3));
    }

    static double arithmeticProgression(double a, double d, double n){
        double z;
        z = 0;
        for(int i = 0; i < n; i++){
            z += a+i*d;
            System.out.println(z);
        }
        return z;
    }
}
