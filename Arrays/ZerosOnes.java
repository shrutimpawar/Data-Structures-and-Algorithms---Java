package Arrays;
import java.util.*;

public class ZerosOnes {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter Array Elements : ");
        for(int i = 0;i <size;i++){

            arr[i] = sc.nextInt();

        }

        int start = 0;
        int end = size-1;

        while(start <end ){

            if(arr[start] == 1 && arr[end] == 0){

                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start ++;
                end--;

            }

            if(arr[start] == 0){
                start ++;
            }
            if(arr[end] == 1){
                end --;
            }
        }

        System.out.println("Sorted Array  : ");
        for(int i = 0;i < size;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
