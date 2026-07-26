package Pattern.NumberPatterns;
import java.util.*;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows : ");
        int n = sc.nextInt();

        for(int i = 1;i <= n;i++){
            
            // part 1 spaces 
            for(int sp = 1; sp <= n-i;sp++){

                System.out.print("  ");

            }

            for(int j = 1;j <= i;j++ ){

                System.out.print(j+ " ");
            }

            int rowValue = i;
            int decRowValue = rowValue - 1;
            for(int j = 1;j <= i-1;j++){
 
                System.out.print(decRowValue + " ");
                decRowValue--;
            }

            System.out.println();
        }

    }
    
}
