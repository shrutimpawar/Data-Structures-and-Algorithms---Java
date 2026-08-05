package Arrays;

import java.util.*;

public class SumTwoDArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows : ");
        int i = sc.nextInt();

        System.out.println("Enter no of columns : ");
        int j = sc.nextInt();

        int arr[][] = new int[i][j];

        System.out.println("Enter Array Elements : ");
        for(i = 0; i< arr.length;i++){

            for(j = 0;j < arr[i].length;j++){

                arr[i][j] = sc.nextInt();

            }
        }

        int sum = 0;
        for(i = 0;i <arr.length;i++){

            for(j = 0;j < arr[i].length;j++){

                System.out.print(arr[i][j]+ " ");
                sum = sum + arr[i][j];

            }

            System.out.println();

        }

        System.out.print("Sum : "+sum);
        
    }
    
}
