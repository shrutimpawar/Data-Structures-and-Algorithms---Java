package Pattern;

import java.util.*;

public class HollowRectangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter No of rows : ");
        int n = sc.nextInt();

        System.out.println("Enter no of columns: ");
        int m= sc.nextInt();

        for(int i = 1;i <= n;i++){

            // for each row -> 6 columns

            for(int j = 1; j <= m;j++){

                if(i == 1 || i == n){

                    System.out.print("* ");

                }
                else{
                    // middle rows
                    if(j ==1){
                        // first column
                        System.out.print("* ");
                    }else if(j == m){
                        // last column
                        System.out.print("* ");
                    }
                    else{
                        //middle columns
                        System.out.print("  ");
                    }
                }

            }

            System.out.println();
        }
    }
}
