package Arrays;

import java.util.*;

public class ElementShift1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter Array Elements : ");
        for(int i = 0;i < size;i++){

            arr[i] = sc.nextInt();

        }

        
        int temp = arr[size - 1];
        for(int i = size - 1;i >0 ;i--){

            arr[i] = arr[i-1];

        }
        arr[0] = temp;

        System.out.print("Shifted array : ");

        for(int num : arr){

            System.out.print(num+ " ");
        }


    }
    
}
