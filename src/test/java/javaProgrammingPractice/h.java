package javaProgrammingPractice;

import java.util.*;

public class h {
    public static void main(String[] args) {
        int [] nums = {3,2,4,4,2};
        int target = 6;
        int [] output = new int[2];
        for (int i=0;i<nums.length;i++)
        {
            for (int j=1;j<nums.length;j++)
            {
                if (nums[i]+nums[j]==target)
                {
                    output[0]=i;
                    output[1]=j;
                    break;
                }
            }
        }
        System.out.println(output[0]+"   "+output[1]);
    }
}
