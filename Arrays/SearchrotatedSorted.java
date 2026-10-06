package Arrays;

import java.util.*;

public class SearchrotatedSorted {

    static int search(int[] arr,int key){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            int mid = start + (end - start)/2;

            if(arr[mid] == key){

                return mid;

            }

            if(arr[start] == arr[mid] && arr[mid] == arr[end]){

                start ++;
                end --;
            }
            else if(arr[start] <= arr[mid]){

                if(arr[start] <= key && key < arr[mid]){

                    end = mid - 1;

                }else{

                    start = mid + 1;

                }
            }

            else{

                if(arr[mid] > key && key <= arr[end]){

                    start = mid + 1;

                }else{

                    end = mid - 1;

                }
            }
        }

        return -1;
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
