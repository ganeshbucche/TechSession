import java.util.*;

public class Capgeminique {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of semester: ");
        int n = sc.nextInt();

        int[] subjects = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter no of subjects in " + (i + 1) + " semester: ");
            subjects[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int max = -1;

            System.out.println("Marks obtained in semester " + (i + 1) + ":");

            for (int j = 0; j < subjects[i]; j++) {
                int mark = sc.nextInt();

                if (mark < 0 || mark > 100) {
                    System.out.println("You have entered invalid mark.");
                    sc.close();
                    return;
                }

                if (mark > max) {
                    max = mark;
                }
            }

            System.out.println("Maximum mark in " + (i + 1) + " semester:" + max);
        }

        sc.close();
    }
}