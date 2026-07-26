package Pattern.AlphabetsPatterns;

import java.util.*;

public class Pattern1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows : ");
        int n = sc.nextInt();

        for(int i = 1;i <= n;i++){

            for (int j = 1;j<=i;j++){

                int a = j;
                int b = ('A'-1);
                int ans = a+b;
                char finalAns = (char)ans;

                System.out.print(finalAns+ " ");

            }

            System.out.println();
        }
    }
    
}
