package Arrays;
import java.util.*;

public class Sort012 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array Elements : ");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int mid = 0;
        int end = n - 1;

        while(mid <= end) {

            if(arr[mid] == 0) {

                int temp = arr[start];
                arr[start] = arr[mid];
                arr[mid] = temp;

                start++;
                mid++;
            }

            else if(arr[mid] == 1) {
                mid++;
            }

            else {

                int temp = arr[mid];
                arr[mid] = arr[end];
                arr[end] = temp;

                end--;
            }
        }

        System.out.println("Sorted Array : ");

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}