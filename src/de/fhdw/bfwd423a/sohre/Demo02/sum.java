package de.fhdw.bfwd423a.sohre.Demo02;

public class sum {
    public static void main(String[] args) {
        double[] help;
        help = new double[2];
        help[0] = 2.0;
        help[1] = 1.5;
        System.out.println(sum(help));
    }

    public static double sum(double[] pArray){
        double sum;
        sum = 0.0;
        for(double e : pArray){
            sum += e;
        }
        return sum;
    }
}