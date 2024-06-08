package Numbers;

import java.util.Scanner;

public class sumOfDigitInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0)
        {
            int rem = num % 10;
            sum = sum + rem;
            num = num/10;
        }
        System.out.println("sum of numbers in digit = "+sum);
    }
}
