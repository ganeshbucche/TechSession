// Linked List using Java
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void addBegin(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Insert node after a given value

void insertAfter(int key, int data) {

    if (head == null) {
        System.out.println("Linked List is empty.");
        return;
    }

    Node temp = head;

    while (temp != null && temp.data != key) {
        temp = temp.next;
    }
    if (temp == null) {
        System.out.println("Node not found.");
        return;
    }

    Node newNode = new Node(data);

    newNode.next = temp.next;
    temp.next = newNode;

    System.out.println("Node inserted after " + key);
}

    void insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    void traverse() {

        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        Node temp = head;

        System.out.print("Linked List: ");

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}

public class linklist {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int ch;

        do {

            System.out.println("1. Add at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3.Add add the between");
            System.out.println("4. Traverse");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter value: ");
                    int val1 = sc.nextInt();

                    list.addBegin(val1);

                    System.out.println("Node added at beginning.");
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    int val2 = sc.nextInt();

                    list.insertEnd(val2);

                    System.out.println("Node inserted at end.");
                    break;

                case 3:

    System.out.print("Enter node value after which to insert: ");
    int key = sc.nextInt();

    System.out.print("Enter new value: ");
    int newVal = sc.nextInt();

    list.insertAfter(key, newVal);

    break;
                     



                case 4:
                    list.traverse();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (ch != 0);

        sc.close();
    }
}