package Arrays;

import java.util.*;

public class UniqueElements {

    static int findUniqueElements(int[] arr){

        int result = 0;

        for(int n : arr){

            result = result ^ n;
        }

        return result;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter Array Elements :  ");
        for(int i = 0; i< size;i++){

            arr[i] = sc.nextInt();

        }

        int unique = findUniqueElements(arr);
        System.out.print("Unique Element is : "+ unique);

        sc.close();

    }
    
}
