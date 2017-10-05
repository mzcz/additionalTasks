package com.additionaltasks;

import java.util.ArrayDeque;
import java.util.Deque;



public class Stack {
    public static void main (String[] args) {
        Node1 theNode1 = new Node1("node1");
        Node1 theNode2 = new Node1("node2");
        Node1 theNode3 = new Node1("node3");


        // Create the LIFO stack
        Deque<Node1> theNodes = new ArrayDeque<>();

        theNodes.push(theNode1);
        theNodes.push(theNode2);
        theNodes.push(theNode3);


        // Check size of the stack
        System.out.println("Stack is filled. It's size: " + theNodes.size());
        System.out.println();

        // Get objects from stack
        Node1 temporaryNode;
        temporaryNode = theNodes.pop();

        //temporaryNode = theNodes.pop();
        //temporaryNode = theNodes.pop();

         while(theNodes.size() > 0) {
             temporaryNode = theNodes.pop();
        }

        // Check size of the queue
        System.out.println("Stack is emptied. It's size: " + theNodes.size());
        System.out.println();

        // Check what was taken as last
        System.out.println("Last node taken from stack was:\n" + temporaryNode);
        System.out.println();

    }
}
class Node1 {
     String value;
    // private Node next;

    public Node1(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Node1{" +
                "value='" + value + '\'' +
                '}';
    }
}