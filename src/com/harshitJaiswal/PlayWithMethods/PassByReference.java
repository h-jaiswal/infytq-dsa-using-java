package com.harshitJaiswal.PlayWithMethods;

import java.util.Scanner;

public class PassByReference {
    public void output(int[] numbers) {
        for (int number:
             numbers) {
            System.out.println(number);
        }
    }
    public void input(int[] numbers) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter value #" + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

    }
    public static void main(String[] args) {
        int[] num = new int[5];
        PassByReference obj = new PassByReference();
        obj.input(num);
        obj.output(num);
    }
}
