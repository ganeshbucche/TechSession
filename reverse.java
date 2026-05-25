import java.util.Scanner;
public class reverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter a 3 digit number: ");
        int num = sc.nextInt();

        int first = num / 100;
        int second = (num / 10) % 10;
        int third = num % 10;

        int reverse = (third* 100)+(second * 10) + first;

        System.out.println("Reversed number is : "+ reverse);
    }
}