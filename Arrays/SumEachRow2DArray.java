package Arrays;

import java.util.*;

public class SumEachRow2DArray {

    public List<Integer> rowSum(int[][] arr){

        List<Integer> result = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;

        for(int row = 0;row < m;row++){

            int sum = 0;

            for(int col = 0;col < n;col++){

                int val = arr[row][col];
                sum += val;

            }

            result.add(sum);

        }

        return result;

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No of Rows :");
        int size1 = sc.nextInt();

        System.out.println("Enter No of columns : ");
        int size2 = sc.nextInt();

        int arr[][] = new int[size1][size2];

        System.out.println("Enter Array Elements: ");

        for(int i = 0; i<size1;i++){

            for(int j = 0;j<size2;j++){

                arr[i][j] = sc.nextInt();

            }
        }

        SumEachRow2DArray obj = new SumEachRow2DArray();

        List<Integer> result = obj.rowSum(arr);

        System.out.println("Sum of Ecah Row:" + result);

        sc.close();
        
    }
    
}
