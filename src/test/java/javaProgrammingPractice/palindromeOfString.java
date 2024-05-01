package javaProgrammingPractice;

import java.util.Random;

public class palindromeOfString {
    static int primeNumbers(int num1)
    {
        int num = num1;
        boolean isPrime = true;
        for (int i = 2; i < num; i++)
        {
            if (num%i==0)
            {
                isPrime = false;
                break;
            }
        }
        if (isPrime==true)
        {
            System.out.println("prime");
            return num;

        }
        else
        {
            System.out.println("not prime");
        }
        return num;
    }
    public static void main(String[] args) {
        for (int i=1;i<25;i++)
        {
            System.out.println(primeNumbers(i));
        }

    }


}
