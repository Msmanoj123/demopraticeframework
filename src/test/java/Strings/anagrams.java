package Strings;

import java.util.Arrays;

public class anagrams {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 ="silent";
        char[] Ch1 = s1.toCharArray();
        char[] Ch2 = s2.toCharArray();
        Arrays.sort(Ch1);
        Arrays.sort(Ch2);
        if (Arrays.equals(Ch1,Ch2))
        {
            System.out.println("anagrams");
        }
        else
        {
            System.out.println("Not ");
        }
    }
}
