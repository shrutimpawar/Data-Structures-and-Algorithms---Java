package Arrays;
import java.util.*;

public class UnsortedInSorted {

    static int getUnsortedElement(int arr[]){

        for(int i = 0;i<arr.length;i++){

            if(arr[i+1] <= arr[i]){

                return arr[i+1];

            }
        }

        return -1;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter array elements : ");
        for(int i = 0;i< size;i++){

            arr[i] = sc.nextInt();

        }

        int ans = getUnsortedElement(arr);
        System.out.println("Unsorted Part : " + ans);
    }
}
