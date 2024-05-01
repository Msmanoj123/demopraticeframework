package javaProgrammingPractice;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        String str = "deekshi";
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        for (char c :arr)
        {
            System.out.print(c+" ");
        }
    }
}
