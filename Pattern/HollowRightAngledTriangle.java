package Pattern;

import java.util.*;

public class HollowRightAngledTriangle {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter no of rows : ");
        int n = sc.nextInt();

        for(int i = 1;i <= n;i++){
            // for each row we have variable columns 

            if(i == 1 || i == 2 || i == n){
                
                for(int j = 1; j<=i;j++){

                    System.out.print("* ");
                    
                }
            }

            else{
                // middle rows

                // first print 1 star
                System.out.print("* ");
                // (row-2) spaces
                for(int sp = 1;sp <=(i -2);sp++){
                    System.out.print("  ");
                }
                // last 1 * print
                System.out.print("* ");

            }
            // move to next row
            System.out.println();
        }
    }
    
}
