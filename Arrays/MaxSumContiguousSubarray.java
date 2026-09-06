package Arrays;

import java.util.*;

public class MaxSumContiguousSubarray{

    public int maxSumSubarray(int[] nums){

        int sum = 0;

        int maxSum = Integer.MIN_VALUE;

        for(int i = 0;i <nums.length;i++){

            //step 1 : Calculate sum

            sum += nums[i];

            //step 2 : Compute maxSum
            
                maxSum = Math.max(sum,maxSum);

            // step 3 : Update sum based on condition  
            if(sum < 0){

                sum = 0;

            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();

        int nums[] = new int[n];
        System.out.println("Enter Array Elements : ");

        for(int i = 0;i < n;i++){

            nums[i] = sc.nextInt();

        }

        MaxSumContiguousSubarray mObj = new MaxSumContiguousSubarray();

        int result = mObj.maxSumSubarray(nums);

        System.out.println("Maximum Sum of Contiguous Subarray: "+ result);

        sc.close();

    }
    
}