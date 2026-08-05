package Arrays;

import java.util.*;

public class MulTwoDArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of rows : ");
        int row = sc.nextInt();

        System.out.println("Enter no of columns : ");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];
        System.out.println("Enter Array Elements : ");

        for(row = 0;row < arr.length;row++){

            for(col = 0;col < arr[row].length;col++){

                arr[row][col] = sc.nextInt();

            }
        }

        int mul = 1;

        for(row = 0;row <arr.length;row++){

            for(col = 0;col < arr[row].length;col++){

                System.out.print(arr[row][col]+ " ");

                mul = mul * arr[row][col];

            }

            System.out.println();
        }

        System.out.println("Multiplication of Elements Of Array is :"+mul);

    }
    
}
