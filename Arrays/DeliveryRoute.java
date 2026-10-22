// Problem 4: Delivery Route Analytics
// Difficulty: Medium
// Language: Java 8
// Problem statement
// A delivery company tracks the number of parcels delivered by its drivers every hour. The records are stored in an integer array deliveries of length n.

// The manager wants to find the maximum number of parcels delivered during any continuous period of exactly k hours.

// Given the array deliveries and an integer k, return the maximum total number of parcels delivered in any consecutive k hours.
// Input format
// - First line: integer n, the number of hours recorded.
// - Second line: n space-separated integers representing parcels delivered each hour.
// - Third line: integer k, the duration of the period.
// Constraints
// - \(1 \le n \le 10^5\)
// - \(1 \le k \le n\)
// - \(0 \le deliveries[i] \le 10^9\)



package Arrays;
import java.util.*;
public class DeliveryRoute {

    public static long maxDeliveries(int n, int[] deliveries, int k) {

        long windowSum = 0;

        for(int i = 0 ;i < k ;i++){

            windowSum += deliveries[i];

        }

        long maxDel = windowSum;

        for(int end = k; end < n;end ++){

            windowSum = windowSum - deliveries[end - k] + deliveries[end];

            maxDel = Math.max(windowSum,maxDel);

        }

        return maxDel;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of hours recorded
        System.out.println("Enter number of hours:");
        int n = sc.nextInt();

        // Parcels delivered each hour
        int[] arr = new int[n];

        System.out.println("Enter parcels delivered each hour:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Duration of the period
        System.out.println("Enter duration k:");
        int k = sc.nextInt();

        long ans = maxDeliveries(n, arr, k);
        System.out.println("maximum total number of parcels delivered in any consecutive k hours : " + ans);

        sc.close();
    }
    
}
