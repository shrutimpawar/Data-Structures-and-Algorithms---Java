package Arrays;

import java.util.*;

public class MultiplyBy10 {

    public static int[] multiplyBy10(int arr[]){

        int size = arr.length;
        int newArray[] = new int[size];

        for(int i = 0; i < size;i++){

            int element = arr[i];
            int newEle = element * 10;
            newArray[i] = newEle;
        }
 
        // return updated array 

        return newArray;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size : ");
        int size = sc.nextInt();
        

        int arr[] = new int[size];
        System.out.println("Enter Array Elements : ");
        for(int i =0;i<size;i++){

            arr[i] = sc.nextInt();
        }

        int ans[] = multiplyBy10(arr);

        System.out.println("New Array after multiplying each element by 10: ");
        for(int num : ans){

            System.out.print(num+ " ");
        }
    }
    
}
