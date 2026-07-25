package Pattern;

import java.util.*;

public class SolidRightAngledTriangle {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows : ");
        int n = sc.nextInt();

        for(int i = 1;i <= n;i++){
            // in each row, no of stars = row number
            for(int j = 1;j <= i;j++){

                System.out.print("* ");

            }

            System.out.println();
        }

    }
    
}
