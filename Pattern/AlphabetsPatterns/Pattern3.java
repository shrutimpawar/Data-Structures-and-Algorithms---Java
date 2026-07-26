package Pattern.AlphabetsPatterns;
import java.util.*;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of rows : ");
        int n = sc.nextInt();

        for(int i = 1;i<=n;i++){

            // part1 -> spaces 
            for(int sp = 1;sp <= n-i;sp++){

                System.out.print("  ");

            }

            // part 2 -> triangle 1

            for(int j = 1;j<= i;j++){

                int a = j;
                int b = 'A' - 1;
                int ans = a+b;
                char finalAns = (char)ans;

                System.out.print(finalAns + " ");
            }

            // part 3 -> triangle 2 

            char finalAns = (char)(i + 'A'-2);
            for(int j=1;j<=i-1;j++){

                System.out.print(finalAns +" ");
                finalAns--;
            }

            System.out.println();
        }
    }
    
}
