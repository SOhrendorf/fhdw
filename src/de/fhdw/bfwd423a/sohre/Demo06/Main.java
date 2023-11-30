package de.fhdw.bfwd423a.sohre.Demo06;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        List myList;
        List myList2;

        myList = new List();
        myList2 = new List();

        myList.insert(0, 123);
        myList.insert(0, 55);
        myList.insert(2, 777);
        System.out.println(myList.getValueOfNode(1));
        System.out.println(Arrays.toString(myList.toArray()));
    }
}
