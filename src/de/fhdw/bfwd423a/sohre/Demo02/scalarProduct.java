package de.fhdw.bfwd423a.sohre.Demo02;

public class scalarProduct {
    public static void main(String[] args) {
        double[] vecA = {1,2,3,4};
        double[] vecB = {4,-2,1};
        System.out.println(scalarProduct(vecA,vecB));
    }

    static double scalarProduct(double[] vecA, double[] vecB){
        assert vecA.length == vecB.length : "nicht die gleiche Länge"; // Abbruchbedinngung für ungleiche Länge
        double help = 0;

        for (int i = 0; i < vecA.length; i++){
            help += vecA[i]*vecB[i];
        }
        return help;
    }
}