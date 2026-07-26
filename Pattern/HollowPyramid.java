package Pattern;
import java.util.*;
public class HollowPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();

        for(int i = 1; i<=n;i++){

            //for each row ->  variable column
            //part1 
            for(int sp = 1; sp<= n- i;sp++){

                System.out.print("  ");
            }

            //part2

            if(i == 1 || i == n){

                for(int j = 1;j <= 2*i -1;j++){

                System.out.print("* ");

                }
            }
            else{
                // middle rows
                //1*
                System.out.print("* ");
                // spaces
                for(int sp = 1; sp <= 2*i - 3;sp++ ){
                    System.out.print("  ");
                }
                //1*
                System.out.print("* ");
            }
            // move to next row
            System.out.println();
        }
    }
    
}
