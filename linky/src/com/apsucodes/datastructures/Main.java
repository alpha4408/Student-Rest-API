package com.apsucodes.datastructures;


class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

public class Main {

    public static Node LinkedList(){
        // This is the creation of the different nodes of our linkedlist.
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        // linking the nodes together

        Node head = node1;
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        return head;

    }

    public static void main(String[] args) {
        // write your code here
    }

}
