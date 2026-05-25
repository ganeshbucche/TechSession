import java.util.*;

public class ArrayInsertion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n + 1];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to insert: ");
        int element = sc.nextInt();

        System.out.print("Enter position: ");
        int pos = sc.nextInt();

        for(int i = n; i > pos - 1; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos - 1] = element;

        System.out.println("Array after insertion:");
        for(int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}