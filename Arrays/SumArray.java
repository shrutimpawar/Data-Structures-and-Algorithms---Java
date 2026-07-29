package Arrays;
import java.util.*;
public class SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter Array Elements : ");
        for(int i = 0; i< size;i++){

            arr[i]= sc.nextInt();

        }

        int sum = 0;

        for(int i = 0;i<size;i++){

            sum += arr[i];
        }

        System.out.println("Sum of Array Elements is : "+sum);
        
    }
    
}
