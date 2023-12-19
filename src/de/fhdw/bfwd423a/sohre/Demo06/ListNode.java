package de.fhdw.bfwd423a.sohre.Demo06;

public class ListNode {
    int mContent;
    ListNode mSuccessor;

     ListNode getSuccessor() {
        return mSuccessor;
    }

    public int getContent() {
        return mContent;
    }

    void setContent(int pContent) {
        this.mContent = pContent;
    }

    void setSuccessor(ListNode pSuccessor) {
        this.mSuccessor = pSuccessor;
    }
}
