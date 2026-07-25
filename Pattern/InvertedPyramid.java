package Pattern;

import java.util.*;

public class InvertedPyramid {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows : ");
        int  n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {

            // for each row - > variable columns

            //spaces

            for (int sp = 1; sp <= i - 1; sp++) {

                System.out.print("  ");
                
            }
            for (int j = 1; j <= 2*n - 2*i +1; j++) {

                System.out.print("* ");
                
            }

            System.out.println();
            
        }
    }
    
}
