package Arrays;

import java.util.*;

public class BookAllocation {

    static boolean isValid(int[] arr,int k,long maxPages){

        int studentCount = 1;
        long pages = 0;

        for(int i = 0;i < arr.length;i++){

            if(pages + arr[i] <= maxPages){

                pages = pages + arr[i];

            }else{

                studentCount ++;
                if(studentCount > k || arr[i] > maxPages){

                    return  false;

                }
                else{

                    pages = 0;
                    pages = pages + arr[i];

                }
            }
        }

        return true;

    }

    public int findPages(int[] arr,int k){

        if(arr.length < k){
            return -1;
        }

        long start = 0;
        long sum = 0;

        for(int i = 0; i< arr.length;i++){

            sum+= arr[i];

        }

        long end = sum;
        long ans = -1;

        while (start <= end) {

            long mid = start + (end - start)/2;
            
            if(isValid(arr, k, mid)){

                ans = mid;
                end = mid - 1;

            }else{

                start = mid + 1;
            }
        }
        return (int)ans;

    }

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter Array Elements : ");

        for(int i = 0;i <arr.length;i++){

            arr[i] = sc.nextInt();

        }

        System.out.println("Enter number of students : ");
        int k = sc.nextInt();

        BookAllocation obj = new BookAllocation();
        int ans = obj.findPages(arr,k);

        System.out.println("Maximum pages allocated : "+ans);

        sc.close();
    }
    
    
}
