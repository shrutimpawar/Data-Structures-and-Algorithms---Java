package Arrays;

import java.util.Scanner;

public class PositiveNegativeZero {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Array Size : ");
        int n=sc.nextInt();


        int arr[]=new int[n];

        int positive=0;
        int negative=0;
        int zero=0;

        System.out.println("Enter Array Elements : ");
        for(int i=0;i<n;i++){

            arr[i]=sc.nextInt();

            if(arr[i]>0)
                positive++;
            else if(arr[i]<0)
                negative++;
            else
                zero++;
        }

        System.out.println("Positive = "+positive);
        System.out.println("Negative = "+negative);
        System.out.println("Zero = "+zero);
    }
}