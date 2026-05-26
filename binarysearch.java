public class BinarySearch {

    public static void binarysearch(int numbers[], int key) {

        int start = 0;
        int end = numbers.length - 1;

        boolean flag = false;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                System.out.println("Element found at index " + mid);
                flag = true;
                break;
            }

            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (flag == false) {
            System.out.println("Element not found");
        }
    }

    public static void main(String args[]) {

        int numbers[] = {2, 3, 4, 5, 6, 7, 8};
        int key = 5;

        binarysearch(numbers, key);
    }
}