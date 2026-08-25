package Arrays;
import java.util.*;

public class EquilibriumIndex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array Elements : ");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int totalSum = 0;

        for(int i = 0; i < n; i++) {
            totalSum = totalSum + arr[i];
        }

        int leftSum = 0;
        boolean found = false;

        for(int i = 0; i < n; i++) {

            int rightSum = totalSum - leftSum - arr[i];

            if(leftSum == rightSum) {

                System.out.println("Equilibrium Index : " + i);

                found = true;
                break;
            }

            leftSum = leftSum + arr[i];
        }

        if(found == false) {
            System.out.println("No Equilibrium Index Found");
        }

        sc.close();
    }
}