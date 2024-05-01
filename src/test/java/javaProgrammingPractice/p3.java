package javaProgrammingPractice;

public class p3 {
    public static void main(String[] args) {
        //Right angled triangle
        for(int i=1;i<5;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Right angle downward triangle
        for(int i=1;i<5;i++)
        {
            for (int j=4;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        //left Right angle downward triangle
        for(int i=1;i<5;i++)
        {
            for (int j = 3; j >= i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

