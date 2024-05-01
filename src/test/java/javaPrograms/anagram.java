package javaPrograms;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String str1="list";
        String str2="istl";
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1,arr2))
        {
            System.out.println("anagrams");
        }
        else
        {
            System.out.println("Not anagrams");
        }
    }
}
