package Pattern;

import java.util.*;

public class SolidRhombus {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows count : ");
        int n = sc.nextInt();

        for(int i = 1;i <= n;i ++){
            //for each row -> spaces,stars

            // spaces
            for(int sp = 1;sp <= n - i;sp++){

                System.out.print(" ");

            }

                // stars 
            for(int j = 1;j <= n;j++){

                    System.out.print("* ");

            }
                // move to next row 
                System.out.println();
        }

    }
    
}
