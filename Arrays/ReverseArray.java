package Arrays;

import java.util.*;

public class ReverseArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter Array elements : ");
        for(int i = 0;i < size;i++){

            arr[i] = sc.nextInt();

        }

        int start = 0;
        int end = size -1;

        
        while(start < end){

            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];

            start ++;
            end --;

        }

        System.out.println("Reversed Array is : ");
        for(int i = 0;i < size;i++){

            System.out.print(arr[i]+" ");
        }
    }
    
}
