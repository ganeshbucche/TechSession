import java.util.*;

public class maxminarr{
    public static void main(String args[]){

        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter array elements: ");
        
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];



        for(int i = 1 ; i < n ; i++){

            if(arr[i] > max){
                max = arr[i];

            }

            if(arr[i]<min){
                min = arr[i];
            }

        }

        System.out.println("Max is: "+ max);
        System.out.println("Min is : "+ min);
    }
}