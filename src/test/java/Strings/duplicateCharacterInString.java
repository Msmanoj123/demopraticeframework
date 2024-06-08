package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class duplicateCharacterInString {
    public static void main(String[] args) {
        System.out.println("Enter the string here \n");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder str1 = new StringBuilder();
        Map<Character,Integer> map = new HashMap<>();
        for (int i=0 ;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if (map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
        }
        System.out.println("duplicate characters");
        for (Map.Entry<Character,Integer>m:map.entrySet())
        {
            if (m.getValue()>1)
            {
                System.out.println(m.getKey());
            }
            if (m.getValue()<2)
            {
                str1.append(m.getKey());
            }
        }
        System.out.println("string we entered  "+str);
        System.out.println("string without duplicates  "+str1);
    }
}
