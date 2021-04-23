package com.harshitJaiswal.Generics;

import java.util.Scanner;

public class Container<T> {
    T[] t;  // T t[] is called C-style declaration of array
    int size;

    public T[] getT() {
        return t;
    }

    public void setT(T[] t, int size) {
        this.t = t;
        this.size = size;
    }

    public void display() {
        for (int i = 0; i < this.size; i++) {
            System.out.println(this.t[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Container<String> container = new Container<>();
//        Container<String> container = new Container<String>();   //.Versions before Java 7
        String[] foods = new String[100];
        System.out.println("Enter number of dishes: ");
        int sizeFoods = scanner.nextInt(); scanner.nextLine();

        for (int i = 0; i < sizeFoods; i++) {
            foods[i] = scanner.nextLine();
        }

        System.out.println("You've entered:");
        container.setT(foods, sizeFoods);
        container.display();
    }
}

