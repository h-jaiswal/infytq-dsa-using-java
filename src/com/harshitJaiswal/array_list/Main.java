package com.harshitJaiswal.array_list;

import java.util.*;

public class Main {
    public static void test1() {
        Scanner scanner = new Scanner(System.in);

        // ArrayList reference

        ArrayList<String> arrayList;

        // ArrayList instantiation

        // List<String> foods = new ArrayList<String>(); // Here <String> in ArrayList part is Explicit and can be replace by <> as shown below
        List<String> foods = new ArrayList<>();

        String choice;
        do {
            System.out.println("Want to enlist a food time? Y or N: ");
            choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("y")) {
                System.out.println("Enter food item name: ");
                foods.add(scanner.nextLine());
            } else {
                System.out.println("Have a nice day.");
            }

        } while (choice.equalsIgnoreCase("y"));

        // Traversal using for each and using iterators

        /*

        Iterator<String> food = foods.iterator(); // foods.iterator returns an iterator to the beginning (aka cursor is before the first element)
        // food.next() will give the the first element and move the iterator cursor after the first element
        // food.next() will now give second element and move the cursor after the second element
        // and so on
        // food.hasNext() checks that if there is an element after the cursor or not.

        while (food.hasNext()) {
            System.out.println( "I like " + food.next());
            foods.add("Heyyyyyyyyyy"); // GIVES ConcurrentModificationException
        }

        */

        for ( String food:
             foods) {
            System.out.println(food);
            foods.set(1, "Heyyyyy");    // DOES NOT throws any error as LIST SIZE is not being affected BUT only the element is being modified.
            // This modification of element immediately reflects in the LOOP VARIABLE food here.

            // in set or get method of ArrayList class here , the index must already exist otherwise IndexOutOfBound error is thrown
//            foods.add("Heyyyyyyyyyy");  // GIVES ConcurrentModificationException

        }

        for ( String food:
                foods) {
            System.out.println(food);
//            foods.add("Heyyyyyyyyyy");  // GIVES ConcurrentModificationException
        }

        System.out.println(foods.get(0));
        // Can give IndexOutOfBound error if specified index not present

        foods.set(1, "BYeeee");
        // Can give IndexOutOfBound error if specifed index not present
        System.out.println(foods.set(2, "BYeeeeeeeeeeeeeeeeeeeeeeeee")); // let see what this returns?

        System.out.println(foods.isEmpty()); // pretty clear what this does


        foods.remove(3);    // from ArrayList class

        System.out.println(foods.remove(3)); // this remove returns the Object remove from the index


        foods.remove("Harshit");        // from Collection interface ??????????? I don't know

        System.out.println(foods.remove("Harshit")); // this remove returns boolean


        foods.size();

        foods.lastIndexOf("Jaiswal");

        foods.indexOf("Harshit");


        foods.add(5, "KKKKHIIIIIIIBYEEEeeeeeeeeeeeeeee");
        // inserts the element in specified index after making space by shifting? Return void
        // IndexOutOfBound error if index not present in list

        foods.add("This is an object !");

        // foods.add(2); // IF I try to add other type other than  the type of ArrayList at the time of declaration it is giving compile time error

        // foods.addAll(Collection c)

        // foods.addAll(int index, Collection c)

        // boolean foods.contains(Object element);

        // foods.clear();

        // foods.iterator() return iterator

        // and many more methods from the List interface and the Collection interface

//        Collections.frequency( (Collection<String> )(foods),"Harshit");
        int f = Collections.frequency( foods,"Harshit");

        System.out.println(f);

        scanner.close();
    }

    public static void main(String[] args) {
        test1();
    }
}
