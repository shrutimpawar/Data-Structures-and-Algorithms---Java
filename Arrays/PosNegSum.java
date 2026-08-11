package Arrays;

import java.util.*;

public class PosNegSum {

    static int[] getPosNegSum(int arr[]){

        int posSum = 0;
        int negSum = 0;

        for(int i = 0; i< arr.length;i++){

            if(arr[i] > 0){
                // i.e if the current element is positive add it to the positive sum;
                posSum += arr[i];

            }
            else{

                // if number is negative add it to the negative sum

                negSum += arr[i];

            }
        }

        int ans[] = {posSum,negSum};
        return ans;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter Array Elements : ");

        for(int i = 0; i< size;i++){
            arr[i] = sc.nextInt();
        }

        int ans[] = getPosNegSum(arr);
        System.out.println("Positive value : "+ans[0]);
        System.out.println("Negative value : "+ ans[1]);

        sc.close();
    }
    
}
