package Numbers;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int num = sc.nextInt();
        for (int i=2;i<num;i++)
        {
            if (num%i==0)
            {
                flag = false;
            }
        }
        if (flag)
        {
            System.out.println("prime "+num);
        }
        else
        {
            System.out.println("Not prime  "+num);
        }
    }
}
