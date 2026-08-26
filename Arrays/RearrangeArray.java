package Arrays;
import java.util.*;

public class RearrangeArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Sorted Array Elements : ");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result[] = new int[n];

        int start = 0;
        int end = n - 1;
        int index = 0;

        while(start <= end) {

            if(index < n) {
                result[index] = arr[end];
                index++;
                end--;
            }

            if(index < n) {
                result[index] = arr[start];
                index++;
                start++;
            }
        }

        System.out.println("Rearranged Array : ");

        for(int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}