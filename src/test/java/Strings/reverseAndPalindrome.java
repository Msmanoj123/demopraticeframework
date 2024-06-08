package Strings;

import java.util.Scanner;

public class reverseAndPalindrome {
    public static void main(String[] args) {
        System.out.println("Enter the String\n");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        reverseMethod(str);
        checkPalindrome(str);
    }
    public static void reverseMethod(String str)
    {
        StringBuilder s = new StringBuilder();
        for (int i=str.length()-1;i>=0;i--)
        {
            char ch = str.charAt(i);
            s.append(ch);
        }
        System.out.println(s);
        if (str.equals(s.toString()))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
    public static void checkPalindrome(String str)
    {
        boolean flag = true;
        for (int i=0;i<str.length();i++)
        {
            if (str.charAt(i)==str.charAt(str.length()-1))
            {
                flag = false;
            }
        }
        if (flag==false)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
}
