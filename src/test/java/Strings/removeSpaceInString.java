package Strings;

public class removeSpaceInString {
    public static void main(String[] args) {
        String str = " man pj oj ojkkl ";
        StringBuilder str1 = new StringBuilder();
        System.out.println(str.replace(" ",""));
        for (char ch : str.toCharArray())
        {
            if (ch!=' ')
            {
                str1.append(ch);
            }
        }
        System.out.println(str1);

    }
}
