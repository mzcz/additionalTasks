package com.additionaltasks;

class Node {
    public String value;
    public  Node next;


    public Node(String value){
        this.value = value;
    }
}

class MyOwnStack {
    private Node head;
    private int n;

    public String  push(String value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        n++;
        return newNode.value;
    }

    public String pop(){

        if (size() == 0) return null;

        Node node = head;
        head = head.next;
        n--;
            return node.value;
    }

    public int size() {
        return n;
    }
}

public class Stack2 {

    public static void main (String[] args) {

        int mySizeStack =5;
        MyOwnStack myOwnStack = new MyOwnStack();

        myOwnStack.pop();

        for (int i=0;i < mySizeStack; i++ ) {
            String myNodeIn = myOwnStack.push("node" + i);
            System.out.println(" push " + myNodeIn);
        }

        System.out.println(" ");
        System.out.println(" size " + myOwnStack.size());
        System.out.println(" ");

        while (myOwnStack.size()>0) {
            String myNodeOut =  myOwnStack.pop();
            System.out.println(" pop " + myNodeOut);
        }

    }
}

