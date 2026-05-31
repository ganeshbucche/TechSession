
//Queue Implementation
import java.util.*;
class queueCRT{
    int queue[],size,front,rear;
    public queueCRT(int n){
     size=n;
     queue=new int[size];
     front=0;
     rear=-1;
    }
    public void insert(int data){
        if(isFull()){
                System.out.println("Queue is full");

        }
        else{
                ++rear;
                queue[rear]=data;
                System.out.println(data+ "is inserted");
        }
       
    }

        public boolean isFull(){
                if(rear == size -1){
                        return true;
                }
                else{
                        return false;
                }
        }
        public boolean isEmpty(){
                if(rear == -1)
                        return true;
                else
                        return false;

        }
    public int delete(){
    int data = -1;

    if(isEmpty()){
        System.out.println("Queue is empty");
    }
    else{
        data = queue[front];

        for(int i = 1; i <= rear; i++){
            queue[i - 1] = queue[i];
        }

        rear--;
    }

    return data;  
}
   public void display(){
    if(isEmpty()){
        System.out.println("Queue is empty");
    }
    else{
        System.out.println("Queue elements are:");

        for(int i = front; i <= rear; i++){
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }
}

    



   public int peek(){
    if(isEmpty()){
        System.out.println("Queue is empty");
        return -1;
    }

    return queue[front];
}
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Queue: ");
        int n=sc.nextInt();
        int data; boolean b;
        queueCRT obj=new queueCRT(n);
        while(true){
            System.out.println("\n1. Insert");
            System.out.println("2. Delele");
            System.out.println("3. Display");
            System.out.println("4. Peek");
            System.out.println("0. Exit");
            int ch=sc.nextInt();
            switch(ch){
            case 1: System.out.println("Enter data: ");
                    data=sc.nextInt();
                    obj.insert(data);
                    break;
            case 2: data=obj.delete();
                    System.out.println(data+" is Deleled");
                    break;
            case 3: obj.display();
                    break;
            case 4:
    data = obj.peek();
    if(data != -1)
        System.out.println("Front element is: " + data);
    break;
            case 0: System.exit(0);
            }
        }

    }
}



// reverse queue using stack