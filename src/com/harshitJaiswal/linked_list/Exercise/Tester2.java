package com.harshitJaiswal.linked_list.Exercise;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

/*
*
* SAME QUESTION as in Tester class but better approach by using cast
*
* IMP LINK
*
*   https://stackoverflow.com/questions/42236654/descendingiterator-for-java-util-list
*
* */

public class Tester2 {

//    Tester2.java uses unchecked or unsafe operations. Note: Recompile with -Xlint:unchecked for details. To solve this error, Added @SuppressWarnings("unchecked") from StackOverFlow Not sure if this is the best way

        @SuppressWarnings("unchecked")
        public static List<Object> concatenateLists(List<Object> listOne, List<Object> listTwo) {
            //Implement your logic here and change the return statement accordingly

            List<Object> list = new LinkedList<>();
            list.addAll(listOne);

            Iterator<Object> descendingIterator = ((LinkedList)(listTwo)).descendingIterator();

            while (descendingIterator.hasNext()) {
                list.add(descendingIterator.next());
            }
            return list;
        }

        public static void main(String args[]) {
            List<Object> listOne = new LinkedList<Object>();
            listOne.add("Hello");
            listOne.add(102);
            listOne.add(25);
            listOne.add(38.5);

            List<Object> listTwo = new LinkedList<Object>();
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