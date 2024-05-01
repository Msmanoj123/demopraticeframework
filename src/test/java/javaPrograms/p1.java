package javaPrograms;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s1="";
        StringBuilder builder = new StringBuilder();
        for (int i=str.length()-1;i>=0;i--)
        {
            s1=s1 + str.charAt(i);
            builder.append(str.charAt(i));
        }
        System.out.println(builder.toString());
        if (s1.equals(str) & builder.toString().equals(str))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
}
