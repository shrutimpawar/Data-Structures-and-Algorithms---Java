package Arrays;

public class MaxSuccessfuldays {

    public static int maxConsecutiveDays(int[] arr, int k) {
    int maxDays = 0;
    int start = 0;
    int zerosCount = 0;

    for (int end = 0; end < arr.length; end++) {

        if (arr[end] == 0) {
            zerosCount++;
        }

        while (zerosCount > k) {
            if (arr[start] == 0) {
                zerosCount--;
            }
            start++;
        }

        int currentDays = end - start + 1;

        if (currentDays > maxDays) {
            maxDays = currentDays;
        }
    }

    return maxDays;
}
    
}
