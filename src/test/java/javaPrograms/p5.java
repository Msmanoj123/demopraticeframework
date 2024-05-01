package javaPrograms;

import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag=true;
        for(int i=2;i<num;i++)
        {
            if (num%i==0)
            {
                flag=false;
                break;
            }
        }
        if (flag==false)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
    }
}
