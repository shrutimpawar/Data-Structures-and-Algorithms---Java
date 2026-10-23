// Next Problem: Investment Trend
// Problem Statement

// An investor tracks the daily profit or loss of a stock. The values are stored in an integer array changes, where positive values represent profits and negative values represent losses.

// The investor wants to identify a continuous sequence of days that produces the maximum total profit. The sequence must contain at least one day.

// Your task is to return the maximum possible sum of any non-empty contiguous subarray.

// Example 1
// Input:
// changes = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

// Output:
// 6

package Arrays;

import java.util.Scanner;

public class InvestmentTrend {

    public static int maxProfit(int[] changes) {

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < changes.length;i++){

            sum += changes[i];

            maxSum = Math.max(sum,maxSum);

            if(sum < 0){

            sum = 0;

        }

        }

        return maxSum;
    }

    
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of days:");
    int n = sc.nextInt();

    int[] changes = new int[n];

    System.out.println("Enter daily profit/loss values:");
    for (int i = 0; i < n; i++) {
        changes[i] = sc.nextInt();
    }

    int result = maxProfit(changes);

    System.out.println("Maximum total profit = " + result);

    sc.close();
}

    
}
