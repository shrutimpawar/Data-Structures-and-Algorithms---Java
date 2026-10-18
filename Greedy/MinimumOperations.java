import java.util.*;
public class MinimumOperations {

    public static long minOperation(int n,long[] target){

        long pairs = 0;
        long prev = 0;
        long sum = 0;

        for(int i = 0; i < n;i++){

            sum += target[i];

        }

        for(int i = 0; i < n-1;i++){

            long needed = target[i] - prev;
            long x = Math.min(needed,target[i + 1]);

            pairs += x;
            prev = x;

        }

        return sum - pairs;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size o target array : ");
        int n = sc.nextInt();

        long[] target = new long[n];
        System.out.println("Enter Array Elements : ");

        for(int i = 0; i < n;i++){

            target[i] = sc.nextLong();

        }

        long ans = minOperation(n, target);
        System.out.println("Minimum Operations needed to get target : " + ans);

        sc.close();
    }
    
}
