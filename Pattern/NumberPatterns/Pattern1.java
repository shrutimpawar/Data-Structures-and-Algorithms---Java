package Pattern.NumberPatterns;

import java.util.*;

public class Pattern1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of rows : ");
        int n = sc.nextInt();

        for(int i =1;i<= n;i++){

            // for each row -> variable columns
            for(int j = 1;j<=i;j++){

                // print value of column 
                System.out.print(j+ "  ");

            }

            // move to nextLine
            System.out.println();
        }
        
    }
    
}
