package Numbers;

import java.util.Scanner;

public class largestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int numOne = sc.nextInt();
        System.out.println("Enter second number");
        int numTwo = sc.nextInt();
        System.out.println("Enter third number");
        int numThree = sc.nextInt();
        if (numOne>numTwo & numOne>numThree)
        {
            System.out.println("first number is big");
        } else if (numTwo>numThree & numTwo>numOne)
        {
            System.out.println("second number is big");
        }
        else
        {
            System.out.println("third number is big");
        }
    }
}
