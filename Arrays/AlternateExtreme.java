package Arrays;

import java.util.*;

public class AlternateExtreme {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size : ");
        int size= sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter Array Elements : ");
        for(int i = 0;i < size ;i++){

            arr[i] = sc.nextInt();

        }

        System.out.println("Alternate Extremes : ");
        int start = 0;
        int end = size - 1;

        while(start < end){

            if(start == end){
                System.out.print(arr[start] +" ");
            }else{
                System.out.print(arr[start] + " ");
                System.out.print(arr[end]+ " ");
            }

            start ++;
            end --;
        }
    }
    
}
