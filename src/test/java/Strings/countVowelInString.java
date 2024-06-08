package Strings;

public class countVowelInString {
    public static void main(String[] args) {
        String str = "iiiihjhjsuudgsdshdhsjdhcyhuwhhsbhjbjhxbudsg";
        int vowelCount = 0;
        for (char ch :str.toCharArray())
        {
            if (ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u')
            {
                vowelCount++;
            }
        }
        System.out.println("count of vowles in string  "+vowelCount);
    }
}
