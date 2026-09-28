package Strings;

import java.util.*;

public class CharacterFreq {

    static void charFreq(String str){

        HashMap <Character,Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()){

            map.put(ch,map.getOrDefault(ch,0)+1);

        }

        for(char ch : map.keySet()){

            System.out.println(ch +" -> "+map.get(ch));
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sc.nextLine();

        charFreq(str);

        sc.close();
    }
    
}
