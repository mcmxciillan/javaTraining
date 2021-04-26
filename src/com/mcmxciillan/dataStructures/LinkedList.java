package com.mcmxciillan.dataStructures;

public class LinkedList {

    public Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }
    }

    public LinkedList addNode(LinkedList linkedList, int data) {
        Node newNode = new Node(data);
        newNode.next = null;

        if (linkedList.head == null) {
            linkedList.head = newNode;
            return linkedList;
        }
        Node nextNode = linkedList.head;
        while (nextNode.next != null) {
            nextNode = nextNode.next;
        }
        nextNode.next = newNode;
        return linkedList;
    }

    public LinkedList addNodeAtPosition(LinkedList linkedList, int data, int position) {
        Node newNode = new Node(data);
        Node currentNode = linkedList.head;
        int index = 1;
        while (index != position) {
            currentNode = currentNode.next;
            index++;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;

        return linkedList;
    }

    // Todo WIP
    public LinkedList reverseList (LinkedList linkedList) {
        return new LinkedList();
    }
}
