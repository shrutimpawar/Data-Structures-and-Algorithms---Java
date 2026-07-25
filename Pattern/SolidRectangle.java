package Pattern;
import java.util.*;
public class SolidRectangle {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows : ");
        int n = sc.nextInt();

        System.out.println("Enter no of columns : ");
        int m = sc.nextInt();
        
        for(int i = 1;i <=n;i++){
            // for each row -> 5 col
            for(int j = 1;j <= m;j++){
                // star
                System.out.print("* ");
            }
            //nextline after each row
            System.out.println();
        }
    }
    
}
