// Problem 5 — Digital Wallet Audit
// A digital wallet records each transaction as an integer. Positive values represent deposits, and negative values represent withdrawals.

// Given an array transactions and an integer target, determine the number of continuous, non-empty transaction ranges whose sum equals target.

// Sample input
// transactions = [2, -1, 2, 1]
// target = 3

// Expected output
// 3

package Arrays;
import java.util.*;
public class DigitalWallet {

    public static long countRanges(int n, int[] transactions, int target) {

        HashMap<Long,Integer>map = new HashMap<>();

        long prefixSum = 0;
        long count = 0;

        map.put(0L,1);

        for(int i = 0; i < n;i++){

            prefixSum += transactions[i];

            long needed = prefixSum - target;

            if(map.containsKey(needed)){
                count += map.get(needed);
            }

            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }

        return count;
    }

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of transactions:");
    int n = sc.nextInt();

    int[] transactions = new int[n];

    System.out.println("Enter transaction amounts:");
    for (int i = 0; i < n; i++) {
        transactions[i] = sc.nextInt();
    }

    System.out.println("Enter target amount:");
    int target = sc.nextInt();

    long ans = countRanges(n, transactions, target);

    System.out.println("Number of subarrays with sum equal to target = " + ans);

    sc.close();
    }
    
}
