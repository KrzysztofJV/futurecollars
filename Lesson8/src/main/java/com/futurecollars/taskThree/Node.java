package com.futurecollars.taskThree;

public class Node {

    public String data;
    public Node next;
    public Node previous;

    public Node() {
        this.next = null;
    }

    public Node(String data) {
        this.data = data;
        this.next = null;
    }
}
