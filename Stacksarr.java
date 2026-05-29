import java.util.Scanner;

public class Stacksarr {

    static final int N = 5;

    static int[] stack = {1, 2, 3, 4, 5};
    static int top = N - 1;

    static void push(int value)
    {
        if (top == N - 1)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            top++;
            stack[top] = value;
        }
    }

    static int pop()
    {
        if (top == -1)
        {
            System.out.println("Stack Underflow");
            return -1;
        }
        else
        {
            return stack[top--];
        }
    }

    static int peek()
    {
        if (top == -1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else
        {
            return stack[top];
        }
    }

    static boolean isFull()
    {
        return top == N - 1;
    }

    static boolean isEmpty()
    {
        return top == -1;
    }

    static void display()
    {
        if (top == -1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Stack elements are:");

            for (int i = top; i >= 0; i--)
            {
                System.out.print(stack[i] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int ch, value;

        do
        {
            System.out.println("\nEnter choice:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Is Full");
            System.out.println("5. Is Empty");
            System.out.println("6. Display");
            System.out.println("0. Exit");

            ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                    System.out.print("Enter value to push: ");
                    value = sc.nextInt();
                    push(value);
                    break;

                case 2:
                    value = pop();

                    if(value != -1)
                    {
                        System.out.println("Popped element = " + value);
                    }

                    break;

                case 3:
                    value = peek();

                    if(value != -1)
                    {
                        System.out.println("Top element = " + value);
                    }

                    break;

                case 4:
                    if(isFull())
                    {
                        System.out.println("Stack is Full");
                    }
                    else
                    {
                        System.out.println("Stack is not Full");
                    }

                    break;

                case 5:
                    if(isEmpty())
                    {
                        System.out.println("Stack is Empty");
                    }
                    else
                    {
                        System.out.println("Stack is not Empty");
                    }

                    break;

                case 6:
                    display();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(ch != 0);

        sc.close();
    }
}