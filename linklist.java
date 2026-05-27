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

    void insert(int data) {
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
            System.out.println("1. Insert Node");
            System.out.println("2. Traverse List");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();

                    list.insert(value);

                    System.out.println("Node inserted successfully.");
                    break;

                case 2:
                    list.traverse();
                    break;

                case 0:
                    System.out.println("Program exited.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (ch != 0);

        sc.close();
    }
}