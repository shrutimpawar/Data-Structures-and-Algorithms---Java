package Pattern;

import java.util.*;

public class SolidPyramid {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows : ");
        int n = sc.nextInt();

        for(int i = 1;i <= n;i++){

            //for each row -> spaces,stars(variable columns)

            // spaces

            for(int sp = 1;sp<= n-i;sp++){

                System.out.print("  ");

            }
            // stars 

            for(int j = 1; j<= 2 * i-1;j++){

                System.out.print("* ");

            }
            
            System.out.println();
        }
    }
    
}
