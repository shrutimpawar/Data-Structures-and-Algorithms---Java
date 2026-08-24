package Arrays;
import java.util.*;

public class LeadersArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array Elements : ");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Leaders in Array : ");

        for(int i = 0; i < n; i++) {

            boolean leader = true;

            for(int j = i + 1; j < n; j++) {

                if(arr[i] <= arr[j]) {
                    leader = false;
                    break;
                }
            }

            if(leader) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}