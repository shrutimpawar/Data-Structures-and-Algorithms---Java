// 1. Employee Record Reversal
// Problem

// A company stores employee IDs in the order in which employees entered the office. For an end-of-day report, the IDs must be displayed in reverse order.

// Write a program to reverse the array.

// Input Format
// First line: N
// Second line: N space-separated integers
// Output Format

// Print the reversed array.

// Constraints
// 1 ≤ N ≤ 10^5
// -10^9 ≤ arr[i] ≤ 10^9
// Example 1
// Input:
// 5
// 10 20 30 40 50

// Output:
// 50 40 30 20 10
// Example 2
// Input:
// 1
// 25

// Output:
// 25
// Test cases you should check
// [1,2,3,4,5]
// [1,2,3,4]
// [7]
// [-1,-2,-3]
// [5,5,5,5]
// [-10,20,-30,40]


package Scenario;

import java.util.*;

public class EmployeeRecordReversal {

    static void employeeRecord(int arr[]){

        int n = arr.length;

        int start = 0;
        int end = n-1;

        while(start < end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start ++;
            end --;
        }

        System.out.println("Reversed Array : ");
        for(int a : arr){

            System.out.print(a+" ");

        }
        System.out.println();

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Employess:  ");
        int emp = sc.nextInt();

        int id[] = new int[emp];
        System.out.println("Enter ID's of employees : ");
        for(int i = 0;i < emp ;i++){

            id[i] = sc.nextInt();

        }

        employeeRecord(id);
        sc.close();
    } 
    
}
