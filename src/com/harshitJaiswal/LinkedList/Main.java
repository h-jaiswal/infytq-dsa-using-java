package com.harshitJaiswal.LinkedList;

import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList list = new LinkedList();

//        String data = scanner.nextLine();
//        while (! data.equalsIgnoreCase("Stop")) {
//            list.addAtBegining(data);
//            data = scanner.nextLine();
//        }

        String data = scanner.nextLine();
        while (! data.equalsIgnoreCase("Stop")) {
            list.addAtEnd(data);
            data = scanner.nextLine();
        }

        list.display();

        String dataDelete = scanner.nextLine();
        list.delete(dataDelete);

        list.display();

        scanner.close();
    }
}
