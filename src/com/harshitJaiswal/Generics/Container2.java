package com.harshitJaiswal.Generics;

import java.util.Scanner;

public class Container2 {
//    Generic method
    public static <T> void display(T[] t, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(t[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] foods = new String[100];
        System.out.println("Enter number of dishes: ");
        int sizeFoods = scanner.nextInt(); scanner.nextLine();

        for (int i = 0; i < sizeFoods; i++) {
            foods[i] = scanner.nextLine();
        }

        System.out.println("You've entered:");
        Container2.display(foods, sizeFoods);
    }
}