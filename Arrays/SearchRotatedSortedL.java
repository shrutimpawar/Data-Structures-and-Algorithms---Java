package Arrays;
import java.util.*;
public class SearchRotatedSortedL {

    public static int findPivotIndex(int[] nums){

        int start = 0;
        int end = nums.length - 1;

        while(start < end){

            int mid = start + (end - start)/2;

            if(nums[mid] > nums[end]){

                start = mid + 1;
            }else{

                end = mid;
            }
        }

        return start;
    }

    public static int binarySearch(int[] nums,int start,int end,int target){

        while(start <= end){

            int mid = start + (end - start)/2;

            if(nums[mid] == target){

                return mid; 
            }
            else if(nums[mid] < target){

                start = mid + 1;

            }else{

                end = mid - 1;

            }
        }

        return -1;
    }

    public static int search(int[] nums,int target){

        if(nums == null || nums.length == 0){
            return -1;
        }

        int n = nums.length;
        int pivotIndex = findPivotIndex(nums);

        if(pivotIndex > 0 &&
            target >= nums[0] &&
            target <= nums[pivotIndex-1]
        ){

            return binarySearch(nums, 0, pivotIndex - 1, target);
        }
        return binarySearch(nums, pivotIndex,n-1, target);

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter Array Elements :");
        for(int i = 0;i < size;i++){

            arr[i] = sc.nextInt();

        }

        System.out.println("Enter target key : ");
        int key = sc.nextInt();

        int ans = search(arr, key);
        System.out.println("Index of target is :"+ans);
        sc.close();
    }

    
}
