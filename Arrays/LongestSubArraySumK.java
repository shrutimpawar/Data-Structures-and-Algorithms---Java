package Arrays;

import java.util.*;

public class LongestSubArraySumK {

    static int longestSubarray(int[] arr,int k){

        HashMap<Integer,Integer> map = new HashMap<>();

        int prefixSum = 0;
        int maxLength = 0;
        map.put(0,-1);

        for(int i = 0; i< arr.length;i++){

            prefixSum += arr[i];

            int required = prefixSum - k;

            if(map.containsKey(required)){

                int length = i - map.get(required);
                maxLength = Math.max(length,maxLength);

            }

            if(!map.containsKey(prefixSum)){

                map.put(prefixSum,i);

            }
        }

        return maxLength;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter Array Elements : ");
        for(int i = 0; i < size;i++){

            arr[i] = sc.nextInt();

        }

        System.out.println("Enter the required Sum : ");
        int k = sc.nextInt();

        int ans = longestSubarray(arr, k);
        System.out.println("Length of longest SubArray of given sum is : "+ ans);

        sc.close();
    }
    
}
