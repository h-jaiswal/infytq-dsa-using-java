package com.harshitJaiswal.Stack;

public class Stack {
    private int top;
    private int[] arr;

    private int capacity;

    public Stack(int capacity) {
        this.top = -1;
        this.capacity = capacity;
        arr = new int[capacity];
    }

    public boolean isFull() {
        if (this.top == this.capacity - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (this.top == -1) {
            return true;
        }
        return false;
    }

    public boolean push(int data) {
        if (!this.isFull()) {
//          arr[++top] = data;
            top += 1;
            arr[top] = data;
            return  true;
        }
        return false;
    }

    public int pop() {
        if (!this.isEmpty()) {
//          int data = arr[top--];
            int data = arr[top];
            top -= 1;
            return data;
        }
        return -1;
    }

    public int peek() {
        if (!this.isEmpty()) {
            int data = arr[top];
            return data;
        }
        return Integer.MIN_VALUE;  
    }

    public void display()
    {
        if (!this.isEmpty()) {
            for (int i = top; i > -1; i++) {
                System.out.println(this.arr[i]);
            }
        } else {
            System.out.println("Stack Empty");
        }
    }
}
