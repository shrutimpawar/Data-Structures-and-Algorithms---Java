package Arrays;
import java.util.*;
public class SumEachCol2DArray {

    public List<Integer> colSum(int [][]arr){

        List<Integer> result = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;

        for(int col = 0;col<n;col ++){

            int sum = 0;

            for(int row = 0;row<m;row++){

                int val = arr[row][col];
                sum += val;

            }

            result.add(sum);

        }

        return result;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No of rows : ");
        int size1 = sc.nextInt();

        System.out.println("Enter no of columns : ");
        int size2 = sc.nextInt();

        int arr[][] = new int[size1][size2];

        System.out.println("Enter Array Elements :");

        for(int i = 0;i<size1;i++){

            for(int j = 0;j <size2;j++){

                arr[i][j] = sc.nextInt();

            }
        }

        SumEachCol2DArray obj = new SumEachCol2DArray();

        List<Integer> result = obj.colSum(arr);

        System.out.println("Each column sum : " + result);

        sc.close();
        
    }

    
    
}
