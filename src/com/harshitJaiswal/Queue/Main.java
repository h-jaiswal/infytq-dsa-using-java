package com.harshitJaiswal.Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        System.out.println("Queue created.\n");

        if (queue.enqueue("Joe"))
            System.out.println("The element is enqueued to the queue!\n");
        else
            System.out.println("Queue is full!\n");

        if (queue.enqueue("Jack"))
            System.out.println("The element is enqueued to the queue!\n");
        else
            System.out.println("Queue is full!\n");

        if (queue.enqueue("Eva"))
            System.out.println("The element is enqueued to the queue!\n");
        else
            System.out.println("Queue is full!\n");

        if (queue.enqueue("Mia"))
            System.out.println("The element is enqueued to the queue!\n");
        else
            System.out.println("Queue is full!\n");

        if (queue.enqueue("Luke"))
            System.out.println("The element is enqueued to the queue!\n");
        else
            System.out.println("Queue is full!\n");

        queue.display();

        if (queue.enqueue("Emma"))
            System.out.println("The element is enqueued to the queue!\n");
        else
            System.out.println("Queue is full!\n");

        String dequeuedElement = queue.dequeue();
        if (dequeuedElement == "empty")
            System.out.println("Queue is empty\n");
        else
            System.out.println("The element dequeued is : " + dequeuedElement + "\n");

        dequeuedElement = queue.dequeue();
        if (dequeuedElement == "empty")
            System.out.println("Queue is empty\n");
        else
            System.out.println("The element dequeued is : " + dequeuedElement + "\n");

        dequeuedElement = queue.dequeue();
        if (dequeuedElement == "empty")
            System.out.println("Queue is empty\n");
        else
            System.out.println("The element dequeued is : " + dequeuedElement + "\n");

        dequeuedElement = queue.dequeue();
        if (dequeuedElement == "empty")
            System.out.println("Queue is empty\n");
        else
            System.out.println("The element dequeued is : " + dequeuedElement + "\n");

        dequeuedElement = queue.dequeue();
        if (dequeuedElement == "empty")
            System.out.println("Queue is empty\n");
        else
            System.out.println("The element dequeued is : " + dequeuedElement + "\n");

        dequeuedElement = queue.dequeue();
        if (dequeuedElement == "")
            System.out.println("Queue is empty\n");
        else
            System.out.println("The element dequeued is : " + dequeuedElement + "\n");
    }
}
