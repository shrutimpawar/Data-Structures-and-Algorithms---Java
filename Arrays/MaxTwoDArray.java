package Arrays;

import java.util.*;

public class MaxTwoDArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows : ");
        int row = sc.nextInt();

        System.out.println("Enter no of columns : ");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];
        System.out.println("Enter Array Elements :");

        for(row = 0;row < arr.length;row++){

            for(col = 0;col <arr[row].length;col++){

                arr[row][col] = sc.nextInt();

            }
        }

        int maxElement = arr[0][0];

        System.out.println("2D Array : ");
        for(row = 0;row<arr.length;row++){

            for(col = 0;col <arr[row].length;col++){

                if(arr[row][col] > maxElement){

                    maxElement = arr[row][col];

                }

                System.out.print(arr[row][col]+ " ");

            }

            System.out.println();
        }

        System.out.println("Max Element of an array is : "+maxElement);
    }
    
}
