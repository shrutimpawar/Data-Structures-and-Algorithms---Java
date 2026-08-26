package Arrays;
import java.util.*;

public class SubarrayGivenSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array Elements : ");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Target Sum : ");
        int target = sc.nextInt();

        int start = 0;
        int sum = 0;
        boolean found = false;

        for(int end = 0; end < n; end++) {

            sum = sum + arr[end];

            while(sum > target && start <= end) {
                sum = sum - arr[start];
                start++;
            }

            if(sum == target) {

                System.out.println("Subarray Found : ");

                for(int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }

                found = true;
                break;
            }
        }

        if(found == false) {
            System.out.println("Subarray Not Found");
        }

        sc.close();
    }
}