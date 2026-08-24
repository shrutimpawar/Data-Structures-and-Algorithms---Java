package Arrays;

import java.util.*;

public class TwoSum {

    public int[] twoSum(int arr[],int target){

        int n = arr.length;

        for(int i = 0 ;i <n-1;i++){

            for(int j = i+1;j<n;j++){

                if(arr[i] + arr[j] == target){

                    int ans[] = {i,j};
                    return ans;
                }


            }
        }

        int ans[] = {};
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter Array Elements : ");
        for(int i = 0;i <size;i++){

            arr[i] = sc.nextInt();

        }

        System.out.println("Enter Target Element : ");
        int target = sc.nextInt();

        TwoSum obj = new TwoSum();
        
        int result[]  = obj.twoSum(arr,target);

        System.out.println("Two Sum indexes : " + Arrays.toString(result));

        
    }
    
}
