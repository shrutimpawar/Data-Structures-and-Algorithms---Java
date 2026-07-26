package Pattern;

import java.util.*;

public class ButterflyPattern {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int n = sc.nextInt();

        //Upper part 
        // part 1 -> right angled triangle

        for(int i =1;i <=n;i++){

            for(int j = 1;j <= i;j++){

                System.out.print("* ");
            }

        // part2 -> spaces
        for(int sp = 1;sp <= 2*n - 2*i;sp++){

            System.out.print("  ");
        }

        // part3 -> last triangle

        for(int j = 1;j<=i;j++){
            System.out.print("* ");
        }

        //move to next line
        System.out.println();

        }

        // lower part

        for(int i = 1;i<=n;i++){

            // part1 - >inverted right angled triangle
            for(int j = 1;j<=n-i+1;j++){
                System.out.print("* ");
            }

            // part 2 -> spaces

            for(int sp = 1;sp<= 2*i -2;sp++){

                System.out.print("  ");

            }

            // part 3 -> last triangle

            for(int j = 1;j <= n-i+1;j++){

                System.out.print("* ");
            }

            System.out.println();

        }

    }
    
}
