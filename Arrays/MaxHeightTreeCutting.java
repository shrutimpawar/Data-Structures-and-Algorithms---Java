package Arrays;
import java.util.*;
public class MaxHeightTreeCutting {

    static boolean isValid(int[] trees,int m ,long maxHeight){

        long totalWoodCollected = 0;

        for(int i = 0; i < trees.length;i++){

            if(trees[i] > maxHeight){

                long currentWood = trees[i] - maxHeight;
                totalWoodCollected += currentWood;
            }
        }

        if(totalWoodCollected >= m){

            return true;

        }else{

            return false;

        }
    }

    public int maxHeight(int[] arr,int m){

        int n = arr.length;
        long start = 0;
        long max = 0;
        long ans = -1;

        for(int i = 0 ;i < n;i++){

            if(arr[i] > max){

                max = arr[i];

            }
        }

        long end = max;

        while(start <= end){

            long mid = start + (end - start)/2;

            if(isValid(arr, m, mid)){

                ans = mid;
                start = mid + 1;

            }else{

                end = mid -1;

            }
        }

        return (int)ans;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = sc.nextInt();

        int[] arr= new int[size];
        System.out.println("Enter Array Elements : ");
        for(int i = 0; i < size;i++){

            arr[i] = sc.nextInt();

        }

        System.out.println("Enter the amount of wood needed : ");
        int m = sc.nextInt();

        MaxHeightTreeCutting H = new MaxHeightTreeCutting();
        System.out.println("Maximum Height wood Cut : "+ H.maxHeight(arr,m));

        sc.close();
    }
    
}
