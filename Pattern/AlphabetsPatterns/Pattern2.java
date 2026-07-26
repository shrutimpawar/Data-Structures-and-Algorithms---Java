package Pattern.AlphabetsPatterns;

import java.util.*;

public class Pattern2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt();

        for(int i = 1;i<= n;i++){

            for(int j = 1;j <= i;j++){

                int a = n;
                int b = 'A';

                int ans = b + a -j;  // n-col(j) + A 

                char finalAns = (char)ans;

                System.out.print(finalAns + "  ");
            }

            System.out.println();
        }
    }
    
}
