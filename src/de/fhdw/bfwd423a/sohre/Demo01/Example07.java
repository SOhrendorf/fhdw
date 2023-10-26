package de.fhdw.bfwd423a.sohre.Demo01;

public class Example07 {
    public static void main(String[] args) {
        paar(10);
    }

    static void paar(int n){
        int k;
        k = n;
        for(int i = 0; i <= k; i++){
            System.out.print('(');
            System.out.print(i);
            System.out.print(", ");
            System.out.print(n);
            System.out.println(')');
           n--;
        }
    }
}
