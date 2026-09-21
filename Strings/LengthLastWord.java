
package Strings;

import java.util.Scanner;

public class LengthLastWord {

    public static int lengthOfLastWord(String s) {

        int length = 0;
        int i = s.length() - 1;

        // Skip spaces at the end
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count characters of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();

        int result = lengthOfLastWord(s);

        System.out.println("Length of Last Word = " + result);

        sc.close();
    }
}
