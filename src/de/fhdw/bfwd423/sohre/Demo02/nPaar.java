package de.fhdw.bfwd423.sohre.Demo02;

public class nPaar {
    public static void main(String[] args) {
        paar(3);
    }

    public static void paar(int n){
        for(int i = 1; i <= n; i++){
            for (int k = 1; k <= n; k++){
                System.out.print("(" + i + ",");
                System.out.println(k + ")");
            }
        }
    }
}
