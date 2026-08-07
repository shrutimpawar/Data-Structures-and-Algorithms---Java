package Arrays;

import java.util.*;

public class ZerosOnesCount {

    static int[] getZerosOnesCount(int arr[]){

        int ZerosCount = 0;
        int OnesCount = 0;

        for(int i = 0;i < arr.length;i++){

            if(arr[i] == 0){

                ZerosCount ++;

            }
            else{

                OnesCount ++;
            }
        }

        int ans[] = {ZerosCount,OnesCount};
        return ans;
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

        int ans[] = getZerosOnesCount(arr);
        System.out.println("Zeros Count is : "+ ans[0]);
        System.out.println("One's Count is : "+ ans[1]);

        sc.close();
    }
    
}
