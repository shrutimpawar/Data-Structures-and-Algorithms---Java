package Pattern;

import java.util.*;

public class HollowDiamond {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt();

        // part 1 - > upper hollow triangle

        for(int i = 1;i<=n;i++){

            for(int sp = 1; sp <= n-i;sp++){

                System.out.print("  ");

            }
            // first row
            if(i == 1){

                System.out.print("* ");
            }
            // middle rows
            else{
                // 1 *
                System.out.print("* ");
                // spaces -> 2*i - 3
                for(int j = 1; j<= 2*i-3;j++){
                    System.out.print("  ");
                }
                // 1*
                System.out.print("* ");
            }

            System.out.println();
        }
        
        // second part

        for(int i = 1; i<= n-1;i++){

            for(int sp = 1; sp <= i;sp++){
                System.out.print("  ");
            }

            if( i== n-1){
                System.out.print("* ");
            }
            else{
                //middle part
                //1*
                System.out.print("* ");
                //spaces -> 2(n-i) - 3
                for(int j = 1;j <= (2*(n-i)-3);j++){

                    System.out.print("  ");
                }
                //1*
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    
}
