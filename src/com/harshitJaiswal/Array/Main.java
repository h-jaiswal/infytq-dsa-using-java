package com.harshitJaiswal.Array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int capacity = 10; // is final needed as it is in c++ ?
        char arr[] = new char[capacity];

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt(); scanner.nextLine();

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextLine().charAt(0);
            // Apparently, next().charAt(0) may fail to read space as character?
        }

        int pos = scanner.nextInt(); scanner.nextLine();
        char val = scanner.nextLine().charAt(0);

        size = ArrayTest.insert(arr, capacity, size, pos, val);

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

        int posDelete = scanner.nextInt(); scanner.nextLine();

        size = ArrayTest.delete(arr, capacity, size, posDelete);

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}
