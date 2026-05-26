
public class bubblesort {

    public static void bubsort(int arr[]) {

        for(int a = 0; a < arr.length - 1; a++) {

            for(int j = 0; j < arr.length - 1 - a; j++) {

                if(arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printarray(int arr[]) {

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String args[]) {

        int arr[] = {6,4,5,3,5,5};

        bubsort(arr);

        printarray(arr);
    }
}