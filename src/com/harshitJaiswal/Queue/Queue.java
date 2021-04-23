package com.harshitJaiswal.Queue;

public class Queue {
    int front;
    int rear;
    int capacity;

    String[] arr;

    Queue(int capacity) {
        this.front = 0;
        this.rear = -1;

        this.capacity = capacity;
        arr = new String[capacity];
    }

    public boolean isFull() {
        if (rear == capacity - 1) {
            return true;
        }
        return false;
    }
    public boolean enqueue(String data) {
        if (!this.isFull()) {
//            arr[++rear] = data;
            rear += 1;
            arr[rear] = data;
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (front > rear) {
            return true;
        }
        return false;
    }

    public String dequeue() {
        if (!this.isEmpty()) {
//          String data = arr[front];
//          arr[front++] = null; // Queue data type is String
          String data = arr[front];
          arr[front] = null; // Queue data type is String
          front += 1;

          return data;
        }
        return ""; // Empty queue
    }

    public void display() {
        if (!this.isEmpty()) {
            for (int i = front; i <= rear; i++) {
                System.out.println(arr[i]);
            }
        }
        return;
    }
}
