package com.harshitJaiswal.LinkedList;

/*
*
* NOTE
*
* THIS IS A BULLSHIT CODE*/


public class ShiftLinkedList {
    public static void main(String args[]) {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.addAtEnd("ABC");
        linkedList1.addAtEnd("DFG");
        linkedList1.addAtEnd("XYZ");
        linkedList1.addAtEnd("EFG");
        linkedList1.addAtEnd("PQR");

        LinkedList linkedList2 = new LinkedList();
        linkedList2.addAtEnd("ABC");
        linkedList2.addAtEnd("DFG");
        linkedList2.addAtEnd("XYZ");
        linkedList2.addAtEnd("EFG");
        linkedList2.addAtEnd("PQR");

        System.out.println("Initial List");
        linkedList1.display();

        System.out.println("\nList after left shifting by 2 positions");
        shiftListLeft(linkedList1, 2);
        linkedList1.display();

        System.out.println("\nInitial List");
        linkedList2.display();

        System.out.println("\nList after right shifting by 2 positions");
        shiftListRight(linkedList2, 2);
        linkedList2.display();
    }

    public static void shiftListRight(LinkedList linkedList, int n) {
        Node node = linkedList.getHead();

        if (n == 0 || linkedList.getHead() == null) {
            return;
        }

        int length = 0;

        while (node != null) {
            node = node.getNext();
            length++;
        }

        n = length-n;

        shiftListLeft(linkedList, n);
    }

    public static void shiftListLeft(LinkedList linkedList, int n) {
        Node node = linkedList.getHead();

        if (n == 0 || linkedList.getHead() == null) {
            return;
        }

        LinkedList tempList = new LinkedList();
        while (node != null && n > 0) {
            tempList.addAtEnd(node.getData());
            node = node.getNext();
            n--;
        }

        if (node == null) {
            return; // n was >= number of nodes
        }

//      shift nodes starting from nth node to front
        Node toNode = linkedList.getHead();
        Node fromNode = node;
        while (fromNode != null) {
            toNode.setData(fromNode.getData());
            toNode.setNext(fromNode.getNext());

            toNode = toNode.getNext();
            fromNode = fromNode.getNext();
        }

//      copy nodes from tempList starting after nth node
        fromNode = tempList.getHead();

        toNode = linkedList.getHead();
        while (toNode.getNext() != null) {
            toNode = toNode.getNext();
        }

        while (fromNode != null) {
            toNode.setNext(fromNode);
            toNode = toNode.getNext();
            fromNode = fromNode.getNext();
        }

    }
}