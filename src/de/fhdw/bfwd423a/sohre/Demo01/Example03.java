package de.fhdw.bfwd423a.sohre.Demo01;
public class Example03 {
    public static void main(String[] args) {
        System.out.println(calcSum(1, 3));
    }

    public static int calcSum(int a, int b) {
        if (a > b) {
            return 0;
        } else {
            int z;
            z = 0;
            for (int i = a; i <= b; i++) {
                z = z+a;
                a++;
            }
            return z;
        }
    }
}