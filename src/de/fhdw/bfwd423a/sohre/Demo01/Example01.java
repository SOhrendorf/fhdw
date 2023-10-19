package de.fhdw.bfwd423a.sohre.Demo01;

public class Example01 {

    public static void main(String[] args) {
        taskD();
    }

    private static boolean mod2(int i){
        return i % 2 == 0;
    }
    private static boolean mod5(int i){
        return i % 5 == 0;
    }

        public static void taskA(){
            int i;
            i = -20;
            while(i < 21){
                System.out.println(i);
                i = i + 1;
            }
        }

        public  static void taskB(){
            int i;
            i = 0;
            while(i <= 100){
                if (!mod2(i) && !mod5(i)) {
                    System.out.println(i);
                }
                i = i + 1;
            }
        }

        public  static  void taskC(){
            int i;
            int k;
            i = 1;
            k = 1;
            while(i <= 497){
                System.out.println(i);
                i = i+k;
                k = k + 1;
            }
        }
        
        public  static void taskD(){
            int fib;
            int i;
            fib = 1;
            i = 0;
            while (fib <= 6765){
                System.out.println(fib);
                fib = fib + i;
                i = fib-i;
            }
        }
}