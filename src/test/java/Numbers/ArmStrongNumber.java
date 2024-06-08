package Numbers;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while (num>0)
        {
            int rem = num % 10;
            sum = rem*rem*rem+sum;
            num = num/10;
        }
        if (sum==num)
        {
            System.out.println("Armstrongnumber");
        }
        else
        {
            System.out.println("Not ArmStrongNumber");
        }
    }
}
