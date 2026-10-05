package Arrays;

import java.util.*;

public class PrefixSumLR {

    static int LRSum(int[]arr,int L,int R){

        int n = arr.length;

        int [] prefix = new int[n];

        prefix[0] = arr[0];

        for(int i = 1; i < n;i++){

            prefix[i] = prefix[i-1] + arr[i];

        }
        if (L == 0) {

            return prefix[R];

            
        }

        return prefix[R] - prefix[L -1];
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter Array Elements : ");
        for(int i = 0; i <arr.length;i++){

            arr[i] = sc.nextInt();

        }

        System.out.println("Enter L : ");
        int l = sc.nextInt();

        System.out.println("Enter R : ");
        int r = sc.nextInt();

        int result = LRSum(arr,l,r);
        System.out.println("Maximum Sum of Subarray : "+result);

        sc.close();
    }
    
}
