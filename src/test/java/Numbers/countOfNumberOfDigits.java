package Numbers;

import java.util.Scanner;

public class countOfNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();
        int count = 0;
        int sum = 0;
        while (num>0)
        {
            int rem = num % 10;
            sum = rem*rem*rem+sum;
            num = num/10;
            count++;
        }
        System.out.println("Count of numbers in Digit  "+count);
        System.out.println("Count of numbers in String of digit   "+str.length());
    }
}
