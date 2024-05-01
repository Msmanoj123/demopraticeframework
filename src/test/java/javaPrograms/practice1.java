package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class practice1 {
    public static void main(String[] args) {
        String []arr={"baseball","a,all,b,ball,base,bas,cat,code,d,e,quit,z"};
        String str1=arr[0];
        String str2=arr[1];
        String str3 = str1.substring(4);
        System.out.println(str3);
        String str4=str1.substring(0,4);
        String[] arr1 = str2.split(",");
        for (int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
            if(arr1[i]==str3)
            {
                System.out.println(arr1[i]);
                System.out.println(str3);
            } else if (arr1[i]==str4) {
                System.out.println(str4);
            }
        }
    }
}
