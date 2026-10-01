package Arrays;

import java.util.*;

public class PeakIndexMountain {

    static int peakIndex(int[] arr){

        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = -1;

        while(start <= end){

            int mid = start + (end - start)/2;

            if(arr[mid] >= arr[mid+1]){

                ans = mid;
                end = mid-1;

            }else{

                start = mid + 1;

            }
        }

        return ans;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter Array Elements : ");

        for(int i = 0;i < size;i++){

            arr[i] = sc.nextInt();

        }

        int res = peakIndex(arr);

        System.out.println("Peak index is : "+ res);

        sc.close();
    }
    
}
