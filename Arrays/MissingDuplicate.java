package Arrays;
import java.util.*;

public class MissingDuplicate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Range : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " Array Elements from 1 to " + n + " : ");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int missing = 0;
        int duplicate = 0;

        for(int i = 1; i <= n; i++) {

            int count = 0;

            for(int j = 0; j < n; j++) {

                if(arr[j] == i) {
                    count++;
                }
            }

            if(count == 0) {
                missing = i;
            }

            if(count > 1) {
                duplicate = i;
            }
        }

        System.out.println("Missing Number : " + missing);
        System.out.println("Duplicate Number : " + duplicate);

        sc.close();
    }
}