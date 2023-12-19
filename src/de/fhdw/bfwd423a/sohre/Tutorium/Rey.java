package de.fhdw.bfwd423a.sohre.Tutorium;
import de.fhdw.bfwd423a.sohre.Demo06.Stack;

import java.util.Arrays;

class Rey {
    public static void main(String[] args) {
        System.out.println(arithmeticProgression(1,3,3));

    }
    public static void main5(String[] args) {
        int[]unsorted = new int[] {3,2,1};
        miniSort(unsorted);
        System.out.println(Arrays.toString(unsorted));
    }
    public static void main4(String[] args) {
        Stack s = new Stack();
        s.push(6);
        s.push(9);
        System.out.println(getSecondFromTop(s));
        System.out.println(s.pop());
        //System.out.println(s.pop());
    }
    public static void main3(String[] args) {
        String s;
        s = "42";
        System.out.println(sumOfDigits(s));
    }
    public static void main2(String[] args) {
        Queue q = new Queue();
        q.append(5);
        q.append(2);
        q.append(4);
        System.out.println(sumOfElements(q));
    }

    static int sumOfElements(Queue q) {
        int result = 0;
        int next;
        for (int i=1; i<=3; i++) {
            next = q.first();
            result += q.pop();
            q.append(next);
        }
        return result;
    }

    static int sumOfDigits(String s) {
        int result = 0;
        for (char c : s.toCharArray()) {
            result += c;
        }
        return result;
    }

    static int getSecondFromTop(Stack s) {
        int result;
        int buffer;
        buffer = s.pop();
        result = s.pop();
        s.push(buffer);
        return result;
    }

    static void miniSort(int[] array){
        if (array[0] > array[1]) {
            swap(array, 0,1);
        }
        if (array[1] > array[2]) {
            swap(array, 1,2);
        }
        if (array[0] > array[1]) {
            swap(array, 0,1);
        }
    }

    static void swap(int[] array, int index, int index2){
        int help;
        help = 0;

        help = array[index];
        array[index] = array[index2];
        array[index2] = help;
    }

    static double arithmeticProgression(double a, double d, double n){
        double result = 0;

        for (int i = 0; i < n; i++){
            double sum;
            sum = a + i*d;
            System.out.println(a + " + " + i*d + ", ");
            result += sum;
            System.out.println("Summe: " + sum);
        }
        return result;
    }
}