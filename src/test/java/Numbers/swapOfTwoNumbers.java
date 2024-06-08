package Numbers;

import java.util.Scanner;

public class swapOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOne = sc.nextInt();
        int numTwo = sc.nextInt();
        System.out.println("numbers before swap "+numOne+"  "+numTwo);
        int temp ;
        temp=numOne;
        numOne=numTwo;
        numTwo=temp;
        System.out.println("numbers after swap "+numOne+"  "+numTwo);
    }
}
