package de.fhdw.bfwd423a.sohre.Demo06;

public class Stack {

    List mList;

    Stack(){
        mList = new List();
    }

    boolean isEmpty(){
        return mList.size() == 0;
    }

    int top(){
        return mList.getFirst();
    }

    int pop(){
        int result;

        result = top();
        mList.remove(0);
        return result;
    }

    void push(int newValue){
        mList.insert(0,newValue);
    }
}