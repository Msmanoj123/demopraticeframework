package Numbers;

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int number = num;
        int evenCount = 0;
        int oddCount = 0;
        while (num >0)
        {
            int rem = num%10;
            if (rem%2==0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
            num=num/10;
        }
        System.out.println("count of even numbers in digit  "+evenCount);
        System.out.println("count of odd numbers in digit   "+oddCount);
    }
}
