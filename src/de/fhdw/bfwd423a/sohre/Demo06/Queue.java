package de.fhdw.bfwd423a.sohre.Demo06;

public class Queue {

    List mList;

    Queue(){
        mList = new List();
    }

    boolean isEmpty(){
        return mList.size() == 0;
    }

    int first(){
        return mList.getNode(mList.size()-1).getContent();
    }

    int pop(){
        int result;

        result = first();
        mList.remove(mList.size()-1);
        return result;
    }

    void append(int value){
        mList.insert(0,value);
    }

    int maximumValue(){ // funktioniert nur halb, da Queue verändert wird
        Queue helpQ;
        int result;
        int currentValue;

        helpQ = this;
        result = 0;
        currentValue = 0;

        while(!helpQ.isEmpty()){
            currentValue = helpQ.pop();
            if(currentValue > result){
                result = currentValue;
            }
        }
        return result;
    }


    int getMaximum(Queue q){
        int max, next;
        Queue buffer;

        buffer = new Queue();
        max = q.pop();
        buffer.append(max);

        while (!q.isEmpty()){
            next = q.pop();
            buffer.append(next);
            if (next > max){
                max = next;
            }
        }

        while (!buffer.isEmpty()){
            next = buffer.pop();
            q.append(next);
        }
        return max;
    }
}
