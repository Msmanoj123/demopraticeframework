package javaPrograms;

public class p4 {
    public static void main(String[] args) {
        int a=2;
        int b=1;
        System.out.println(a+"   "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+"   "+b);

        System.out.println("with third variables");
        int a1=9;
        int b1=4;
        int temp=a1;
        a1=b1;
        b1=temp;
        System.out.println(a1+"   "+b1);
    }
}
