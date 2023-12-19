package de.fhdw.bfwd423a.sohre.Demo06;

public class List {
    ListNode mStartNode;

    public void insert(int position, int newValue){
        ListNode newNode;

        assert position >= 0 && position <= size();

        newNode = new ListNode();
        if(this.size() == 0){ // List is empty
            mStartNode = newNode;
            mStartNode.setContent(newValue);
            mStartNode.setSuccessor(null);
        }
        else {
            if(position == 0 ){  // insert at Pos 0
                newNode.setSuccessor(mStartNode);
                mStartNode = newNode;
                newNode.setContent(newValue);
            }
            else { // insert at Pos position & not Pos 0
                ListNode predecessor;
                predecessor = getNode(position-1);
                newNode.setSuccessor(predecessor.getSuccessor());
                predecessor.setSuccessor(newNode);
                newNode.setContent(newValue);
            }
        }
    }

    public ListNode getNode(int position){
        ListNode Node;
        Node = mStartNode;
        for (int i = 0; i < position; i++){
            Node = Node.getSuccessor();
        }
        return  Node;
    }

    public int size(){
        int size;
        ListNode currentNode;

        size = 0;
        currentNode = mStartNode;

        while (currentNode != null) {
            size++;
            currentNode = currentNode.getSuccessor();
        }
        return size;
    }

    int getValueOfNode(int position){
        return getNode(position).getContent();
    }

    int[] toArray(){
        int[] result;

        result = new int[size()];

        for(int j = 0; j < size(); j++){
            result[j] = getValueOfNode(j);
        }
        return result;
    }

    int getFirst(){
        return getNode(0).getContent();
    }

    public void remove(int pos){
        if(pos == 0){
            mStartNode = getNode(0).getSuccessor();
        }
        else{
            getNode(pos-1).setSuccessor(getNode(pos+1));
        }
    }
}