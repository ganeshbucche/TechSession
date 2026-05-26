import java.util.*;

public class powerusingrecursion {

    public static int pow(int x, int n) {

        if(n == 0) {
            return 1;
        }

        return x * pow(x, n - 1);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int x = sc.nextInt();

        System.out.print("Enter the exponent: ");
        int n = sc.nextInt();

        int result = pow(x, n);

        System.out.println("Power is: " + result);
    }
}