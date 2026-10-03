package Arrays;

import java.util.*;

public class AggressiveCow {

    static boolean isValidAns(int arr[],int k,int minDist){

        int cowCount = 1;
        int lastPosition = 0;

        for(int i = 1;i < arr.length;i++){

            if(arr[i] - arr[lastPosition] >= minDist){

                cowCount++;
                lastPosition = i;

            }
            if(cowCount >= k){

                return true;

            }
        }

        return false;

    }

    public int aggressiveCow(int arr[],int k){

        Arrays.sort(arr);

        int n = arr.length;
        int start = 1;
        int ans = -1;
        int end = arr[n-1] - arr[0];

        while(start <= end){

            int mid = start + (end - start)/2;

            if(isValidAns(arr, k, mid)){

                ans = mid;
                start = mid + 1;

            }else{

                end = mid -1;

            }
        }

        return ans;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size :");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter Array Elements : ");
        for(int i = 0; i< arr.length;i++){

            arr[i] = sc.nextInt();

        }

        System.out.println("Enter no of cows: ");
        int k = sc.nextInt();

        AggressiveCow cow = new AggressiveCow();
        System.out.println("Minimum Distance : "+cow.aggressiveCow(arr, k));

        sc.close();
    }
    
}
