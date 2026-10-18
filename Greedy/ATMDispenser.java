import java.util.*;
public class ATMDispenser {

    public static long atmDispenser(int N,long amount,long[] denomination,long[] stock){

        Integer order[] = new Integer[N];

        for(int i = 0; i < N;i++){

            order[i] = i;

        }

        Arrays.sort(order,(a,b) -> Long.compare(denomination[b],denomination[a]));

        long totalNotes = 0;

        for(int i = 0; i < N;i++){

            int index = order[i];

            long use = Math.min(stock[index],amount / denomination[index]);
            amount = amount - use * denomination[index];
            totalNotes = totalNotes + use;

        }

        if(amount == 0){
            return totalNotes;
        }else{
            return -1;
        }
    }

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of denominations:");
        int N = sc.nextInt();

        System.out.println("Enter amount to withdraw:");
        long amount = sc.nextLong();

        long[] denominations = new long[N];
        long[] stock = new long[N];

        System.out.println("Enter denominations:");
        for (int i = 0; i < N; i++) {
            denominations[i] = sc.nextLong();
        }

        System.out.println("Enter available stock for each denomination:");
        for (int i = 0; i < N; i++) {
            stock[i] = sc.nextLong();
        }

        long ans = atmDispenser(N, amount, denominations, stock);

        System.out.println("Minimum notes required: " + ans);

        sc.close();
    }
    
}
