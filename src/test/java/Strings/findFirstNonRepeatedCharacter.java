package Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class findFirstNonRepeatedCharacter {
    public static void main(String[] args) {
        System.out.println("Enter the string here \n");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Map<Character,Integer> map = new LinkedHashMap<>();
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
        for (Map.Entry<Character,Integer>m:map.entrySet())
        {
            if (m.getValue()==1)
            {
                System.out.println(m.getKey());
                break;
            }
        }

    }
}
