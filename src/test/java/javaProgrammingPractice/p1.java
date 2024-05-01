package javaProgrammingPractice;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here");
        int num = sc.nextInt();
        int temp=num;
        int sum =0;
        while (num>0)
        {
            int rem = num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        if (temp==sum)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not a palindrome");
        }
    }
}
