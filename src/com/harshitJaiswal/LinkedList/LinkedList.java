package com.harshitJaiswal.LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void addAtEnd(String data) {
        Node node = new Node(data);
        node.setNext(null);

        if (this.head == null) {
//          If the list is empty, initialise the head and tail with this new node
            this.head = this.tail = node;
        } else {
//          If the list is not empty, put the new node afer tail
            this.tail.setNext(node);
//          Then, Make the new node as the current tail
            this.tail = node;
        }
    }

    public void addAtBegining(String data) {
        Node node = new Node(data);
        node.setNext(null);

        if (this.head == null) {
//          If the list is empty, initialise the head and tail with this new node
            this.head = this.tail = node;
        } else {
//          If the list is not empty, put new node before head i.e. put the head after new node
            node.setNext(this.head);
//          Then, Make the new node as the current head
            this.head = node;
        }
    }

    public int length() {
        Node node = this.head;
        int length = 0;

        while (node != null) {
            node = node.getNext();
            length++;
        }

        return length;
    }
    public void display() {
//      If list not empty, Display list
        Node currentNode = this.head;

        while(currentNode != null) {
            System.out.print(currentNode.getData() + "\t");
            currentNode = currentNode.getNext();
        }
        return;
    }

    public Node find(String data) {
//      If list is not empty, find the node
        if(this.head != null) {
            Node currentNode = this.head;
            while(currentNode != null) {
                if (currentNode.getData().equals(data)) {
                    return currentNode;
                }
                currentNode = currentNode.getNext();
            }
        }
//      If list is empty, or node not found
        return null;
    }

//    public void insert(String data, String dataBefore) {}

    public void delete(String data) {
        if(this.head != null) {
            Node nodeBefore = this.head;

            if (nodeBefore.getData().equals(data)) {
                this.head = this.tail = null;
                return;
            }

            Node node = nodeBefore.getNext();
            while (node != null) {
                if (node.getData().equals(data)) {
                    Node nodeAfter = node.getNext();
                    nodeBefore.setNext(nodeAfter);
                }
                node = nodeBefore.getNext();
                nodeBefore = node;
            }
        }
        return;
    }

}

