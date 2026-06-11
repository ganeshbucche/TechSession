import java.util.*;
public class gfg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,5,7,8,5};

        /* 
        int max = arr[0];

        for(int i = 0 ; i < arr.length;i++){
            if(arr[i] > max){
               max= arr[i];
            }
            

        }
        System.out.print(max);
        sc.close();
        */

        //two sum
        int target = 52;

        for(int i = 0 ; i < arr.length; i++){
            for(int j = i+1 ;  j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.print("Found");
                    return;  // here we stop program if found
                    
                }
            }
            
        }
        System.out.print("Not found");
        
        sc.close();
    }
}