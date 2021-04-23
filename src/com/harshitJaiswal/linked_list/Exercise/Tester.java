package com.harshitJaiswal.linked_list.Exercise;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
/*
*
*
Given two lists, concatenate the second list in reverse order to the end of the first list and return the concatenated list. Implement the logic inside concatenateLists() method.

Note: Use descendingIterator() method to iterate over the elements in reverse order.

Test the functionalities using the main() method of the Tester class.
*
* */
public class Tester {

//        public static List<Object> concatenateLists(List<Object> listOne, List<Object> listTwo) {

        public static List<Object> concatenateLists(LinkedList<Object> listOne, LinkedList<Object> listTwo) {
        //Implement your logic here and change the return statement accordingly
        Iterator<Object> descendingIterator = listTwo.descendingIterator();

        List<Object> newList = new LinkedList<>();

        newList.addAll(listOne);
        while (descendingIterator.hasNext()) {
            newList.add(descendingIterator.next());
        }
        return newList;
    }


    public static void main(String args[]) {
        /**
         *
         * NOTE:
         *
         * Method Iterator<E> descendingIterator() is declared in the interace java.util.Deque<E> extends Queue<E>. LinkedList is an implementation of Deque, and List interface does not extend Deque.
         *
         * So if you change your code to the following, it should work.
         *
         * LinkedList<Object> listOld = new LinkedList<Object>();
         * Iterator x = listOld.descendingIterator();
         *
         */

//        List<Object> listOne = new LinkedList<Object>();
        LinkedList<Object> listOne = new LinkedList<>();
        listOne.add("Hello");
        listOne.add(102);
        listOne.add(25);
        listOne.add(38.5);

//        List<Object> listTwo = new LinkedList<>();
        LinkedList<Object> listTwo = new LinkedList<>();
        listTwo.add(150);
        listTwo.add(200);
        listTwo.add('A');
        listTwo.add("Welcome");


        List<Object> concatenatedList = concatenateLists(listOne, listTwo);

        System.out.println("Concatenated linked list:");
        for (Object value : concatenatedList) {
            System.out.print(value+" ");
        }
    }
}