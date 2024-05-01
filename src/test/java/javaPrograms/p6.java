package javaPrograms;

public class p6 {
    //0,1,1,2,3,5,8,13
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.print(a+" "+b);
        for (int i=0;i<10;i++)
        {
            int c = a + b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
