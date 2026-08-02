package Arrays;
import java.util.*;
public class MultiplicationArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter Array Elements : ");
        for(int i =0;i <n;i++){

            arr[i] = sc.nextInt();

        }

        int mul = 1;

        for(int i = 0;i <n;i++){

            mul = mul * arr[i];

        }

        System.out.println("Multiplication of all the elements of an array is :" +mul );

    }
    
}
