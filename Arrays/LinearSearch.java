package Arrays;
import java.util.Scanner;

public class LinearSearch{

    static boolean findTarget(int arr[],int target){

        for(int i = 0; i<arr.length;i++){

            if(arr[i] == target){
                return true;
            }
        }

        // if we didn't find the element after traversing entire array then we will retuen false.
        return false;
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

        System.out.println("Enter the target element : ");
        int target  = sc.nextInt();

        boolean ans = findTarget(arr, target);
        System.out.println(ans);

        sc.close();
    }
}