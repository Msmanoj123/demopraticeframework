package Strings;

public class removeSpecialCharcterInString {
    public static void main(String[] args) {
        String str =" 537263797&^%^*#^#%88fggjhsgsfdjgwuit68342698432798yT&^#&(*&#)(&";
        StringBuilder s = new StringBuilder();
        for (char ch :str.toCharArray())
        {
            if (Character.isDigit(ch) || Character.isAlphabetic(ch))
            {
                s.append(ch);
            }
        }
        System.out.println(s);
    }
}
