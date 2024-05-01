package javaProgrammingPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class frequencyCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string here \n");
        String str = sc.next();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(!map.containsKey(ch))
            {
                map.put(ch,1);
            }
            else
            {
                map.put(ch,map.get(ch)+1);
            }
        }
        for(Map.Entry<Character,Integer>m:map.entrySet())
        {
            System.out.println(m.getKey()+":"+m.getValue());
        }
    }
}
