package org.developer.dsa.a_beginner.b_linked_list;

public class Queue {
    private DoubleListNode head;
    private DoubleListNode tail;

    public Queue() {
        this.head = null;
        this.tail = null;
    }

    public void enQueue(int val) {
        DoubleListNode newNode = new DoubleListNode(val);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public int dequeue() {
        if (head == null) {
            System.exit(0);
        }
        int val = head.val;
        head = head.next;

        if (head == null) {
            tail = null;
        }
        return val;
    }

    public void print() {
        DoubleListNode current = head;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }
}
