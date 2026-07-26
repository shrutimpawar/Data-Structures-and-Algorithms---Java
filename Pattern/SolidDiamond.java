package Pattern;
import java.util.*;
public class SolidDiamond {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows : ");
        int n = sc.nextInt();

        // divide diamond into 2 parts

        // 1) solid pyramid

        for(int i = 1;i <= n;i++){

            for(int sp =1; sp <= n-i;sp++){

                System.out.print("  ");
            }

            for(int j = 1;j <= 2*i -1;j++){

                System.out.print("* ");
            }

            System.out.println();
        }

        // 2) inverted solid pyramid
        
         for (int i = 1; i <=n ; i++) {

            if(i == 1){
                continue;
            }

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

