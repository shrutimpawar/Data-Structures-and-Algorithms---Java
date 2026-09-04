package Arrays;
import java.util.*;
public class PivotIndex {

    public int pivotIndexReturn(int[] arr){

        int n = arr.length;

        int leftSum[] = new int[n];
        int rightSum[] = new int[n];

        leftSum[0] = arr[0];
        for(int i = 1;i < n;i++){

            leftSum[i] = leftSum[i-1] + arr[i];

        } 

        rightSum[n-1] = arr[n-1];
        for(int i = n-2; i >= 0;i--){

            rightSum[i] = rightSum[i+1] + arr[i];

        }

        for(int i = 0; i <n;i++){

            if(leftSum[i] == rightSum[i]){

                return i;

            }
        }

        return -1;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter Array Elements : ");
        for(int i = 0;i<size;i++){

            arr[i] = sc.nextInt();

        }

        PivotIndex pObj = new PivotIndex();
        int result = pObj.pivotIndexReturn(arr);
        System.out.println("Pivot Index Is : "+ result);

        sc.close();

    }
    
}
