import java.util.*;

public class multipy2numbers{

    public static int multipy(int a , int b){
        if(b == 0){
            return 0;
        }
        return a + multipy(a,b-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");

        int a = sc.nextInt();

        System.out.print("enter the second number: ");

        int b = sc.nextInt();

        int result = multipy(a ,b);

        System.out.println("Multiplication is : "+ result);
    }
}