package Pattern;
import java.util.*;
public class InvertedRightTriangle {

    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter no of rows: ");
        int n = sc.nextInt();

        for(int i = 1;i <=n;i++){

            //for each row - > columns = Total no of rows - current row + 1

            for(int j = 1; j <= n-i+1;j++){

                System.out.print("* ");

            }

            // move to next row
            System.out.println();
        }
        

    }
    
}
