package Arrays;
import java.util.*;
public class NoOfOccurrence {

    static int getLowerBound(int[] arr,int target){

        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = n;

        while(start <= end){

            int mid = start + (end - start)/2;

            if(arr[mid] >= target){

                ans = mid;
                end = mid -1;

            }else{

                start = mid + 1;

            }
        }

        return ans;

    }

    static int getUpperBound(int[] arr,int target){

        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = n;

        while(start <= end){

            int mid = start + (end-start)/2;

            if(arr[mid] > target){

                ans = mid;
                end = mid - 1;
            
            }else{

                start = mid + 1;

            }
        }

        return ans;

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter Array Elements : ");
        for(int i = 0; i< size;i++){

            arr[i] = sc.nextInt();

        }

        System.out.println("Enter target");
        int target = sc.nextInt();

        int lBIndex = getLowerBound(arr, target);
        int uBIndex = getUpperBound(arr, target);

        int occ = uBIndex - lBIndex;

        System.out.println(target+" has Occured "+ occ+" times");

        sc.close();
    }
    
}
