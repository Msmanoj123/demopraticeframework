package Numbers;

import java.util.Scanner;

public class numberPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while (num>0)
        {
            int rem = num%10;
            sum = sum*10+rem;
            num = num/10;
        }
        System.out.println("reverse number is "+sum);
        if (sum==temp)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
