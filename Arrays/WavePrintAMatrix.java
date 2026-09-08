package Arrays;

import java.util.*;

public class WavePrintAMatrix {

    public List<Integer> wavePrint(int[][] arr) {

        List<Integer> result = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;

        for (int col = 0; col < n; col++) {

            // Even column: top to bottom
            if (col % 2 == 0) {

                for (int row = 0; row < m; row++) {
                    result.add(arr[row][col]);
                }

            }
            // Odd column: bottom to top
            else {

                for (int row = m - 1; row >= 0; row--) {
                    result.add(arr[row][col]);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No of rows:");
        int rows = sc.nextInt();

        System.out.println("Enter No of columns:");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter Array Elements:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        WavePrintAMatrix obj = new WavePrintAMatrix();

        List<Integer> result = obj.wavePrint(arr);

        System.out.println("Wave Print:");

        for (int value : result) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}