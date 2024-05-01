package javaPrograms;

import java.util.Arrays;

public class p2 {
    public static void main(String[] args) {
        int num[]={1,4,3,5,6};

        Arrays.sort(num);
        for(int j:num)
        {
            if(j!=j+1)
            {
                System.out.println(j+1);
                break;
            }
        }
    }
}
