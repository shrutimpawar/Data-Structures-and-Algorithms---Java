package Pattern;
import java.util.*;
public class SpiralStar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter no.of rows : ");
        int rows = sc.nextInt();

        System.out.println("Enter no of columns : ");
        int cols = sc.nextInt();

        char[][] arr = new char[rows][cols];

        // Fill with spaces
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = ' ';
            }
        }

        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;

        while (true) {

            // Top row
            for (int j = left; j <= right; j++) {
                arr[top][j] = '*';
            }
            top += 2;
            if (top > bottom) break;

            // Right column
            for (int i = top - 1; i <= bottom; i++) {
                arr[i][right] = '*';
            }
            right -= 2;
            if (left > right) break;

            // Bottom row
            for (int j = right + 1; j >= left; j--) {
                arr[bottom][j] = '*';
            }
            bottom -= 2;
            if (top > bottom) break;

            // Left column
            for (int i = bottom + 1; i >= top; i--) {
                arr[i][left] = '*';
            }
            left += 2;
            if (left > right) break;
        }

        // Print
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
    

