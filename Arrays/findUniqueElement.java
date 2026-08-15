package Arrays;
import java.util.*;
public class findUniqueElement {

    public int uniqueElements(int nums[]){

        int xorSum = 0;

        for(int num : nums){

            xorSum = xorSum ^ num;

        }

        return xorSum;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter Array Elements: ");

        for(int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        findUniqueElement obj = new findUniqueElement();
        int result = obj.uniqueElements(arr);
        System.out.print("Unique Element is: "+ result);
    }
    
}
