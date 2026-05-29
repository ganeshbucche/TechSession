import java.util.*;

public class StackProgram {

    static final int N = 100;
    static int[] stack = new int[N];
    static int top = -1;

    // Push operation
    static void push(int value) {
        if (top == N - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = value;
        }
    }

    // Pop operation
    static int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return stack[top--];
        }
    }

    // Peek operation
    static int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top];
        }
    }

    // Check if stack is full
    static boolean isFull() {
        return top == N - 1;
    }

    // Check if stack is empty
    static boolean isEmpty() {
        return top == -1;
    }

    // Display stack elements
    static void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ch, value;

        do {
            System.out.println("\nEnter choice:");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.println("4: Peek");
            System.out.println("5: Is Full");
            System.out.println("6: Is Empty");
            System.out.println("0: Exit");

            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter push element: ");
                    value = sc.nextInt();
                    push(value);
                    break;

                case 2:
                    value = pop();
                    if (value != -1) {
                        System.out.println("Popped " + value);
                    }
                    break;

                case 3:
                    display();
                    break;

                case 4:
                    value = peek();
                    if (value != -1) {
                        System.out.println("Top = " + value);
                    }
                    break;

                case 5:
                    if (isFull()) {
                        System.out.println("Stack is full");
                    } else {
                        System.out.println("Stack is not full");
                    }
                    break;

                case 6:
                    if (isEmpty()) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Stack is not empty");
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (ch != 0);

        sc.close();
    }
}