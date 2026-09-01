package Arrays;
import java.util.*;

public class FindDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array Elements : ");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicate Elements : ");

        for(int i = 0; i < n; i++) {

            boolean alreadyPrinted = false;

            for(int k = 0; k < i; k++) {

                if(arr[i] == arr[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if(alreadyPrinted) {
                continue;
            }

            int count = 0;

            for(int j = 0; j < n; j++) {

                if(arr[i] == arr[j]) {
                    count++;
                }
            }

            if(count > 1) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}