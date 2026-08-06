package Arrays;

import java.util.*;

public class AvgArray{

    public static void inputArray(int arr[],Scanner sc){

        System.out.println("Enter Array Elements : ");

        for(int i = 0;i <arr.length;i++){

            arr[i] = sc.nextInt();

        }
    }

    public static void displayArray(int arr[]){

        System.out.println("Array is : ");

        for(int num : arr){

            System.out.print(num + " ");

        }
        System.out.println();
    }

    public static int findSum(int arr[]){

        int sum = 0;
        for(int num : arr){

            sum += num;
        }

        return sum;
    }

    public static double findAvg(int arr[]){

        int sum = findSum(arr);
        return (double) sum /arr.length;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter array size : " );
        int size = sc.nextInt();

        int arr[] = new int[size];

        inputArray(arr, sc);
        displayArray(arr);

        System.out.println("Sum of array is : "+ findSum(arr));
        System.out.println("Avg of Array is  : "+findAvg(arr));
    }

}
























// public class AvgArray {

//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter Array Size : ");
//         int size = sc.nextInt();
        
//         int arr[] = new int[size]; 
//         System.out.println("Enter Array Elements : ");
//         for(int i = 0;i <size;i++){

//             arr[i] = sc.nextInt();

//         }

//         int sum = 0;
//         int avg = 0;

//         System.out.println("Array is : ");

//         for(int i = 0; i< size;i++){

//             sum = sum + arr[i];
//             avg = sum / size;

//             System.out.print(arr[i]+ " ");

//         }
//         System.out.println();

//         System.out.println("Average of Array is : "+avg);
//     }
    
// }
