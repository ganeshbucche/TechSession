import java.util.Scanner;
class Stacks{
    int top=-1;
    final int CAPACITY;
    int[] stack;
    Stacks(int size){
        top=-1;
        CAPACITY=size;
        stack = new int[CAPACITY];
    }
    public boolean isFull(){
        if(top==CAPACITY-1)
            return true;
        else
            return false;
    }
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        else{
            return false;
        }

    }
    public void push(int data) {
    if (top == stack.length - 1) {
        System.out.println("Stack Overflow");
        return;
    }

    stack[++top] = data;
}
   public int pop() {
    if (isEmpty()) {
        System.out.println("Stack is empty");
        return -1;
    }

    int data = stack[top];
    top--;
    return data;
}
    public void peek() {
    if (isEmpty()) {
        System.out.println("Stack is empty");
        return;
    }
    System.out.println("Top element: " + stack[top]);
}

public void traverse() {
    if (isEmpty()) {
        System.out.println("Stack is empty");
        return;
    }

    System.out.println("Stack elements:");
    for (int i = top; i >= 0; i--) {
        System.out.println(stack[i]);
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of stack: ");
        int n=sc.nextInt();
        Stacks st=new Stacks(n);
        while(true){
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. traverse");
            System.out.println("0. Exit");
            System.out.println("Select any choice: ");
            int ch=sc.nextInt();
            switch(ch){
           case 1:
    System.out.print("Enter data: ");
    int data = sc.nextInt();
    st.push(data);
    break;
            case 2: st.pop();break;
            case 3: st.peek(); break;
            case 4: st.traverse();break;
            case 0: System.exit(0);
            }
        }
    }
}