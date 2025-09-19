package org.developer.dsa.a_beginner.b_linked_list;

public class DoublyLinkedList {

    private DoubleListNode head;
    private DoubleListNode tail;

    public DoublyLinkedList() {
        this.head = new DoubleListNode(-1);
        this.tail = new DoubleListNode(-1);
        head.next = tail;
        tail.prev = head;
    }

    public void insertHead(int val) {
        DoubleListNode newNode = new DoubleListNode(val);

        newNode.next = head.next;
        newNode.prev = head;

        newNode.next.prev = newNode;
        head.next = newNode;
    }

    public void insertTail(int val) {
        DoubleListNode newNode = new DoubleListNode(val);

        newNode.prev = tail.prev;
        newNode.next = tail;

        newNode.prev.next = newNode;
        tail.prev = newNode;
    }

    public void removeHead() {
        head.next.next.prev = head;
        head.next = head.next.next;
    }

    public void removeTail() {
        tail.prev.prev.next = tail;
        tail.prev = tail.prev.prev;
    }

    public void print() {
        DoubleListNode curr = head.next;
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
}


