package Strings;

import java.util.Scanner;

public class extractLastFourCharacterInString {
    public static void main(String[] args) {
        System.out.println("Enter the string here \n");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.substring(str.length()-4));
    }
}
