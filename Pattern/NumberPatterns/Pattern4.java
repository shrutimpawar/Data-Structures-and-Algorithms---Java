package Pattern.NumberPatterns;
import java.util.*;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter no of rows : ");
        int n = sc.nextInt();

        for(int i = 1;i <=n;i++){

            for(int sp = 1;sp <= n-i;sp++){

                System.out.print("  ");
            }

            for(int j = 1;j<=2*i -1;j++){

                System.out.print(i+" ");
            }

            System.out.println();
        }
    
}
    
}
