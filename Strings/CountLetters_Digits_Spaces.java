package Strings;
import java.util.*;
public class CountLetters_Digits_Spaces {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        int lettersCount = 0;
        int digitsCount = 0;
        int spaceCount = 0;


        for(int i = 0; i <str.length();i++){

            char ch = str.charAt(i);

            if(Character.isLetter(ch)){

                lettersCount ++;

            }else if(Character.isDigit(ch)){

                digitsCount ++;

            }else if(Character.isWhitespace(ch)){

                spaceCount ++;

            }else{

            }
        }

        System.out.println("Letters in String :"+lettersCount);
        System.out.println("Digits in String : "+digitsCount);
        System.out.println("White Spaces : "+ spaceCount);

        sc.close();
    }
    
}
