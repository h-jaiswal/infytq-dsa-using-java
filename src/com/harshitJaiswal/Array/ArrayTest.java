package com.harshitJaiswal.Array;

public class ArrayTest {
    public static int insert(char[] arr, int capacity, int size, int pos, char val) {
        if (size < capacity) {
            for (int i = size; i >= pos; i--) {
                arr[i] = arr[i-1];
            }
            arr[pos-1] = val;
            size = size + 1;
            return size;
        }
        return -1; // Insertion failed
    }

    public  static int delete(char[] arr, int capacity, int size, int pos) {
        if (pos <= size) {
            for (int i = pos; i < size; i++) {
                arr[pos-1] = arr[pos];
            }
//        arr[arr.length -1] = '\u0000';
            size = size - 1;
            return  size;
        }
        return -1; // Deletion Failed
    }
}
