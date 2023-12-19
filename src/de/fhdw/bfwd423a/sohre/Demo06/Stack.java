package de.fhdw.bfwd423a.sohre.Demo06;

public class Stack {

    List mList;

    public Stack(){
        mList = new List();
    }

    public boolean isEmpty(){
        return mList.size() == 0;
    }

    public int top(){
        return mList.getFirst();
    }

    public int pop(){
        int result;

        result = top();
        mList.remove(0);
        return result;
    }

    public void push(int newValue){
        mList.insert(0,newValue);
    }
}