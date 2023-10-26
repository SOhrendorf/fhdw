package de.fhdw.bfwd423a.sohre.Demo01;

public class Example11 {
    public static void main(String[] args) {
        double[] arrayOfRandomNumber;
        arrayOfRandomNumber = new double[12];

        for (int i = 0; i < 12; i++) {
            arrayOfRandomNumber[i] = Math.random();
        }
        for (int i = 0; i < 12; i++) {
            System.out.print(arrayOfRandomNumber[i] + " ");
        }
    }
}
