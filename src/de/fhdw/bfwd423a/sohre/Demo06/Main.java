package de.fhdw.bfwd423a.sohre.Demo06;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        List myList;
        List myList2;
        Stack stack1;
        Queue queue1;

        myList = new List();
        myList2 = new List();
        stack1 = new Stack();
        queue1 = new Queue();

        myList.insert(0, 123);
        myList.insert(0, 55);
        myList.insert(2, 777);
        stack1.push(2);
        queue1.append(100);
        queue1.append(200);
        queue1.append(100);

        System.out.println(myList.getValueOfNode(1));
        System.out.println(Arrays.toString(myList.toArray()));
        System.out.println("First Value" + myList.getFirst());

        System.out.println();
        System.out.println("Hier beginnt Stack");
        System.out.println(stack1.isEmpty());
        System.out.println(stack1.pop());

//        System.out.println();
//        System.out.println("Hier beginnt Queue");
//        System.out.println(queue1.first());
//        System.out.println(queue1.pop());
//        System.out.println(queue1.first());

        System.out.println("maximum Wert: " + queue1.maximumValue());
    }
}

class  Simon{

}
